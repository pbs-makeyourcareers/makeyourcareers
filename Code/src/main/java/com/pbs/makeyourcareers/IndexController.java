package com.pbs.makeyourcareers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pbs.makeyourcareers.jpa.model.QuestionType;
import com.pbs.makeyourcareers.service.QuestionTypeService;
 
@Controller
public class IndexController {
 
	@Autowired
	QuestionTypeService questionTypeService;
	
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }
     
    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        
        List<QuestionType> questionTypeList = questionTypeService.findAllQuestionType();
        questionTypeList.forEach(qu -> System.out.println(qu.toString()));
        		
        System.out.println("size "+questionTypeList.size());
        return "next";
    }
 
}
