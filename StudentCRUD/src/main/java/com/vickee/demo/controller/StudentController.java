package com.vickee.demo.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vickee.demo.bean.Student;
import com.vickee.demo.service.StudentServiceImpl;


@Controller
public class StudentController {
	
	@Autowired
	private StudentServiceImpl service;
	
	@RequestMapping("Index")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView("Index");
		mv.addObject("Action",null);
		return mv;
	}

	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv = new ModelAndView("Insert");
		mv.addObject("Action",null);
		return mv;
	}
	
	@PostMapping("Insertion")
		public ModelAndView performInsert(Student stud) {
			String msg = service.addStudent(stud);
			ModelAndView mv = new ModelAndView("Insert");
			mv.addObject("Action",msg);
			return mv;
		}
	@RequestMapping("Delete")
	public ModelAndView loadDelete() {
		ModelAndView mv = new ModelAndView("Delete");
		mv.addObject("IdList",service.idList());
		return mv;
	}
	@PostMapping("Deletion")
	public ModelAndView doDelete(Student stud) {
	    List<Integer>idList=service.idList();
	    service.deleteStudent(stud);
	    ModelAndView mv=new ModelAndView("Delete");
	    mv.addObject("Action","Success");
	    mv.addObject("IdList",idList);
		return mv;
		
	}

	@RequestMapping("Update")
		public ModelAndView loadUpdate() {
		    ModelAndView mv = new ModelAndView("Update");
			mv.addObject("IdList",service.idList());
			return mv;
		}
		
		@RequestMapping("Fetch")
		public ModelAndView doFetch(@RequestParam("id") int id) {
		    java.util.Optional<Student> stud = service.fetchOne(id);
		    ModelAndView mv = new ModelAndView("Update");
		    mv.addObject("Stud", stud.orElse(null));
		    mv.addObject("IdList", service.idList());
		    return mv;		
		    }
		
		@PostMapping("Updation")
		public ModelAndView doUpdate(Student stud) {
		    List<Integer>idList=service.idList();
		    service.UpdateStudent(stud);
		    ModelAndView mv=new ModelAndView("Update");
		    mv.addObject("Action","Success");
		    mv.addObject("IdList",idList);
			return mv;
			
		}
		@RequestMapping("Search")
		public ModelAndView loadSearch() {
			ModelAndView mv = new ModelAndView("Search");
			mv.addObject("Action",null);
			mv.addObject("IdList",service.idList());
			return mv;
		}
		@RequestMapping("Find")
		public ModelAndView doSearch(@RequestParam("id") int id) {
			java.util.Optional<Student> stud=service.fetchOne(id);
			ModelAndView mv = new ModelAndView("Search");
			mv.addObject("Stud",stud.orElse(null));
			mv.addObject("IdList",service.idList());
			return mv;
		}
		@RequestMapping("viewAll")
		public ModelAndView doFind() {
			List<Student> studList=service.fetchAll();
			ModelAndView mv = new ModelAndView("viewAll");
			mv.addObject("StudList",studList);
			return mv;
		}
		
//		@RequestMapping("Output")
//		public ModelAndView loadOutput()
//		{
//			ModelAndView mv = new ModelAndView("Output");
//			return mv;
//		}
		@PostMapping("operation")
		public ModelAndView doOperation(@RequestParam("action")String action, @RequestParam("id") int id, @RequestParam("sname") String name, @RequestParam("scity") String city) {
			ModelAndView mv = new ModelAndView("Home");
			Student stud = new Student(id,name,city);
			if("Save".equals(action)) {
				service.UpdateStudent(stud);
				mv.addObject("Action","Success");
			}
			else if("Delete".equals(action)) {
				service.deleteStudent(stud);
				mv.addObject("Action1", "Success");
			}
			
			else if("Add".equals(action)) {
				String msg = service.addStudent(stud);
				mv.addObject("Action2", msg);
			}
			return mv;
		}
}
