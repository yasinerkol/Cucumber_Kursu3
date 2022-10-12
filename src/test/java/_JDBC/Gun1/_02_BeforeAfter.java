package _JDBC.Gun1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {

    private static  Connection connection;
    private static Statement statement;

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

    @Test
    public void test1() throws SQLException {
        //sorgu burada çalışacak
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);
    }

    @Test
    public void test2() throws SQLException {
        //sorgu burada çalışacak
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

    }

    @Test
    public void test3() throws SQLException {
        //sorgu burada çalışacak
        ResultSet rs=statement.executeQuery("select * from language");

        rs.next();   //English
        String dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();  //Italian
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.previous();   // bir öncekine gider ve English yazar
        dilAdi=rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

    }


}
