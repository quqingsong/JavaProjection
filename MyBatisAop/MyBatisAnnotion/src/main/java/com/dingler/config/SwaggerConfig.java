package com.dingler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 屈青松
 * @date 2020/7/31 10:46
 */

//@EnableSwagger2主要是做Swagger2功能开启
@EnableSwagger2
//@Configuration主要是做spring配置
@Configuration
public class SwaggerConfig {
    //配置swagger的Docket的bean实例
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors表示配置要扫描接口的方式
                //basePackage指定要扫描的包
                //
                .apis(RequestHandlerSelectors.basePackage("com.dingler"))//扫描com.dingler路径下的api文档
                .paths(PathSelectors.any())//路径判断
                .build();
    }

    //配置swagger信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger 开发规范")//标题
                .description("昨夜圆非今夜圆，\n" +
                        "一年十二度圆月，\n" +
                        "能得几多时少年，\n" +
                        "却疑圆处减婵娟。")//描述
                .termsOfServiceUrl("https://blog.csdn.net/qq_40651609")//（不可见）条款地址
                .version("v1.0")//版本号
                .build();
    }

}
