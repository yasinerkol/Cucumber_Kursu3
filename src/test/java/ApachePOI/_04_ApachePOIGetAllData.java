package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";

        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(dosyaOkumaBaglantisi);
        Sheet sheet = workbook.getSheet("Sheet1");

        //calişma sayfasındaki toplam satır saysısını veriyor
        int satirSayisi=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < satirSayisi; i++) {  //i satırı alındı
            Row satir=sheet.getRow(i);
            //bu satırdaki toplam hucre sayısı alındı
            int hucresayisi = satir.getPhysicalNumberOfCells();

            for (int j = 0; j <hucresayisi ; j++) {  //i satırındaki hücre sayısı kadar dönecek
                Cell hucre=satir.getCell(j);         // bu satırdaki sıradaki hücreyi aldım

                System.out.print(hucre+" ");

            }
            System.out.println();
        }
    }
}