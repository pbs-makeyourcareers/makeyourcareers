package com.pbs.makeyourcareers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pbs.makeyourcareers.jpa.model.QuestionStream;
import com.pbs.makeyourcareers.jpa.model.QuestionType;
import com.pbs.makeyourcareers.jpa.model.Skills;
import com.pbs.makeyourcareers.service.QuestionStreamService;
import com.pbs.makeyourcareers.service.QuestionTypeService;
import com.pbs.makeyourcareers.service.SkillsService;
 
@Controller
public class IndexController {
 
	@Autowired
	QuestionTypeService questionTypeService;
	
	@Autowired
	QuestionStreamService questionStreamService;
	
	@Autowired
	SkillsService skillsService;
	
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
        
        List<QuestionStream> questionStreamList = questionStreamService.findAllQuestionStream();
        questionStreamList.forEach(qs -> System.out.println(qs.toString()));
        
        List<QuestionStream> questionStreamList1 = questionStreamService.findByQuestionType(2L);
        questionStreamList1.forEach(qs -> System.out.println(qs.toString()));
        
        List<Skills> skillsList = skillsService.findAllSkills();
        skillsList.forEach(sk -> System.out.println(sk.toString()));
        
        List<Skills> skillsList1 = skillsService.findByQuestionStream(4L);
        skillsList1.forEach(sk -> System.out.println(sk.toString()));
        
        System.out.println("size "+questionTypeList.size());
        return "next";
    }
 
}
