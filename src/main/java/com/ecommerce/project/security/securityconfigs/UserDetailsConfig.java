package com.ecommerce.project.security.securityconfigs;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class UserDetailsConfig {

    private final DataSource dataSource;
    private final PasswordEncoder passwordEncoder;



    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }

//    @Bean
//    public CommandLineRunner initData(UserDetailsService userDetailsService){
//        return args -> {
//            JdbcUserDetailsManager userDetailsManager = (JdbcUserDetailsManager) userDetailsService;
//            UserDetails user1 = User.withUsername("user1")
//                    .password(passwordEncoder.encode("password1"))
//                    .roles("USER")
//                    .build();
//
//
//            UserDetails user2 = User.withUsername("admin")
//                    .password(passwordEncoder.encode("password2"))
//                    .roles("ADMIN")
//                    .build();
//            userDetailsManager.createUser(user1);
//            userDetailsManager.createUser(user2);
//        };
//    }


}
