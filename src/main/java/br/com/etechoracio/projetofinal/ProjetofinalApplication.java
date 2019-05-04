package br.com.etechoracio.projetofinal;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetofinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetofinalApplication.class, args);
	}
	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
		return new ServletRegistrationBean<FacesServlet>(new FacesServlet(), "*.xhtml");
	}

}
