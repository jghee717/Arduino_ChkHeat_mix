package sim.ERPID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sim.ERPID.repository.MemberRepository;
import sim.ERPID.repository.MemoryMemberRepository;
import sim.ERPID.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        return  new MemoryMemberRepository();
    }
}
