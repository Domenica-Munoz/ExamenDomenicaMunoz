package ec.edu.ups.examen.MunozDomenicaExamen.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Pedido;

public class PedidosFacade extends AbstractFacade<Pedido>{
	private EntityManager em;

	public PedidosFacade(Class<PedidosFacade> entityClass) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
     
 public List<Pedido> Pedido(){
	 List<Pedido>pediso=new ArrayList<Pedido>(); 
	 String consulta ="Select pC From Pedido pC order by pc.numero desc";
	 try {
 		pediso = em.createQuery(consulta).getResultList();
 	}catch(Exception e) {
 		System.out.println(">>>Warning (PersonaFacade:buscarPornume )"+e.getMessage());
 	}
 	return pediso;
 
	 
 }
}
