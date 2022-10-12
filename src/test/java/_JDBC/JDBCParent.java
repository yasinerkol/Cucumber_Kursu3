package _JDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    private static Connection connection;
    protected static Statement statement;

    @BeforeTest
    public void DBConnectionOpen(){
        //bağlantı burada yapılacak
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila"; //hotstname,port,db adını (user db)
        String username="root"; //username
        String password="'\"-LhCB'.%k[4S]z";  // password

        try {
            connection= DriverManager.getConnection(url, username, password);    //connection
            statement=connection.createStatement();    // sorguları çalıştırmak için page açıldı
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @AfterTest
    public void DBConnectionClose(){
        //bağlantı burada kapatılacak
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
