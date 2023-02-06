package pe.edu.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.idat.model.Ejercicio03Form;

@Controller
public class Ejercicio03Controller {

  @GetMapping("/ejercicio03")
  public String getPage(Model model) {
    // Elabore un algoritmo que solicite un número entero y muestre un mensaje
    // indicando la vocal correspondiente, considerando que la vocal A = 1

    model.addAttribute("ej3Form", new Ejercicio03Form());
    return "ejercicio03";
  }

  @PostMapping("/ejercicio03")
	public String calcular(@ModelAttribute("ej3Form") Ejercicio03Form ej3Form, Model model) {

		int num = ej3Form.getNumero();
    String message = "";

    //verificamos numero damos el mensaje correspondiente
    switch (num) {
      case 1:
        message = "La vocal correspondiente es 'A'";
        break;
      case 2:
        message = "La vocal correspondiente es 'E'";
        break;
      case 3:
        message = "La vocal correspondiente es 'I'";
        break;
      case 4:
        message = "La vocal correspondiente es 'O'";
        break;
      case 5:
        message = "La vocal correspondiente es 'U'";
        break;
      default:
        message = "El número introducido no corresponde a ninguna vocal";
        break;
    }

    model.addAttribute("titulo", "Respuesta Ejercicio03");
		model.addAttribute("resultado", message);
		
		return "resEjercicio01";
	}
}
