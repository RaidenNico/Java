package pe.edu.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.idat.model.LoginForm;

@Controller
public class LoginController {
	
	
	 @GetMapping("/login")
		public String autenticacion(Model model) {
		 model.addAttribute("loginForm", new LoginForm());
			return "login";
		}
	 
	 @PostMapping("/login")
	 public String autenticacion(
			 @ModelAttribute("loginForm") LoginForm loginForm, 
			 Model model) {
		 if(loginForm.getUsuario().equals("sl72680242") && loginForm.getPassword().equals("sl72680242")){
			 model.addAttribute("mensaje", "Bienvenido " + loginForm.getUsuario());
			 return "index";
		 		 }
		 return "";
	 }
}
