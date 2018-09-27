package com.neuedu.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
@RequestMapping(value = "/info")
 public String  front(){
     return "front";
 }

}
