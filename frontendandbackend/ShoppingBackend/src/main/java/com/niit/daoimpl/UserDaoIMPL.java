package com.niit.daoimpl;

import com.niit.dao.UserDAO;

public class UserDaoIMPL implements UserDAO {

	public boolean isValidCredentials(String uname, String pswd) {
		// TODO Auto-generated method stub
		if(uname.equals("komali@gmail.com")&& pswd.equals("abc12")){
		return true;	
			
		}
		else{
		return false;
		}
	}

}
