package pe.edu.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.idat.model.Ejercicio01Form;

@Controller
public class Ejercicio01Controller {
	
  @GetMapping("/ejercicio01")
	public String getPage(Model model) {
		// En un almacén se descuenta 20% del precio al cliente si el valor a pagarse
		// es mayor a $200, este valor es calculado por la multiplicación de la
		// cantidad y precio que será ingresado desde la aplicación.

		model.addAttribute("ej1Form", new Ejercicio01Form());
		return "ejercicio01";
	}

	@PostMapping("/ejercicio01")
	public String calcular(@ModelAttribute("ej1Form") Ejercicio01Form ej1Form, Model model) {

		double precio = ej1Form.getPrecio();
		double cantidad = ej1Form.getCantidad();
		// se obtiene el pago
		double pago = cantidad * precio;

		//verificamos si es mayor a 200
		if(pago > 200) {
			double descuento = pago * 0.2;
      pago = pago -  descuento;
		}

		model.addAttribute("titulo", "Respuesta Ejercicio01");
		model.addAttribute("resultado", "El pago es de " + String.format("%.2f", pago));
		
		return "resEjercicio01";
	}
}
