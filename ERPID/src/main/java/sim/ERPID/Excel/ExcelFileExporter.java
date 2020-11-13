package sim.ERPID.Excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelFileExporter {
    public static ByteArrayInputStream exportCustomerListToExcelFile(List<Customer> customers){

        try(Workbook workbook = new XSSFWorkbook()){

            Sheet sheet = workbook.createSheet("사원정보");

            Row row = sheet.createRow(0);
            CellStyle headerCellStyle = workbook.createCellStyle();


            //create header cell
            Cell cell = row.createCell(0);
            cell.setCellValue("First Name");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(1);
            cell.setCellValue("Last Name");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(2);
            cell.setCellValue("Mobile Number");
            cell.setCellStyle(headerCellStyle);

            cell =row.createCell(3);
            cell.setCellValue("Email Address");
            cell.setCellStyle(headerCellStyle);

            //create date row for eache of customer object
            for(int i =0; i<customers.size(); i++){
                Row dataRow = sheet.createRow(i + 1); //plus one header row
                dataRow.createCell(0).setCellValue(customers.get(i).getFirstName());
                dataRow.createCell(1).setCellValue(customers.get(i).getLastName());
                dataRow.createCell(2).setCellValue(customers.get(i).getMobileNumber());
                dataRow.createCell(3).setCellValue(customers.get(i).getEmail());
            }

            //Making sure the size of excel cell auto resize to fit the data
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            workbook.write(outputStream);

            return new ByteArrayInputStream(outputStream.toByteArray());

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
