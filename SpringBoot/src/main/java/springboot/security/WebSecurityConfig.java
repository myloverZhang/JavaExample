//package springboot.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import springboot.service.PlayerInfoRepository;
//
//import java.util.Arrays;
//
///**
// * Created by CTWLPC on 2017/8/2.
// */
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//    private PlayerInfoRepository playerInfoRepository;
//
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").access("hasRole('PLAYER')")
//                .antMatchers("/**").permitAll()
//                .and()
//                .formLogin()
//                    .loginPage("/login.html")
//                    .failureUrl("/login?error=true");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//                return playerInfoRepository.findOne(s);
//            }
//        });
//    }
//
//
//}
