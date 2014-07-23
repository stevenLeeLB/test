package com.login.action;

import java.beans.PropertyEditorSupport;

import org.apache.commons.lang.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.domian.Person;

public class RegisterController extends SimpleFormController {

	@SuppressWarnings("deprecation")
	public RegisterController() {
		this.setCommandClass(Person.class);
	}

	protected ModelAndView onSubmit(Object object, BindException arg1)
			throws Exception {
		Person stu = (Person) object;
		return new ModelAndView(getSuccessView(), "person", stu);
	}
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		binder.registerCustomEditor(int.class, new PropertyEditorSupport() {
			public void setAsText(String text) throws IllegalArgumentException {
				Integer num = null;
				if (StringUtils.isEmpty(text)) {
					setValue(0);
					
				} else {
					try{
						num = Integer.parseInt(text);
					}catch(Exception e){
						num = 0;
					}
					setValue(num);
				}
			}
		});
	}
}

