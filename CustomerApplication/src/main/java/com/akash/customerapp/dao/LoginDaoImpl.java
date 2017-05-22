package com.akash.customerapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private JdbcTemplate jt;
	private static final String query="SELECT COUNT(*) FROM LOGIN WHERE USERNAME=? AND PASSWORD=?";
	private boolean flag;
	public boolean checkUser(String uname,String pass) {
		int i=(Integer)jt.queryForObject(query, Integer.class,uname,pass);
		if(i==1)
			flag=true;
		else
			flag=false;
		return flag;
	}

}
