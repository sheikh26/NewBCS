

package com.strutsLogin.util;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *  @(#)HibernateUtil.java
 *  This Class provides the method for managing Session and ConnectionFactory.
 *  author	    version      date	     change     description
 *  Vikas    0.1                       Class Created
 */
public class HibernateUtil
{
	// sessionFactory is a variable that store object of SessionFactory.
	public static final SessionFactory sessionFactory;
	private static final Logger logger = Logger.getLogger(HibernateUtil.class);

	static {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			System.out.println("++++++++++++++++++ Loading Session Factory+++++++++++++++++++++");
			System.out.println("Edited by aamir");
			logger.error("Here initializing the sesn factory");
			
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			
			System.out.println("++++++++++++++++++ Loading Session Factory+++++++sessionFactory++++++++++++++" +sessionFactory);
			if(logger.isDebugEnabled())logger.debug("Reads the Hibernate.cfg.xml Successfully");
			
			logger.error("After the reading of hibrnt cfg file in hibernate util");
		} catch (Exception ex)
		{
			logger.error(" hibernate util it is a  catch blk of hibernateutil");
			// Make sure you log the exception, as it might be swallowed
			ex.printStackTrace();
			
			logger.error("the error ======="+ex);
			throw new ExceptionInInitializerError(ex);
		}
		 catch (Throwable ex)
			{
				// Make sure you log the exception, as it might be swallowed
			 logger.error(" In catch ");
			 	ex.printStackTrace();
				logger.error("In HibenateUtil class"+ex);
				throw new ExceptionInInitializerError(ex);
			}
			
	}

	public static final ThreadLocal<Session> session = new ThreadLocal<Session>();
    /**
     * This method provides session to user.
     * @return-Session-   it's return session object.
     * @throws-HibernateException-it's throws exception if error occuer's during Session open.
     */
	public static Session currentSession() throws HibernateException
	{
		Session sess = (Session) session.get();
		// Open a new Session, if this thread has none yet
		if (sess == null) {
			sess = sessionFactory.openSession();
			// Store it in the ThreadLocal variable
			session.set(sess);
		}
		return sess;
	}
    /*
     * This Method Close the session.
     * @throws-HibernateException-it's throws exception if error occuer's during Session close.
     */
	public static void closeSession() throws HibernateException
	{
		Session s = (Session) session.get();
		if (s != null)
			s.close();
		session.set(null);
	}

}
