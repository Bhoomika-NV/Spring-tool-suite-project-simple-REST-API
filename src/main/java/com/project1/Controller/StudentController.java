package com.project1.Controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.Entity.Student;
import com.project1.configuration.StudentConfig;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	RabbitTemplate template;
	
	@PostMapping(value="/create" ,produces="application/json" ,consumes="application/json")
	public void createStudentRequest(@RequestBody Student student)
	{
		template.convertAndSend(StudentConfig.EXCHANGE, StudentConfig.ROUTINGKEY, student);
	}
	
}