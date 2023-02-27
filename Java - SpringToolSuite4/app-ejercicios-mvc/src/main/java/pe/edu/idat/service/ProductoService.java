package pe.edu.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.idat.model.Producto;
import pe.edu.idat.model.VentaProducto;

@Service
public class ProductoService {

	public List<Producto> listarProductos(){
		List<Producto> lstProductos = new ArrayList<>();
		lstProductos.add(new Producto("P001", "Arroz", 3.8));
		lstProductos.add(new Producto("P002", "Azucar", 3.2));
		lstProductos.add(new Producto("P003", "Mantequilla", 5.8));
		lstProductos.add(new Producto("P004", "Yogurt", 6.2));
		lstProductos.add(new Producto("P005", "Leche", 3.7));
		lstProductos.add(new Producto("P006", "Galletas", 1.8));
		return lstProductos;
	}
	
	public Producto buscarProducto(String codProducto) {
		Producto objProducto = null;
		for(Producto objProd: listarProductos()) {
			if(objProd.getCodProducto().equals(codProducto)) {
				objProducto = objProd; break;
			}
		}
		return objProducto;
	}
	
	public List<VentaProducto> agregarProducto(VentaProducto objVentaProducto,
			List<VentaProducto> listVentaProducto){
		Boolean nuevoActualizado = false;
		Boolean agregarNuevo = false;
		List<VentaProducto> listNuevaVentaProducto = new ArrayList<>();
		if(listVentaProducto.size() == 0) {
			listNuevaVentaProducto.add(objVentaProducto);
		}else {
			for(VentaProducto objVenta: listVentaProducto) {
				if(objVenta.getCodProducto().equals(
						objVentaProducto.getCodProducto())) {
					listNuevaVentaProducto
					.add(new VentaProducto(objVenta.getCodProducto(),
							objVenta.getNomProducto(), 
							objVenta.getCantidadTotal() + objVentaProducto.getCantidadTotal(), 
							objVenta.getPrecioTotal() + objVentaProducto.getPrecioTotal()));
					nuevoActualizado = true; agregarNuevo = false;
				}else {
					listNuevaVentaProducto.add(objVenta);
					if(nuevoActualizado) {
						agregarNuevo = false;
					}else {
						agregarNuevo = true;
					}
				}
			}
			if(agregarNuevo) {
				listNuevaVentaProducto.add(objVentaProducto);
			}
		}
		return listNuevaVentaProducto;
	}
}
