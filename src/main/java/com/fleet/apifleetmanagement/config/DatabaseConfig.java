package com.fleet.apifleetmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;



import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.tu.paquete.repository")
public class DatabaseConfig {
 @Bean
 LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, DataSource dataSource) {
        return builder
            .dataSource(dataSource)
            .packages("com.fleet.apifleetmanagement.config") // Paquete de entidades JPA
            .persistenceUnit("myUnit")
            .build();
 }

    // Otras configuraciones y beans relacionados con la base de datos van aquí
}
