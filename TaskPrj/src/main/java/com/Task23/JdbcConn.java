package com.Task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConn {
	public static void main(String[] args) {
		
		//Database connection
		
		String db_url ="jdbc:mysql://localhost:3306/";
		String user="root";
		String password="root";
		
		//Establish connection	
		try 
		{
			Connection connection=DriverManager.getConnection(db_url, user, password);
			
		//Validate connection
			
		if(connection!=null)
		{					
			System.out.println("Connection sucess");
			System.out.println("Inserted values of employee into Database");
		} 
		else 
		{				
			System.out.println("Connection unsucess");
		}
								
		Statement stmt = connection.createStatement();
		String createDB ="create database employee";
		String use="Use employee";
		String createTable="create table employee (empcode int,empname varchar(25),empage int,esalary int);";
		
		String insert ="insert into employee values (101,'Jenny',25,10000)," + "(102,'Jacky',30,20000),"
				+ "(103,'Joe',20,40000)," +  "(104,'John',40,80000)," + "(105,'Shameer',25,90000)";		
		
		String select ="Select * from employee";	
		
		// create d				
		stmt.execute(createDB);					
		
		// use db				
		stmt.execute(use);
				
		//create table				
		stmt.execute(createTable);
				
		// insert data				
		stmt.executeUpdate(insert);				
						
		// Selecting the data
		ResultSet rs = stmt.executeQuery(select);
				
		// iterate result set and print
				
		while(rs.next()) 
		{					
			System.out.println(rs.getInt("empcode")+" "+rs.getString("empname")+" " 
		   +rs.getInt("empage")+" " +rs.getInt("esalary"));					
		}				
		// close the connection
				
		connection.close();
			
		} 
		catch (SQLException e)
		{			
			e.printStackTrace();
		}		
	}
}