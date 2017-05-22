package com.akash.customerapp.util;

import org.hibernate.id.IdentifierGenerator;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
public class MyIdGenerator implements IdentifierGenerator 
{
	private static String QUERY="SELECT TEST_SEQUENCE.NEXTVAL FROM DUAL";
	@Override
	public Serializable generate(SessionImplementor si, Object obj) throws HibernateException {
		String str=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
		con=si.connection();
		st=con.createStatement();
		rs=st.executeQuery(QUERY);
		rs.next();
		int i=rs.getInt(1);
		if(i<=9){
		str="CUST00"+i;
		}
		else if(i>9 && i<=99){
		str="CUST0"+i;
		}
		else {
		str="CUST"+i;
		}
		rs.close();
		st.close();
		con.close();
		}//try
		catch(Exception e){
		System.out.println(e);
		}
		return str;
	}
}
