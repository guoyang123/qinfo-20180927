package com.neuedu.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
@RequestMapping(value = "/info",method = RequestMethod.GET)
public String  front(){
    return "front";
}
    @RequestMapping(value = "/info",method = RequestMethod.POST)
    public String  frontpost(){
        return "front2";
    }

}
