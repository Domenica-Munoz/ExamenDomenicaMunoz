package ec.edu.ups.examen.MunozDomenicaExamen.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TarjetaCredito
 *
 */
@Entity

public class TarjetaCredito implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int numerotarjeta;
	private String dueno;
	private Date fechacaducidad;
	private int codigovericacion;
	
	
	
	public TarjetaCredito(int numero, String dueno, Date fecha, int codigo) {
		this.setNumerotarjeta(numero);
		this.setDueno(dueno);
		this.setFechacaducidad(fecha);
		this.setCodigovericacion(codigo);
		
	}

	@Override
	public String toString() {
		return "TarjetaCredito [numerotarjeta=" + numerotarjeta + ", dueno=" + dueno + ", fechacaducidad="
				+ fechacaducidad + ", codigovericacion=" + codigovericacion + "]";
	}





	public int getNumerotarjeta() {
		return numerotarjeta;
	}





	public void setNumerotarjeta(int numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}





	public String getDueno() {
		return dueno;
	}





	public void setDueno(String dueno) {
		this.dueno = dueno;
	}





	public Date getFechacaducidad() {
		return fechacaducidad;
	}





	public void setFechacaducidad(Date fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}





	public int getCodigovericacion() {
		return codigovericacion;
	}





	public void setCodigovericacion(int codigovericacion) {
		this.codigovericacion = codigovericacion;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	public TarjetaCredito() {
		super();
	}
   
}
