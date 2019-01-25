package com.market.fly.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by Mason on 2019/1/25
 */
@Configuration
@MapperScan(basePackages="com.market.fly.plat",sqlSessionFactoryRef="sqlSessionFactory1")
public class DatasourceConfig1 {
    /**
     * 配置test1数据库
     * @return
     */
    @Bean(name="datasource1")
    @ConfigurationProperties(prefix="spring.datasource1")
    @Primary        //指定 默认的访问的数据源
    public DataSource testDatasource() {
        return DataSourceBuilder.create().build();
    }
    /**
     * 创建SqlSessionFactory
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean(name="sqlSessionFactory1")
    @Primary        //指定 默认的访问的数据源
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("datasource1")DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        //如果还有分页等其他事务
//      bean.setMapperLocations(new PathMatchingResourcePatternResolver().
//              getResources("classpath:mybatis/test2/*.xml"));
        return bean.getObject();
    }
    /**
     * 配置事务管理
     * @param dataSource
     * @return
     */
    @Bean(name="transactionManager1")
    @Primary        //指定 默认的访问的数据源
    public DataSourceTransactionManager testTransactionManager(
            @Qualifier("datasource1")DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name="sqlSessionTemplate1")
    public SqlSessionTemplate testSqlSessionTemplate(
            @Qualifier("sqlSessionFactory1")SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
