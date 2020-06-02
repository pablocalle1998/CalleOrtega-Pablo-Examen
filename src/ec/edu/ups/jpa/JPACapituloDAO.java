package ec.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.entidad.Capitulo;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, String> implements CapituloDAO{
	
	public JPACapituloDAO() {
		super(Capitulo.class);
		this.em = Persistence.createEntityManagerFactory("CalleOrtega-Pablo-Examen").createEntityManager();
		// TODO Auto-generated constructor stub
	}
	
}