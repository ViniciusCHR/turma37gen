package org.generation.blog.Pessoal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("org.generation.blog.Pessoal.controller"))
				.paths(PathSelectors.any()).build().apiInfo(metadata()).useDefaultResponseMessages(false)
				.globalResponses(HttpMethod.GET, responseMessage()).globalResponses(HttpMethod.POST, responseMessage())
				.globalResponses(HttpMethod.PUT, responseMessage())
				.globalResponses(HttpMethod.DELETE, responseMessage());
	}

	public static ApiInfo metadata() {
		return new ApiInfoBuilder().title("API - Blog Pessoal").description("Projeto API Spring - Blog Pessoal")
				.version("1.0.0").license("Apache License Version 2.0").licenseUrl("https://github.com/ViniciusCHR")
				.contact(contact()).build();
	}

	private static Contact contact() {
		return new Contact("Vinicius Silva", "https://github.com/ViniciusCHR", "vinicius.unicap@gmail.com");
	}

	private static List<Response> responseMessage() {
		return new ArrayList<Response>() {
			private static final long serialVersionUID = 1L;
			{
				add(new ResponseBuilder().code("200").description("Sucesso!").build());
				add(new ResponseBuilder().code("201").description("Criado!").build());
				add(new ResponseBuilder().code("400").description("Erro na requisição!").build());
				add(new ResponseBuilder().code("401").description("Não Autorizado!").build());
				add(new ResponseBuilder().code("403").description("Proibido!").build());
				add(new ResponseBuilder().code("404").description("Não Encontrado!").build());
				add(new ResponseBuilder().code("500").description("Erro!").build());
			}
		};
	}

	public Docket api() {
		
		@RestController
		.apis(RequestHandlerSelectors.basePackage(“br.org.generation.blogpessoal.controller”))
		.paths(PathSelectors.any())
		.useDefaultResponseMessages(false)
		
		responseMessage()
		.globalResponses(HttpMethod.GET, responseMessage())
		.globalResponses(HttpMethod.POST, responseMessage())
		.globalResponses(HttpMethod.PUT, responseMessage())
		.globalResponses(HttpMethod.DELETE, responseMessage());
		
	}

	public static ApiInfo metadata() {
		
		.title(“Blog Pessoal”)
		.description(“API do Projeto de blog pessoal”)
		.version("1.0.0")
		.license("Apache License Version 2.0")
		.licenseUrl("https://github.com/ViniciusCHR")
		.contact(contact()).build();
	}

	private static Contact contact() {
		return new Contact("Vinicius Silva", "https://github.com/ViniciusCHR", "vinicius.unicap@gmail.com");
	}

	private static List responseMessage() {

		add(new ResponseBuilder().code("200").description("Sucesso!").build());
		add(new ResponseBuilder().code("201").description("Criado!").build());
		add(new ResponseBuilder().code("400").description("Erro na requisição!").build());
		add(new ResponseBuilder().code("401").description("Não Autorizado!").build());
		add(new ResponseBuilder().code("403").description("Proibido!").build());
		add(new ResponseBuilder().code("404").description("Não Encontrado!").build());
		add(new ResponseBuilder().code("500").description("Erro!").build());
	}
	
	

}
