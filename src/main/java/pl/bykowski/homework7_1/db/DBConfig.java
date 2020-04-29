package pl.bykowski.homework7_1.db;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

        @Bean
        public DataSource getDataSource(){
            DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
            dataSourceBuilder.url("jdbc:mysql://localhost:3306/cars");
            dataSourceBuilder.username("root");
            dataSourceBuilder.password("");
            dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
            return dataSourceBuilder.build();
        }

        @Bean
        public JdbcTemplate getJdbcTemplate(){
            return new JdbcTemplate(getDataSource());
        }

}
