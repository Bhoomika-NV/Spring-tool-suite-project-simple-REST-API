package com.project1.configuration;

import java.io.Serializable;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig implements Serializable {

	public static final String EXCHANGE = "student_request_exchange";
	public static final String ROUTINGKEY ="student_request_routing_key";
	public static final String QUEUE="student_request_Queue";
	
	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
	}
	
	//binding these 
	@Bean
	public Queue studentServiceQueue() {
		return new Queue(QUEUE);
	}
	
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(EXCHANGE);
	}
	
	@Bean
	public Binding bindingStudentServiceToQueue(TopicExchange exchange) {
		return BindingBuilder.bind(studentServiceQueue()).to(exchange).with(ROUTINGKEY); // to give exchange as parameter I need to create to method
	}
	
}
