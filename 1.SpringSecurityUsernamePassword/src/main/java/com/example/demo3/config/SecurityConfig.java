// package com.example.demo3.config;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
//
// /**
//  * 第二种认证的实现方式：通过配置类
//  */
// @Configuration
// public class SecurityConfig extends WebSecurityConfigurerAdapter {
//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//         BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//         String password = passwordEncoder.encode("admin");
//         auth.inMemoryAuthentication().withUser("admin").password(password).roles("admin");
//     }
//     @Bean
//     PasswordEncoder password() {
//         return new BCryptPasswordEncoder();
//     }
// }
