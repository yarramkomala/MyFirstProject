package com.niit.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.domain.UserInfo;
import com.niit.dao.UserDao;
@Repository
public class UserDaoImpl implements UserDao{
	 @Autowired
	 SessionFactory session;
	
	 
	 
	@Override
	public void insertRow(UserInfo userinfo) {
	session.getCurrentSession().save(userinfo);
		
	}
//	@Override
//	public void updateRow(UserInfo userinfo) {
//		
//		
//	}
//	@Override
//	public void deleteRow(String username) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public List getList() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public UserInfo getRowById(String username) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
}



