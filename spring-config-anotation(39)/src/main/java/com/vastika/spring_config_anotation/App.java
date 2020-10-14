package com.vastika.spring_config_anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vastika.demo.config.SpringConfig;
import com.vastika.demo.controller.MessageController;
import com.vastika.demo.service.MessageService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
//   MessageService service = context.getBean(MessageService.class);
//   service.sendMessage("Hello,Good morning to you all");
   MessageController controller= context.getBean(MessageController.class);
   controller.sendMessage("Hello,Good morning to you all");
    }
}
 