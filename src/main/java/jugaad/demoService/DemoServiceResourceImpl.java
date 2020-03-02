package jugaad.demoService;

import jugaad.demoService.ClientApi.DemoServiceResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceResourceImpl implements DemoServiceResource {

    private Logger logger = LoggerFactory.getLogger(DemoServiceResource.class);

    @Override
    public String health() {
        logger.info("Server Is Healthy");
        return "Healthy";
    }
}
