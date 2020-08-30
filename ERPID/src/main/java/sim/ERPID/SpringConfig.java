package sim.ERPID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sim.ERPID.repository.JdbcMemberRepository;
import sim.ERPID.repository.JdbcTemplateMemberRepository;
import sim.ERPID.repository.MemberRepository;
import sim.ERPID.repository.MemoryMemberRepository;
import sim.ERPID.service.MemberService;

import javax.sql.DataSource;
@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
// return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
