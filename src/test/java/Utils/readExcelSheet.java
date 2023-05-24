package Utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;


    public class readExcelSheet {
        private static Object[][] reader(String path) {
            //Read the excel file
            //Get the data from the excel file
            //Return the data

            try{
                FileInputStream inputStream = new FileInputStream(new File(path));
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet sheet = workbook.getSheetAt(0);
                DataFormatter format = new DataFormatter();

                int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
                Object[][] data = new Object[rowCount][];
                for (int i = 1; i <= rowCount; i++) {
                    Row row = sheet.getRow(i);
                    int columnCount = row.getLastCellNum() - row.getFirstCellNum();
                    Object[] rowData = new Object[columnCount];
                    for (int j = 0; j < columnCount; j++) {
                        Cell cell = row.getCell(j);
                        rowData[j] = format.formatCellValue(cell);

                    }
                    data[i-1] = rowData;
                }
                workbook.close();
                inputStream.close();
                return data;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        }

        private static Object[][] Reader(String path) {
            //Read the excel file
            //Get the data from the excel file
            //Return the data

            try{
                FileInputStream inputStream = new FileInputStream(new File(path));
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet sheet = workbook.getSheetAt(1);
                DataFormatter format = new DataFormatter();

                int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
                Object[][] data = new Object[rowCount][];
                for (int i = 1; i <= rowCount; i++) {
                    Row row = sheet.getRow(i);
                    int columnCount = row.getLastCellNum() - row.getFirstCellNum();
                    Object[] rowData = new Object[columnCount];
                    for (int j = 0; j < columnCount; j++) {
                        Cell cell = row.getCell(j);
                        rowData[j] = format.formatCellValue(cell);

                    }
                    data[i-1] = rowData;
                }
                workbook.close();
                inputStream.close();
                return data;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        }

        public static Object[][] loginList() {

            return reader("src/main/resources/Login1.xlsx");
        }
        public static Object[][] ListforPlay() {

            return Reader("src/main/resources/Login1.xlsx");
        }


    }