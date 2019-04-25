package kis;

import kis.domain.Message;
import kis.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

//программный модуль который
@Controller
public class GreetingController {
    @Autowired
    private MessageRepo messageRepo;


    //по пути слушает пользовательский запросы  и возвращает результат в файлш шаблон
    @GetMapping("/") //страница приветсвия
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/main") //внутрення страницв
    public String main(Map<String, Object> model) {
        //создаем переменную
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messges", messages);
            return "main";
    }


}
