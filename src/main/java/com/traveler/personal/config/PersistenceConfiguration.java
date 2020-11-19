package com.traveler.personal.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/pluraldemo");
        builder.username("postgres");
        builder.password("postgres");
        System.out.println("My custom dataSource bean has been initialized and set");
        return builder.build();
    }
}
