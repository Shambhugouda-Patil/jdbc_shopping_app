package com.ty.shopping.controller;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class TestAuthentication 
{
public static void main(String[] args) {
	
	User user=new User();
		UserDao dao=new UserDao();
		User res=dao.validateUser("shambhu@123", "syp123");
		 
			if(res!=null)
			{
				System.out.println("user id"+user.getId());
				System.out.println("user name"+user.getName());
				System.out.println("user email"+user.getEmail());
				System.out.println("user password"+user.getPassword());
			}
			else
			{
				System.out.println("user not exist");
			}
}
}
