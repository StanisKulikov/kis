package kis.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//класс который содержит конфигурацию веб
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        //спринг пердоставляет сиистему авторизации, авторизируем ее
        registry.addViewController("/login").setViewName("login");
    }
}
