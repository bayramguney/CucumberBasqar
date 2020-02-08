package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class getMultipleDataInExcel {


    public static List<String> getData(String pathOfTheExcel, String sheetName) {

        String path = ReadPropertiesFile.getData( pathOfTheExcel );

        FileInputStream inStream = null;

        try {
            inStream = new FileInputStream( path );
        } catch(Exception e) {
            System.out.println( e.getMessage() );
        }

        Workbook workbook = null;

        try {
            workbook = WorkbookFactory.create( inStream );
        } catch(Exception e) {
            System.out.println( e.getMessage() );
        }

        Sheet sheet = workbook.getSheet( sheetName );

        Row row;

        Cell cell = null;

        System.out.println(sheet.getPhysicalNumberOfRows());

        int maxRow = sheet.getPhysicalNumberOfRows();


        List<String> allData = new ArrayList<>(  );

        for(int i = 0 ; i<maxRow ; i++ ) {

            row = sheet.getRow( i );

            int cellCount= row.getLastCellNum();

            for(int j = 1 ; j<cellCount ; j++){

                cell = row.getCell( j );

                allData.add( cell.toString() );

            }

        }



        return allData;
        }
}
