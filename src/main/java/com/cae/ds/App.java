package com.cae.ds;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
  * @Title: App.java
  * @Description:启动类
  * @Company  电子科技大学自动化研究所
  * @author  杜松   
  * @date 2017年11月27日 下午4:13:22
  * @version V1.0
 */
@SpringBootApplication
public class App  extends SpringBootServletInitializer   {

    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
