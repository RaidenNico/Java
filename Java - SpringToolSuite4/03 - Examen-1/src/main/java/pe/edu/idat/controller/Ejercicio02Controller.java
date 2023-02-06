package pe.edu.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.idat.model.Ejercicio02Form;

@Controller
public class Ejercicio02Controller {
  
  @GetMapping("/ejercicio02")
  public String getPage(Model model) {
	  model.addAttribute("ej2Form", new Ejercicio02Form());
    return "ejercicio02";
  }
  
  @PostMapping("/ejercicio02")
	public String calculomonto(
			@ModelAttribute("ej2Form") Ejercicio02Form ej2Form, Model model)
	{
		int cuotas =0;
		double interes =0.0;
		double monto = ej2Form.getMonto();
		
		if (monto >= 5000) {
			cuotas = 3;
		} else if (monto <= 1000) {
			cuotas = 1;
		} else if (monto >= 2000 && monto <= 3000) {
			cuotas = 2;
		} else {
			cuotas = 5;
		}
		
		if (monto < 4000) {
			interes = 0.12;
		} else {
			interes = 0.10;
		}
		double total = monto + (monto * interes);
		double cuota = total / cuotas;
		
		model.addAttribute("cuotas","Tiene que pagar en " + cuotas + " cuotas");
		model.addAttribute("cuota", "En una cantidad de "+ String.format("%.2f", cuota) + " dolares");
		return "resEjercicio02";
	}
  
}
