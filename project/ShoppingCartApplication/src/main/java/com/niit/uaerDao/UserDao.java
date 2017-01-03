package com.niit.uaerDao;

import java.util.List;

import com.niit.domain.UserInfo;

public class UserDao {
	public boolean isValidCredentials(String email,String pwd){
		System.out.print("local");
		if(email.equals("komali@gmail.com")&& pwd.equals("abc12")){
			
			return true;
		
			
		}
		return false;

}
//	public int insertRow(UserInfo userinfo);
//
//	 public List getList();
//
//	 public UserInfo getRowById(String username);
//
//	 public int updateRow(UserInfo userinfo);
//
//	 public int deleteRow(String username);

}
