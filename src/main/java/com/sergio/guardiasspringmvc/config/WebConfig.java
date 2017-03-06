package com.sergio.guardiasspringmvc.config;

import com.sergio.guardiasspringmvc.model.Profesor;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author sergio
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.sergio.guardiasspringmvc")
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Bean
    public List<Profesor> crearListaProfesores() {
        List<Profesor> listaProfesores = new ArrayList<>();

        Profesor profesor = new Profesor();
        profesor.setNombre("Dominguez");
        profesor.setPrimeraHora("Libre");
        profesor.setSegundaHora("Libre");
        profesor.setTerceraHora("Clase");
        profesor.setCuartaHora("Libre");
        profesor.setQuintaHora("Clase");
        profesor.setSextaHora("Libre");
        listaProfesores.add(profesor);

        profesor = new Profesor();
        profesor.setNombre("Garrido");
        profesor.setPrimeraHora("Clase");
        profesor.setSegundaHora("Clase");
        profesor.setTerceraHora("Libre");
        profesor.setCuartaHora("Libre");
        profesor.setQuintaHora("Libre");
        profesor.setSextaHora("Clase");
        listaProfesores.add(profesor);

        profesor = new Profesor();
        profesor.setNombre("Perez");
        profesor.setPrimeraHora("Clase");
        profesor.setSegundaHora("Libre");
        profesor.setTerceraHora("Libre");
        profesor.setCuartaHora("Clase");
        profesor.setQuintaHora("Libre");
        profesor.setSextaHora("Libre");
        listaProfesores.add(profesor);

        return listaProfesores;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
    }
}
