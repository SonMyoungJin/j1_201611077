package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DaoMainV0 {
  public static void main(String[] args) {
    Connection conn=null;
    Statement stmt=null;
    ResultSet rs=null;
    try {
      String path=System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop=new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(String url, String uer, String password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test","root","1111");
      conn=DriverManager.getConnection(
           //"jdbc:mySql://localhost/test",
           prop.getProperty("URL")+"?useSSL=true",
           prop.getProperty("USER"),
           prop.getProperty("PASSWORD")
      );
     
      //String mysql="CREATE TABLE person(id int(64) NOT FULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT FULL, address varchar(255) NOT FULL, UNIQUE (id))";
      //String mySql="INSERT INTO persons(name,address) VALUES('v0-1','1 HongjiDong')";
      String mySql="select name from persons where id<4 order by id"; 
      stmt=conn.createStatement();
      //stmt.execute(mySql);  
      rs=stmt.executeQuery(mySql);
      while(rs.next()) {
        System.out.println(rs.getString("name"));
      }
    }catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
      if(rs !=null) rs.close();//resultset,statement,connection >> all close!!
      }catch(Exception e) {};
      try {
      if(stmt !=null) stmt.close();
      } catch(Exception e) {};
      try{
      if(conn !=null) conn.close();
     } catch(Exception e) {};
  
  }
 }
}

