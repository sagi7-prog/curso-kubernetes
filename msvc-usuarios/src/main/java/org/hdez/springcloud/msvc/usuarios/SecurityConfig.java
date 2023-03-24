//package org.hdez.springcloud.msvc.usuarios;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeRequests()
//                .requestMatchers("/authorized").permitAll()
//                .requestMatchers(HttpMethod.GET, "/", "/{id}").hasAnyAuthority("SCOPE_read", "SCOPE_write")
//                .requestMatchers(HttpMethod.POST, "/").hasAnyAuthority("SCOPE_write")
//                .requestMatchers(HttpMethod.PUT, "/{id}").hasAnyAuthority("SCOPE_write")
//                .requestMatchers(HttpMethod.DELETE, "/{id}").hasAnyAuthority("SCOPE_write")
//                .anyRequest().authenticated()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .oauth2Login(aouth2Login -> aouth2Login.loginPage("/oauth2/authorized/msvc-usuarios-client"))
//                .oauth2Client(withDefaults())
//                .oauth2ResourceServer().jwt();
//
//        return httpSecurity.build();
//    }
//
//}
