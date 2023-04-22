package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import model.User;

public class UserDao {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	
	private void getConnect()
	{
		  cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		  
		 
		  factory= cfg.buildSessionFactory();
		   session = factory.openSession();
		 
		 tx = session.beginTransaction();
	}
	public String insert( User u)
	{
		getConnect();
		 
		 session.save(u);
		 tx.commit();
		 System.out.println("user inserted successfully.....!!");
		 
		 endConnect();
		return "data inserted";
	}
	public boolean deleteUser(String d)
	{
		getConnect();
		Query q=session.createQuery("delete from User where id ="+d);  
		
		int var=q.executeUpdate(); 
		if(var>0){
			endConnect();
		return true;
		}
		else {
			endConnect();
			return false;}
	}
	
	public String updateUser(User u)
	{
		getConnect();
		Query q=session.createQuery("update User set fullname=:n where id=:i");  
		q.setParameter("n",u.getName());  
		q.setParameter("i",u.getId());  
		  System.out.println(u.getName());
		int status=q.executeUpdate();  
		 tx.commit();
		 System.out.println("data updated successfully.....!!");
		endConnect();
		
		return "user updated";
	}
	
	public User userSearch(String i){
		getConnect();
		Query q=session.createQuery(" from User where id ='"+i+"'");
		List<User> ls=q.list();
		User u= ls.get(0);
		endConnect();
		return u;
		
	}
	public  List<User> retrieveData()
	{
		getConnect();
		Query q=session.createQuery("from User");
		
		List<User> ls=q.list();
		endConnect();
		
		return ls;
	}
	private void endConnect()
	{
		
		 session.close();
		 factory.close();
	}
}
