package ec.edu.ups.examen.MunozDomenicaExamen.controlador;

import java.util.Date;

import javax.ejb.EJB;

import ec.edu.ups.examen.MunozDomenicaExamen.ejb.ComidaFacade;
import ec.edu.ups.examen.MunozDomenicaExamen.ejb.PedidosFacade;
import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Pedido;

public class Crear {
	
	private static final long serialVersionUID = 1L;
	
	
	@EJB
	private PedidosFacade pedido;
	
	@EJB
	private ComidaFacade comida;
	
	public void crear() {
		
		Pedido ped=new Pedido(1,new Date(),(float)12.45,(float)12,(float)23,"observacion");
	}

}
