//package sim.ERPID;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.servlet.MultipartConfigFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.unit.DataSize;
//import org.springframework.web.multipart.MultipartResolver;
//import sim.ERPID.repository.*;
//import sim.ERPID.service.HeatService;
//import sim.ERPID.service.MemberService;
//import org.springframework.context.annotation.Bean;
//import sim.ERPID.repository.HeatRepository;
//import sim.ERPID.service.HeatService;
//
//public class SpringConfig2 {
//    private final HeatRepository heatRepository;
//
//    public SpringConfig2(HeatRepository heatRepository) {
//        this.heatRepository = heatRepository;
//    }
//
//    @Bean
//    public HeatService heatService() {
//        return new HeatService(heatRepository);
//    }
//}
