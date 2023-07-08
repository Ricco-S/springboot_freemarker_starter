package de.spring.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	

/* Clean Page */
    @RequestMapping(value = "/clean", method = RequestMethod.GET)
    public String clean() {
        return "clean_template";
    }

    
    
/* START PAGES SETUP */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
    
    @RequestMapping(value = "/page2.htm", method = RequestMethod.GET)
    public String page2() {
        return "page2";
    }
    
    @RequestMapping(value = "/page3.htm", method = RequestMethod.GET)
    public String page3() {
        return "page3";
    }
    
}