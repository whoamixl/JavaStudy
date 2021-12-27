package com.whoami.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan(basePackages = "com.whoami.service")
@Configuration
public class SpringConfig {

//    @Bean
    public StudentMapper studentMapper() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
        return sqlSessionTemplate.getMapper(StudentMapper.class);
    }

//    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://101.43.118.204/mysqlStudy?useSSL=false&useUnicode=true&characterEncoding=UTF8");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("yxl123520.");
        return driverManagerDataSource;
    }

//    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(this.dataSource());
        PathMatchingResourcePatternResolver path = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(path.getResources("classpath*:com/whoami/service/*.xml"));
        return factoryBean.getObject();
    }

//    @Bean
    public SqlSessionTemplate sqlSession() throws Exception {
        return new SqlSessionTemplate(this.sqlSessionFactory());
    }

}
