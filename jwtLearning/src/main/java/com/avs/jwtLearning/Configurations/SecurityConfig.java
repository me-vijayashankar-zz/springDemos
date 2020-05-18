package com.avs.jwtLearning.Configurations;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    // @Autowired
    // private MyUserDetailsService myUserDetailService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // auth.userDetailsService(myUserDetailService);
        auth.inMemoryAuthentication()
        .withUser("admin").roles("ADMIN").password("{noop}password");
    }

    // public PasswordEncoder passwordEncoder(){
    //     return NoPassword
    // }

}