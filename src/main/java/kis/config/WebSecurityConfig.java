package kis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
//класс который при старте прилодения конфигурирует Security
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() //включаем авторизацию
                    .antMatchers("/").permitAll() //для главной страницы разрешаем полный доступ
                    .anyRequest().authenticated() //для всех остальных запросов требуем авторизацию
                .and()
                    .formLogin() //включаем форму логин
                    .loginPage("/login") //указываем стараницу которая на мэпинге
                    .permitAll() //разрешаем этим пользоваться всем
                .and()
                    .logout() //включаем выход
                    .permitAll(); //разрешаем пользоваться всем
    }

    @Bean
    @Override
    //этот сервис будет подаваться сиситеме по требованию метода, который создает в памяти менеджер который обслуживает учетные записи
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("password")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}
