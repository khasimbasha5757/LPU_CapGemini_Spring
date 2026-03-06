package com.securitypractice.springsecuritydemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
		/**
		mobile
		brand
		price
		colour
		ram
		processor
		design
		os
		camera
		pixel
		display
	*/
@Bean
public SecurityFilterChain filter(HttpSecurity http) throws Exception{			
	//singleton
	//builder design pattern		
	return http.csrf(csrf->csrf.disable()).
	authorizeHttpRequests(auth->auth
	.requestMatchers("/practices").permitAll()
	.requestMatchers("/admin").authenticated())
	.httpBasic(Customizer.withDefaults())
	.build();
}	
@Bean
public UserDetailsService getUserDetails() {

    UserDetails admin = User
            .withUsername("admin")
            .password("{noop}1234")
            .roles("ADMIN")
            .build();

    UserDetails yusuf = User
            .withUsername("yusuf")
            .password("{noop}cr4lpa")
            .roles("USER")
            .build();

    return new InMemoryUserDetailsManager(admin, yusuf);
}	
}