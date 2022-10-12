package _JDBC.Gun2;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetAllRowColumn extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd=rs.getMetaData();   
        //sonuçların haricindeki diğer bilgileri verir bize: colon sayısı, isimleri, tipleri
        int columnCount=rsmd.getColumnCount();  // kolon sayısı
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i <= columnCount ; i++) {
            String columnName=rsmd.getColumnName(i);
            String columnType=rsmd.getColumnTypeName(i);

            System.out.println(columnName+"   "+ columnType);

        }
    }

    @Test
    public void test2() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd=rs.getMetaData();


        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i)+"\t");

        System.out.println();

        while(rs.next()){
            for (int i = 1; i <=rsmd.getColumnCount() ; i++)
                System.out.print(rs.getString(i)+"\t");

            System.out.println();

        }

        }

    @Test
    public void test3() throws SQLException {
        // language tablosundaki tüm satırları ve tüm sütunları yazdırınız,
        // aynı mysql sonuç ekranında olduğu gibi aralıkları prinf ile
        //printf ile anlatttı hoca

        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd=rs.getMetaData();


        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-20s",rsmd.getColumnName(i));
        //% : değişkenin değerini işaret eder
        // - : sola dayalı yazdırır, default sağa dayalıdır
        // 20 : kaç hane kullanılacak onun bilgisini verir
        // s: string değerler için s , sayısal değerler için d kullanılır
        //"%5.2d" : sayı için 5 hane kullan, ondalıklı kısım iki hane olsun

        System.out.println();

        while(rs.next()){
            for (int i = 1; i <=rsmd.getColumnCount() ; i++)
                System.out.printf("%-20s",rs.getString(i));

            System.out.println();

        }
    }

    @Test
    public void test4() throws SQLException {
        // actor tablosundaki tüm satırları ve tüm sütunları yazdırınız, aynı mysql sonuç ekranında olduğu gibi
        // fakat metod kullanınız, metoda sorguyu gönderiniz ve orada yazdırınız.

        getTable("select * from actor");

    }
    public void getTable(String sorgu) throws SQLException {
        ResultSet rs = statement.executeQuery("select * from actor");
        ResultSetMetaData rsmd=rs.getMetaData();


        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.printf("%-20s",rsmd.getColumnName(i));

        System.out.println();

        while(rs.next()){
            for (int i = 1; i <=rsmd.getColumnCount() ; i++)
                System.out.printf("%-20s",rs.getString(i));

            System.out.println();
        }
    }



  // int sayi=12345678;
  //     System.out.printf("%,d",sayi); // %,d araya virgül koyunca parasal ifadelerde aralarına nokta koyarak yazdırır //12.345.678
  // String str="Merhaba Dünya";
  //     System.out.printf("%n %s",str);//%s ile string ifadeyi olduğu gibi yazdırdık //Merhaba Dünya
  //     System.out.printf("%n %S",str);//%S büyük S ile string ifadeyi büyük harflerle yazdırdık //MERHABA DÜNYA

//        String str="Merhaba";
//        String str1="Dünya";
//        String str2="Nasılsınız";
//        System.out.printf("%20s %10s   %s %n",str,str1,str2);//%20s %10s %s ifadelerinin arasındaki boşluklar da ekranda boşluk olarak yansıyor
//

//        String str="Merhaba Dünya";
//
//        System.out.printf("%20s %n",str);// str 13 karakterli 13 ten fazla oolursa sağa doğru kaydırır ekranda
//        System.out.printf("%10s %n",str);//10 karakterlik yer ayırsak da sola dayalı yazıyor çünkü uzunluk fazla
//        System.out.printf("%s %n",str);//yani str nin uzunluğunu garantiye alıyor işlemi ona göre yapıyor

    // burada integer sayıları printf ile yazdırdık
//        int sayi=34;
//        int sayi2=53434;
//        int sayi3=542534445;
//
//        System.out.printf("%10d %n",sayi);
//        System.out.printf("%10d %n",sayi2);
//        System.out.printf("%10d %n",sayi3);

}


