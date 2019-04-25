//файл запуска приложений, данный файл будет запускать все приложение

package kis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//анотация которая найдет контролер, файл для подлкючения к базе данных и прочее
@SpringBootApplication
public class Application {
    //запуск проекта
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
