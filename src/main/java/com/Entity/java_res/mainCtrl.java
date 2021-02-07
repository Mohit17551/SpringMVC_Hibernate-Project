package com.Entity.java_res;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.Entity.Service.*;


import com.Entity.Object.*;

@Controller
public class mainCtrl { 
  
	@Autowired
	ServiceDAO services;

    @RequestMapping("dispAll")
    public ModelAndView displayData(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dispAll");
        List<Student> list =  services.showStudents();
        mv.addObject("list", list);
        return mv;
    }
    
    @RequestMapping("/addForm")
    public ModelAndView addStudent(){
    	ModelAndView mv = new ModelAndView("addForm");
    	mv.addObject("newStudent" ,new Student());
    	return mv;
    }
    @RequestMapping("/save")
    public String confirmation(@ModelAttribute("newStudent") @Valid  Student student, BindingResult bindingResult){
    	
    	String page="confirmation";
    	
    	if (bindingResult.hasErrors() == true){
    		System.out.print("insides");
    		return "addForm";
    	}else{
    	services.addStudent(student);
    	return page;
    	}
    }
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String deletion(@RequestParam(name="ID" , required=false) String id, Model m){
    	if(id !=null){	
    		services.deleteStudent(Integer.parseInt(id));
    		m.addAttribute("ID", "Id with id = "+id+" has been deleted");
    	}    		
    	return "delete";
    }
} 

