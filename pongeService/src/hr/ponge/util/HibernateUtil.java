package hr.ponge.util;

import hr.ponge.pfa.PfaException;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Utility class for handling Hibernate session/transaction
 * 
 * @author Krunoslav Samardzic
 * 
 */
public class HibernateUtil {

	private static final Logger log = Logger.getLogger(HibernateUtil.class);

	private static SessionFactory sessionFactory;

	public static final String HIBERNATE_CFG = "hibernate.cfg.xml";

	public static final ThreadLocal<Session> threadSession = new ThreadLocal<Session>();

	public static final ThreadLocal<Transaction> threadTransaction = new ThreadLocal<Transaction>();

	public static final ThreadLocal<String> transactionOwner = new ThreadLocal<String>();

	public static void buildSessionFactory() {

		try {
			log.info("BUILD SESSION FACTORY");
			Configuration c = new Configuration();
			c.configure(HIBERNATE_CFG);

			ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder()
					.applySettings(c.getProperties());

			sessionFactory = c.buildSessionFactory(serviceRegistryBuilder
					.buildServiceRegistry());

		} catch (Throwable ex) {
			log.error("ERROR", ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();

	}

	public Session getSession() throws PfaException {
		try {
			Session s = threadSession.get();

			if (s == null || !s.isOpen()) {
				s = HibernateUtil.getSessionFactory().openSession();

				HibernateUtil.threadSession.set(s);

			}

			return s;

		} catch (Exception e) {
			log.error("ERROR", e);
			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}
	}

	public boolean beginTransaction() throws PfaException {
		try {
			Transaction tx = threadTransaction.get();

			if (tx == null) {
				tx = getSession().beginTransaction();
				threadTransaction.set(tx);
				return true;
			}
			return false;
		} catch (PfaException e) {
			throw e;

		} catch (Exception e) {
			log.error("ERROR", e);
			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}

	}

	public void commitTransaction() throws PfaException {
		try {
			Transaction tx = threadTransaction.get();

			if (tx != null && !tx.wasCommitted() && !tx.wasRolledBack()) {
				tx.commit();

			}
			threadTransaction.set(null);

		} catch (Exception e) {
			log.error("ERROR", e);
			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}

	}

	public void closeSession() throws PfaException {
		try {
			Session s = threadSession.get();
			threadSession.set(null);
			if (threadTransaction.get() != null) {
				rollbackTransaction();
			}
			if (s != null && s.isOpen()) {

				s.close();

			}
		} catch (PfaException e) {
			throw e;

		} catch (Exception e) {
			log.error("ERROR", e);
			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}
	}

	public void rollbackTransaction() throws PfaException {
		try {
			Transaction tx = threadTransaction.get();
			try {
				threadTransaction.set(null);
				if (tx != null && !tx.wasCommitted() && !tx.wasRolledBack()) {
					tx.rollback();
				}

			} finally {
				closeSession();
			}
		} catch (PfaException e) {
			throw e;

		} catch (Exception e) {
			log.error("ERROR", e);
			throw new PfaException(PfaException.PERSISTENCE_ERROR,
					e.getMessage(), e);
		}
	}

	public static boolean hasActiveTransactions() {
		final String method = "hasActiveTransactions()";
		log.debug("ENTER " + method);
		try {
			if (threadTransaction.get() != null) {
				log.debug(method + " ACTIVE TRANSACTION");
				return true;
			}

			return false;
		} finally {
			log.debug("EXIT " + method);
		}
	}

	public static boolean hasActiveSessions() {
		final String method = "hasActiveSessions()";
		log.debug("ENTER " + method);
		try {
			if (threadSession.get() != null) {
				log.debug(method + " ACTIVE  SESSIONS");
				return true;
			}

			return false;
		} finally {
			log.debug("EXIT " + method);
		}
	}

}
