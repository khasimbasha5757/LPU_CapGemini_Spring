package com.capgemini.Assigment3_26Feb2026ProductCategory.exception;

public class CategoryNotFoundException extends RuntimeException{
	public CategoryNotFoundException(String mesg){
		super(mesg);
	}
}
