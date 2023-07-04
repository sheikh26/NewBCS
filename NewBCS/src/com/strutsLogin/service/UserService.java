package com.strutsLogin.service;


import java.util.Iterator;
import java.util.List;

 
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


import com.strutsLogin.UserException.UserNotFoundException;
import com.strutsLogin.dto.UserDTO;

import com.strutsLogin.util.HibernateUtil;
import org.apache.log4j.*;


public class UserService
{
//	public static void AddUserDTO(UserDTO dto)throws Exception
//	{
//		//AddUserDTO method name declare UserDTO with object
//		System.out.println("Hi in )))))))))))))))))))))))))))))))))))  user service");
//	// create session factory for working with Hibernate	
//		SessionFactory session=new Configuration().configure().buildSessionFactory();
//	
//		Session s=session.openSession();
//		
//		//open session 
//		Transaction tx =s.beginTransaction();
//		
//		//begin transaction
//		s.save(dto);
//		tx.commit();   
//		s.close();
//		
//	}
	private static Logger logger =Logger.getLogger(UserService.class);
	public static  UserDTO authenticate(UserDTO dto)throws UserNotFoundException
	{
		//create authenticate method for check user name and password
		logger.error("---------------------------Checking for login------------------------------");
		Session session = HibernateUtil.currentSession();
		logger.error("In Userservice session created");
		//Session s = sessionFactory.openSession();
		try {
			System.out.println("----------------------------Here values of dto are ="+dto);
			logger.error("Query gong to create");
			Query q =session.createQuery("from UserDTO where name=? and password=?");
				q.setString(0,dto.getName());
				q.setString(1,dto.getPassword());
				//create Query same as servlet 
				//q.setInteger(0, dto.getId());
				/*q.setString(0,dto.getName());
				q.setString(1,dto.getPassword());*/
			
				logger.error("name ="+dto.getName());
				logger.error("password="+dto.getPassword());
				
				List list= (List) q.list();
				//using List of collection framework
				Iterator it=list.iterator();
				logger.error("print------------"+list.size());
				
				if (it.hasNext()) {
					dto = (UserDTO) it.next();
					System.out.println("Check---------"+dto.getId());
				}
				else {
					logger.error("Exception in userservice");
					throw new UserNotFoundException("login.invalid.user");
				}
				HibernateUtil.closeSession();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	     return dto;
		
	}
	
//	public UserDTO authenticate(UserDTO userDto) throws UserNotFoundException {
//
//		Session session = HibernateUtil.currentSession();
//		PasswordService pwd = PasswordService.getInstance();
//
//
//
//		Query q;
//		String pwdOne=null;
//		try {
//			String password=userDto.getPassword();
//			//System.out.println("check Password"+password);
//
//			try {
//				pwdOne=pwd.encrypt(password);
//
//				//System.out.println("Encrypted"+pwdOne);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			q = session
//					.createQuery("from UserDTO where  userId =? and password ='"+pwdOne+"' and isActive='Y'and orgId.isactive='Y'");
//
//
//			q.setString(0, userDto.getUserId());
//
//			//System.out.println("+++++++++++++++++++++++++++++++++++sharad yadav"+userDto.getUserId());
//			//q.setString(1, password);
//			// q.setString(2, userDto.getIsActive());
//
//			List list = q.list();
//			//System.out.println("+++++++++++++++++++++++++++++++++++sharad yadav"+list.size());
//			Iterator it = list.iterator();
//
//			if (it.hasNext()) {
//
//				userDto = (UserDTO) it.next();
////				System.out
////						.println("--------------------------------------------"
////								+ userDto.getUserRoleId().getUserRoleDesc());
//			} else {
//
//				throw new UserNotFoundException("login.invalid.user");
//			}
//
//			HibernateUtil.closeSession();
//		} catch (HibernateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return userDto;
//	}
	
}



