//package com.OlympusRiviera.config;
//
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
////
////
////import com.OlympusRiviera.service.JWT.filter.JwtAuthenticationFilter;
////import com.OlympusRiviera.service.UserDetailsServiceImpl;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
////import org.springframework.security.config.http.SessionCreationPolicy;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.security.web.SecurityFilterChain;
////import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
////
////@Configuration
////@EnableWebSecurity
////public class SecurityConfig {
////
////    private final UserDetailsServiceImpl userDetailsServiceimpl;
////    private final JwtAuthenticationFilter jwtAuthenticationFilter;
////
////    public SecurityConfig(UserDetailsServiceImpl userDetailsServiceimpl, JwtAuthenticationFilter jwtAuthenticationFilter) {
////        this.userDetailsServiceimpl = userDetailsServiceimpl;
////        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
////    }
////
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////
////        return http
////                .csrf(AbstractHttpConfigurer::disable)
////                .authorizeHttpRequests(
////                        req->req.requestMatchers("/api/login/**", "/api/register/**")
////                                .permitAll()
////                                .anyRequest()
////                                .authenticated()
////                ).userDetailsService(userDetailsServiceimpl)
////                .sessionManagement(session ->session
////                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
////                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
////                .build();
////    }
////
////    @Bean
////    public PasswordEncoder passwordEncoder(){
////        return new BCryptPasswordEncoder();
////    }
////
////    @Bean
////    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
////        return configuration.getAuthenticationManager();
////    }
////}
//public class SecurityConfig {
//
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity.authorizeHttpRequests(registry -> {
//            registry.requestMatchers("/").permitAll();
//            registry.anyRequest().authenticated();
//        })
//                .oauth2Login(Customizer.withDefaults())
//                .formLogin(Customizer.withDefaults())
//                .build();
//    }
//}