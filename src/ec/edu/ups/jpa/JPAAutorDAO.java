package ec.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.entidad.Autor;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO{

	public JPAAutorDAO() {
		super(Autor.class);
		this.em = Persistence.createEntityManagerFactory("CalleOrtega-Pablo-Examen").createEntityManager();
	}
	
}