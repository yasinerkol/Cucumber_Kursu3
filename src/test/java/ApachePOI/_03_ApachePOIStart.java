package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        //dosya yolu alındı
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
      //  String path="src\\test\\java\\ApachePOI\\resource\\ApacheExcel2.xlsx";

        //dosya okuma işlemcisine dosyanın yolunu veriyoruz: böylece program ile dosya bağlantısını yapıyoruz
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        // dosya okuma işlemcisi üzerinden çalışma kitabını alıyorum
        //hafızadaki workbook u bulup oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calimaSayfasi=calismaKitabi.getSheet("Sheet1");
       // Sheet calimaSayfasi=calismaKitabi.getSheet(0);

        //istenen satırı alıyorum
        Row satir=calimaSayfasi.getRow(0);

        //istenen satırdaki istenen hücre alınıyor
        Cell hucre=satir.getCell(0);

        System.out.println("hucre = " + hucre);

    }
}
