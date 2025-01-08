package com.exception.globalexception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exception.ex.BookIdAlreadyExistException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BookIdAlreadyExistException.class)
    public String globalBookExceptionHandler(BookIdAlreadyExistException ex, Model model) {
      
        model.addAttribute("duplicateBook", ex.getDuplicateBook());
        model.addAttribute("errorMessage", ex.getMessage());
        
      
        return "add-book";  
    }

}
