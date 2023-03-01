package config;

import beans.Tiger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Tiger tiger1(){

        return new Tiger("Khan");

    }
    @Bean
    @Primary
    Tiger tiger2(){

        return new Tiger("Sher");

    }


}
