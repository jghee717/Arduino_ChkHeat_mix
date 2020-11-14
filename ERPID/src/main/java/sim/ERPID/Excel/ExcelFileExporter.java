package sim.ERPID.Excel;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
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
            headerCellStyle.setFillForegroundColor(HSSFColor.HSSFColorPredefined.GREY_25_PERCENT.getIndex());
            headerCellStyle.setAlignment(HorizontalAlignment.CENTER);

            CellStyle styleOfBoardFillFontBlackBold16 = workbook.createCellStyle();


            //create header cell
            Cell cell = row.createCell(0);
            cell.setCellStyle(headerCellStyle);
            cell.setCellValue("사원 번호");

            cell = row.createCell(1);
            cell.setCellStyle(headerCellStyle);
            cell.setCellValue("이름");

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
            sheet.setColumnWidth(0, (sheet.getColumnWidth(0))+1000);
            sheet.setColumnWidth(1, (sheet.getColumnWidth(1))+1000);
            sheet.setColumnWidth(2, (sheet.getColumnWidth(2))+1000);
            sheet.setColumnWidth(3, (sheet.getColumnWidth(3))+1000);
            sheet.setColumnWidth(4, (sheet.getColumnWidth(4))+2500);
            sheet.setColumnWidth(5, (sheet.getColumnWidth(5))+4000);
            sheet.setColumnWidth(6, (sheet.getColumnWidth(6))+10000);


            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            workbook.write(outputStream);

            return new ByteArrayInputStream(outputStream.toByteArray());

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
