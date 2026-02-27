package com.capgemini.Assigment3_26Feb2026ProductCategory.exception;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ApplicationException {
//	//acts as a catch block to handle exception
//		@ExceptionHandler(Exception.class)
//		public String handleException() {
//			return "Exception Handle Method";
//		}
//		
//		@ExceptionHandler(DataNotExist.class)
//		public String handleException1() {
//			return "Data Not Exist";
//		}
//		
//		@ExceptionHandler(CategoryNotFoundException.class)
//		public String handleException2(CategoryNotFoundException ex) {
//			return ex.getMessage();
//		}
@ExceptionHandler(CategoryNotFoundException.class){
	public ResponseEntity<String> handleException(CategoryNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
}

}