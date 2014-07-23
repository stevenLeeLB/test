package com.spring.utils;

import java.beans.PropertyEditorSupport;

import org.apache.commons.lang.StringUtils;


public class CustomBigDecimalEditor extends PropertyEditorSupport {
	
	public void setAsText(String text) throws IllegalArgumentException {
		if (StringUtils.isEmpty(text)) {
			setValue(null);
		} else {
			setValue(NumberUtils.getBigDecimal(text));
		}
	}

}
