package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("M1")
    public Movies getMovie1(){
        return new Movies(100,"Avengers",02.30,2018);
    }
    @Bean("M2")
    public Movies getMovie2(){
        return new Movies(101,"End Game",03.10,2019);
    }
    @Bean("M3")
    public Movies getMovie3(){
        return new Movies(102,"Infinity War",03.00,2017);
    }
}
