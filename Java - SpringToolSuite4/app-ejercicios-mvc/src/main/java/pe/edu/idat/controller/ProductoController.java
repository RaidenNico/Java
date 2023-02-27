package pe.edu.idat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import pe.edu.idat.model.Producto;
import pe.edu.idat.model.VentaProducto;
import pe.edu.idat.service.ProductoService;

@Controller
@RequestMapping("/Producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/formVentaProducto")
	public String formVentaProducto(Model model) {
		model.addAttribute("ventaproductoform", new VentaProducto());
		model.addAttribute("lstproductos", 
				productoService.listarProductos());
		model.addAttribute("visualizar", false);
		return "Producto/formventaproducto";
	}
	
	@PostMapping("/registrarProducto")
	public String registrarProducto(
			@ModelAttribute("ventaproductoform") VentaProducto ventaProducto,
			final HttpServletRequest request,
			Model model) {
		List<VentaProducto> listVentaProducto = 
				(List<VentaProducto>)request.getSession()
				.getAttribute("lstproducto");
		if(CollectionUtils.isEmpty(listVentaProducto)) {
			listVentaProducto = new ArrayList<>();
		}
		Producto objProducto = productoService
				.buscarProducto(ventaProducto.getCodProducto());
		Double precioTotalProducto = ventaProducto.getCantidadTotal() * 
				objProducto.getPrecioProducto();
		String respuesta = "El precio unitario del producto: "
				+objProducto.getNomProducto()+ " es: " 
				+objProducto.getPrecioProducto() + ", valor total de venta: "
				+precioTotalProducto;
		VentaProducto objVentaProd = new VentaProducto
				(objProducto.getCodProducto(), 
						objProducto.getNomProducto(),
						ventaProducto.getCantidadTotal(),
						precioTotalProducto);
		List<VentaProducto> nuevaListaVentaProd = 
				productoService.agregarProducto(objVentaProd, 
						listVentaProducto);
		request.getSession().setAttribute("lstproducto", nuevaListaVentaProd);
		model.addAttribute("ventaproductoform", new VentaProducto());
		model.addAttribute("lstproductos", productoService.listarProductos());
		model.addAttribute("visualizar", true);
		model.addAttribute("respuesta", respuesta);
		return "Producto/formventaproducto";
	}
	
	@GetMapping("/listarVentaProductos")
	public String listarVentaProductos(Model model,
			final HttpSession session) {
		List<VentaProducto> listVentaProducto = 
				(List<VentaProducto>)session.getAttribute("lstproducto");
		if(CollectionUtils.isEmpty(listVentaProducto)) {
			listVentaProducto = new ArrayList<>();
		}
		model.addAttribute("lstventaproducto", listVentaProducto);
		return "Producto/listarventaproducto";
	}

}
