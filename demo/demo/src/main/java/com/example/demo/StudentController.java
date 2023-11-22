package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.StudentService;
@RestController
public class StudentController {

	 @Autowired
	    StudentService sService;
	    @RequestMapping("/getallnames")
	    @ResponseBody
	    public String getBooks(){
	        return sService.loadbyname(null);
	    }
}




 

