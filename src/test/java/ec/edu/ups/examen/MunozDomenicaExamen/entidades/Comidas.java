package ec.edu.ups.examen.MunozDomenicaExamen.entidades;

import java.io.Serializable;

import javax.persistence.Entity;


/**
 * Entity implementation class for Entity: Comidas
 *
 */
@Entity
public class Comidas implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String nombre;
	private float preciounitario;

	
	
	
	public Comidas(int codigo, String nombre, float preciounitario) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setPreciounitario(preciounitario);
	}
	
	@Override
	public String toString() {
		return "Comidas [codigo=" + codigo + ", nombre=" + nombre + ", preciounitario=" + preciounitario + "]";
	}





	public int getCodigo() {
		return codigo;
	}





	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public float getPreciounitario() {
		return preciounitario;
	}





	public void setPreciounitario(float preciounitario) {
		this.preciounitario = preciounitario;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	public Comidas() {
		super();
	}
   
}
