package com.uca.capas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.User;

@Controller
public class mainController {
	
	/*Credentials = user: azzar
	 * 				pass: 3399
	 */
	
	@GetMapping("/login")
	public String sendForm(User user) {
		return "Login";
	}
	
	
	@PostMapping("/validacion")
	public String procesForm(User user) {
		if (user.getUser().contentEquals("azzar") &&
				user.getPass().contentEquals("3399")) {
			return "mostrarMensajeV";
		}else {return "mostrarMensajeF";}
	}

}
