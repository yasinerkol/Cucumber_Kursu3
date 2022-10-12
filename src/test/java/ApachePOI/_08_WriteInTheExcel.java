package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        //var olan excel de yazma işlemi

        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";

        FileInputStream inputStream = new FileInputStream(path); //okuma modunda açıldı
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        //Hafızada oluşturma ve yazma işlemleri :
        Row yeniSatir= sheet.createRow(0);  //satır oluşturuldu
        Cell yeniHucre=yeniSatir.createCell(0); //yeni satırda ilk hücre oluşturuldu
        yeniHucre.setCellValue("Merhaba Dünya"); //bilgi yazıldı


        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }
        //Sıra kaydetmeye geldi. bütün bilgiler buraya kadar hafızada
        inputStream.close(); // okuma modunu kapattım. çünkü yazma modunu açmam gerekiyor

        // yazma işlemini yazma modunda açıp yapacağım
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("işlem tamamlandı");



    }
}
