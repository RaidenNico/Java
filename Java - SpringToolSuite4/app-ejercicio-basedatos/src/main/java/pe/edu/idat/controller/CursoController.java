package pe.edu.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.idat.model.bd.Curso;
import pe.edu.idat.service.CursoService;

@Controller
@RequestMapping("/Curso")
public class CursoController {
	@Autowired
	private CursoService cursoService;
	
	
	@GetMapping("/frmRegistrarCurso")
	public String registrarCurso(Model model) {
		model.addAttribute("objCurso", new Curso());
		model.addAttribute("visualizar", false);
		return "Curso/frmRegistrarCurso";
	}
	@GetMapping("/frmListarCurso")
	public String listarCurso(Model model) {
		model.addAttribute("listcursos", 
				cursoService.listarCursos());
		return "Curso/frmListarCurso";
	}

}
