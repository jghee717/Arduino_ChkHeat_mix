package sim.ERPID.Excel;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DownloadExcelController {

    @RequestMapping
    public String index(){
        return "index";
    }

    @GetMapping("/download/hrms.xlsx")
    public  void downloadExcelFile(HttpServletResponse response) throws IOException {

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=hrms 사원 정보.xlsx");
        ByteArrayInputStream stream = ExcelFileExporter.exportCustomerListToExcelFile(createTestData());
        IOUtils.copy(stream, response.getOutputStream());
    }
    private List<Customer> createTestData() {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("23423","심성윤","차장","개발","2020-09-10","jghee717@hrms.com","서울 강남구 양재천로 167 (도곡동),1002","36.7ºC"));
        customers.add(new Customer("99109","신현준","부장","개발","2020-04-11","sinhj@hrms.com","서울 강남구 양재천로 167 (도곡동),2201","36.4ºC"));
        return customers;
    }

}
