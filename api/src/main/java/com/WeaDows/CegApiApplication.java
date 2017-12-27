package com.WeaDows;
import com.WeaDows.util.ServerSocketPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by SongpoLiu on 2017/7/10.
 */

@EnableTransactionManagement // 启注解事务管理
@MapperScan("com.WeaDows.mapper")
@SpringBootApplication
@Configuration
public class CegApiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CegApiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CegApiApplication.class, args);
        ServerSocketPool serverSocketPool = new ServerSocketPool();
        serverSocketPool.testCommon();
    }



    /**
     * 文件上传配置
     * @return
     */
    /*@Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大
        factory.setMaxFileSize("10240KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("10240KB");//MB
        return factory.createMultipartConfig();
    }*/
}
