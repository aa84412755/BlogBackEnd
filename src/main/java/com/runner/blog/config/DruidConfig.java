package com.runner.blog.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jian
 * 数据源的配置类
 */
@Configuration
public class DruidConfig {
    /**
     * 将Druid数据源添加到IOC容器中
     *@return  Druid数据源
     */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return  new DruidDataSource();
    }

    /**
     * 配置一个管理后台的Servlet
     * @return  ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams =new HashMap<>();

        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        //默认就是允许所有访问
        initParams.put("allow","");
        //拒绝访问，可以多个用,隔开
        initParams.put("deny","");

        bean.setInitParameters(initParams);
        return bean;
    }


    /**
     * 配置Druid的拦截器，主要是配置数据源不拦截的资源.
     * @return FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter(){
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams =new HashMap<>();
        //不用拦截的资源
        initParams.put("exclusions","*.js,*.css,/druid/*,*.html,*.png");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Collections.singletonList("/*"));

        return  bean;
    }
}
