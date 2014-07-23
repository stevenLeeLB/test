package com.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.domian.Person;

public class PersonValidator implements Validator {

	@SuppressWarnings("unchecked")
	public boolean supports(Class clazz) {
		return Person.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		Person p = (Person)obj;
		if(p.getAge()<0) 
			e.rejectValue("age", "negativevalue");
		else if(p.getAge()>110) 
			e.rejectValue("age", "too_old");
	}	

}
