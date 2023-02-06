package pe.edu.idat.model;

public class MntForm {

		private Double Monto;
		private Double  Ncuotas;
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
		public MntForm(Double monto, Double ncuotas) {
			super();
			Monto = monto;
			Ncuotas = ncuotas;
		}
		public MntForm() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
