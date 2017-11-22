package online.book.library.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloController {
    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello", method = GET)
    public String all() {
        LOG.info("REQUEST RECEIVED");
        return "HELLO FROM ROUTING TEST 1";
    }

    @RequestMapping(value = "/hello", method = GET)
    public String hello() {
        LOG.info("REQUEST RECEIVED");
        return "IT IS HELLO CONTROLLER FROM ROUTING TEST 1";
    }
}