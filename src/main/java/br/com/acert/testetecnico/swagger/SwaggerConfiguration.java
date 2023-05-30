package br.com.acert.testetecnico.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	@Bean
	public Docket docket() {
	 return new Docket(DocumentationType.SWAGGER_2)
			 //.securityContexts()
			 .select()
			 .apis(RequestHandlerSelectors.basePackage("br.com.acert.testetecnico"))
			 .paths(PathSelectors.any())
			 .build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API Documentation")
				.description("Documentation for your API")
				.version("1.0.0")
				.build();
	}
}
