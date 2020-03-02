package jugaad.demoService.ClientApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demoService")
public interface DemoServiceResource {


    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health();

}
