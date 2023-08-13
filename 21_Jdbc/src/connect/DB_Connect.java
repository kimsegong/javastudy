package connect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_Connect {

  public static Connection getConnection() {
    
    Connection con = null;
    
    try(BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))){
      
      Class.forName("oracle.jdbc.OracleDriver");
      Properties p = new Properties();
      p.load(reader);
      con = DriverManager.getConnection(p.getProperty("name"), p.getProperty("uer"),p.getProperty("age"));
    } catch(Exception e) {
      e.printStackTrace();
    }
    
    
    
    return con;
    
}
}








//
//  Connection con = null;
//  
//  try(BufferedReader reader = new BufferedReader(new FileReader("src/db.properties"))){
//    
//    Class.forName("oracle.jdbc.OracleDriver");
//    Properties p = new Properties();
//    p.load(reader);
//    con = DriverManager.getConnection(p.getProperty("name"),p.getProperty("age"),p.getProperty("password"));
//    
//    
//  } catch(Exception e) {
//    e.printStackTrace();
//  }
//  return con; 
//}


