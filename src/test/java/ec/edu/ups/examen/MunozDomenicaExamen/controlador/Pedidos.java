package ec.edu.ups.examen.MunozDomenicaExamen.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;


import ec.edu.ups.examen.MunozDomenicaExamen.ejb.ComidaFacade;
import ec.edu.ups.examen.MunozDomenicaExamen.ejb.PedidosFacade;
import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Comidas;
import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Pedido;

public class Pedidos  {

	private static final long serialVersionUID = 1L;
	
	@EJB
	private PedidosFacade pedidos;
	
	@EJB
	private ComidaFacade comidas;
	
	
	public static List<Pedido> pedido = new ArrayList<Pedido>();
	private List<Comidas> comida = new ArrayList<Comidas>();
	
	public void init() {
		
		
	}
	
	
	
	
}
