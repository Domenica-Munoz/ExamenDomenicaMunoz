package ec.edu.ups.examen.MunozDomenicaExamen.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Pedido;
import ec.edu.ups.examen.MunozDomenicaExamen.entidades.TarjetaCredito;

public class TarjetasFacade extends AbstractFacade<TarjetaCredito> {

	private EntityManager em;
	
	public TarjetasFacade(Class<PedidosFacade> entityClass2) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	
	public List<TarjetaCredito> tarjeta(){
		 List<TarjetaCredito>tarjeta=new ArrayList<TarjetaCredito>(); 
		 String consulta ="Select tr From TarjetaCredito tr order by tr.cliente desc";
		 try {
	 		tarjeta = em.createQuery(consulta).getResultList();
	 	}catch(Exception e) {
	 		System.out.println(">>>Warning (TarjetaFacade:buscarPorcliente )"+e.getMessage());
	 	}
	 	return tarjeta;
	 
		 
	 }
	
	

}
