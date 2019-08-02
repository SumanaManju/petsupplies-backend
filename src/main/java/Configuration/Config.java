package Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class Config implements WebMvcConfigurer {

	private String allowedMethods = "OPTIONS,GET,POST,DELETE";
	private String allowedHeaders = "Content-Type,withcredentials,Authorization,X-CSRF-TOKEN,accept,origin";
	private String allowedOrigins= "http://localhost:4200,*";
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/**")
		.allowedMethods(allowedMethods.split(","))
		.allowedHeaders(allowedHeaders.split(","))
		.allowedOrigins(allowedOrigins.split(","))
		.allowCredentials(true);
	}

}
