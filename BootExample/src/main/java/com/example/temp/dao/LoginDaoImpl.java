package com.example.temp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.temp.model.LoginModel;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	public boolean checkLogin(LoginModel loginModel) {
		// TODO Auto-generated method stub

		System.out.println("Value email: "+loginModel.getEmail());
		boolean userPresent = false;
		String SQL_QUERY = " from UserModel as o where o.email=? and o.password=? and o.userType=?";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(SQL_QUERY);
		/*List newList = query.list();
		System.out.println("List size: "+newList.size());*/
		
		query.setParameter(0, loginModel.getEmail());
		query.setParameter(1, loginModel.getPassword());
		query.setParameter(2, loginModel.getUserType());
		List list = query.list();
		System.out.println("List size: "+list.size());
		if (list != null && list.size() > 0) {
			userPresent = true;
		}

		return userPresent;
	}

}
