package com.guxingke.kblog.context.config;

import com.guxingke.kblog.option.model.Option;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).ignoredParameterTypes(Option.class)
                 .select()
                 .apis(RequestHandlerSelectors.basePackage("com.guxingke.kblog"))
                 .paths(PathSelectors.any())
                 .build();
        }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "KBLOG",//大标题
                "simple blog",//小标题
                "1.0",//版本
                "NO terms of service",
                "admin@guxingke.com",//作者
                "gxk",//链接显示文字
                "http://www.guxingke.com/"//网站链接
        );

        return apiInfo;
    }
}