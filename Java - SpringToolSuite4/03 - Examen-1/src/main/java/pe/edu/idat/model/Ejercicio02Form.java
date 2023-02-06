package pe.edu.idat.model;

public class Ejercicio02Form {
	
	private Double Monto;
	private Double  Ncuotas;
	
	public Ejercicio02Form(Double monto, Double ncuotas) {
		super();
		Monto = monto;
		Ncuotas = ncuotas;
	}
	
	public Ejercicio02Form() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Double getMonto() {
		return Monto;
	}
	
	public void setMonto(Double monto) {
		Monto = monto;
	}
	
	public Double getNcuotas() {
		return Ncuotas;
	}
	
	public void setNcuotas(Double ncuotas) {
		Ncuotas = ncuotas;
	}
}
