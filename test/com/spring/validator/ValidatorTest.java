package com.spring.validator;

import org.junit.Test;
import org.springframework.validation.Errors;

import com.spring.domian.Person;

public class ValidatorTest {

	@Test
	public void person(){
		Person p = new Person();
		p.setAge(120);
		PersonValidator pv = new PersonValidator();
		System.out.println();
	}
}
