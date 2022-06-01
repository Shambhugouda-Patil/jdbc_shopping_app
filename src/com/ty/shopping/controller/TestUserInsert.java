package com.ty.shopping.controller;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class TestUserInsert {
	public static void main(String[] args) {
		
		User user=new User();
		user.setId(3);
		user.setName("shambhu");
		user.setEmail("shambhu@123");
		user.setPassword("shambhu123");
		user.setMobile(234567890);
		
		UserDao dao=new UserDao();
		int res=dao.saveUser(user);
		
		if(res>0) {
			System.out.println("data inserted");
		}else {
			System.out.println("no data inserted");
		}
	}

}
