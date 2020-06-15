package pl.Lukasz.Calories;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/userIndex").setViewName("userIndex");
        registry.addViewController("/managerIndex").setViewName("managerIndex");
        registry.addViewController("/login").setViewName("login");
    }
}
