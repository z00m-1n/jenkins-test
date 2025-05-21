package com.z00m1n.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                /* NodePort에 설정 된 30000 번 포트에서 오는 연결에 대한 CORS 설정 해제 */
//                .allowedOrigins("http://localhost:30000")
                /* Ingress 설정으로 내부적으로 통신이 수행 되므로 CORS 설정이 없어도 통신 가능 */
                .allowedOrigins("")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
