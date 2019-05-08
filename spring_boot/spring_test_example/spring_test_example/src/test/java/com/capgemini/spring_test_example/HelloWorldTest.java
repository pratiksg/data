package com.capgemini.spring_test_example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldTest 
{
	private MockMvc mockMvc;
	@InjectMocks
	private HelloWorld helloWorld; 

	@Before
	public void setUp()throws Exception 
	{
		mockMvc=MockMvcBuilders.standaloneSetup(helloWorld).build();
	}
	@Test
	public void testHello() throws Exception 
	{
		
		mockMvc.perform(MockMvcRequestBuilders.get("/hello"));
		System.out.println("hello");
		
	}

}
