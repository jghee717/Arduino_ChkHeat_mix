package sim.ERPID.Excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sim.ERPID.domain.Member;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelFileExporter {
    public static ByteArrayInputStream exportCustomerListToExcelFile(List<Customer> customers){

        try(Workbook workbook = new XSSFWorkbook()){

            Sheet sheet = workbook.createSheet("사원 정보");

            Row row = sheet.createRow(0);
            CellStyle headerCellStyle = workbook.createCellStyle();


            //create header cell
            Cell cell = row.createCell(0);
            cell.setCellValue("사원 번호");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(1);
            cell.setCellValue("이름");
            cell.setCellStyle(headerCellStyle);

            cell =row.createCell(2);
            cell.setCellValue("직책");
            cell.setCellStyle(headerCellStyle);

            cell =row.createCell(3);
            cell.setCellValue("부서");
            cell.setCellStyle(headerCellStyle);

            cell =row.createCell(4);
            cell.setCellValue("입사일자");
            cell.setCellStyle(headerCellStyle);

            cell =row.createCell(5);
            cell.setCellValue("이메일");
            cell.setCellStyle(headerCellStyle);

            cell =row.createCell(6);
            cell.setCellValue("주소");
            cell.setCellStyle(headerCellStyle);


            //create date row for eache of customer object
            for(int i =0; i<customers.size(); i++){
                Row dataRow = sheet.createRow(i + 1); //plus one header row
                dataRow.createCell(0).setCellValue(customers.get(i).getNumber());
                dataRow.createCell(1).setCellValue(customers.get(i).getName());
                dataRow.createCell(2).setCellValue(customers.get(i).getPosition());
                dataRow.createCell(3).setCellValue(customers.get(i).getDepartment());
                dataRow.createCell(4).setCellValue(customers.get(i).getHire());
                dataRow.createCell(5).setCellValue(customers.get(i).getEmail());
                dataRow.createCell(6).setCellValue(customers.get(i).getAddress());
            }

            //Making sure the size of excel cell auto resize to fit the data
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            sheet.autoSizeColumn(5);
            sheet.setColumnWidth(6, (sheet.getColumnWidth(6))+1024);


            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            workbook.write(outputStream);

            return new ByteArrayInputStream(outputStream.toByteArray());

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
