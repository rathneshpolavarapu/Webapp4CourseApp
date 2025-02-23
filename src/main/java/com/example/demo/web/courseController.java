 package com.example.demo.web;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Course;

@Controller
public class courseController {
	
@GetMapping("/courseinfo")
	public String courseInfo(Model model) {
	
	model.addAttribute("cid", "T1");
	model.addAttribute("cname", "Marketing");
	model.addAttribute("cprice", "2500.8");
	
	return "course";	
}

@GetMapping("/courseinfo2")
public String courseinfo2(Model model) {
	Course course=new Course();
	
	course.setCourseId("T2");
	course.setCourseName("Stock markets");
	course.setCoursePrice(8906.9);
	model.addAttribute("course",course);
	
	return "course2";
}
}
