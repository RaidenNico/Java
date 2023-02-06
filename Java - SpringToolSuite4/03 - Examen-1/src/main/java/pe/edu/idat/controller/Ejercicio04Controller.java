package pe.edu.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.idat.model.Ejercicio03Form;

@Controller
public class Ejercicio04Controller {
  
  @GetMapping("/ejercicio04")
  public String getPage(Model model) {
    // Ingresar el límite de número y por cada número de la secuencia obtener
    // su cubo y su cuarta.
    
    model.addAttribute("ej4Form", new Ejercicio03Form());
    return "ejercicio04";
  }

  @PostMapping("/ejercicio04")
	public String calcular(@ModelAttribute("ej4Form") Ejercicio03Form ej4Form, Model model) {

		int limite = ej4Form.getNumero();
    String[] arrayMsg = new String[limite];  

    for (int i = 1; i <= limite; i++) {
      int cubo = i * i * i;
      int cuarta = cubo * i;
      arrayMsg[i-1] = "El número " + i + " tiene como cubo " + cubo + " y como cuarta " + cuarta;
    }

		model.addAttribute("arrayRes", arrayMsg);
		
		return "resEjercicio04";
	}
}
