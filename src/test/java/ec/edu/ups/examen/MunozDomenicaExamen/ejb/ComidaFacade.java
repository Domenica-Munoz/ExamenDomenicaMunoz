package ec.edu.ups.examen.MunozDomenicaExamen.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Comidas;
import ec.edu.ups.examen.MunozDomenicaExamen.entidades.Pedido;

public class ComidaFacade extends AbstractFacade<Comidas> {

	public ComidaFacade() {
		super();
		// TODO Auto-generated constructor stub
	}

	private EntityManager em;
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	public List<Comidas> Comida(){
		 List<Comidas>comidas=new ArrayList<Comidas>(); 
		 String consulta ="Select pC From Pedido pC order by pc.numero desc";
		 try {
	 		comidas = em.createQuery(consulta).getResultList();
	 	}catch(Exception e) {
	 		System.out.println(">>>Warning (PersonaFacade:buscarPornumero )"+e.getMessage());
	 	}
	 	return comidas;
	 
		 
	 }
	
}
