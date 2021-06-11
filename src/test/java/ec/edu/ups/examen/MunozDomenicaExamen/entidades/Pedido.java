package ec.edu.ups.examen.MunozDomenicaExamen.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;





/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity
public class Pedido implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	
	private int numero;
	private Date fecha;
	private String nombrecliente;
	private float subtotal;
	private float iva;
	private float total;
	private String observaciones;
	
	
	
	
	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", nombrecliente=" + nombrecliente + ", subtotal="
				+ subtotal + ", iva=" + iva + ", total=" + total + ", observaciones=" + observaciones + "]";
	}

	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombrecliente() {
		return nombrecliente;
	}
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	


	public Pedido(int numero, Date fecha, String nombrecliente, float subtotal, float iva,float total, String observaciones) {
		this.setNumero(numero);
		this.setFecha(fecha);
		this.setNombrecliente(nombrecliente);
		this.setSubtotal(subtotal);
		this.setIva(iva);
		this.setTotal(total);
		this.setObservaciones(observaciones);
		
	}



	
   
}
