package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@RestController
public class HelloController {
    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());

    @RequestMapping("/")
    public String index() {

        LOG.log(Level.INFO,"[INDEX] - Alguien accedió al index");
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/elk")
    public String elk() {
        LOG.log(Level.INFO,"[ELK] - trazando llamadas para elk");
        return "Tracing to elk";
    }
}