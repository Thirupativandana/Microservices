package com.cts.emart.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Register;



@RestController

@RequestMapping("/info")

public class RegisterController {
	
	
@RequestMapping("/all")
	List<Register> getAllRegisters() {
	
	return Arrays.asList(
			new Register("yamini","gunti","134576","9876543210","xyz@gmail.com"));
				
}
	

}


