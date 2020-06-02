package ec.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.entidad.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, String> implements LibroDAO{

	public JPALibroDAO() {
		super(Libro.class);
		this.em = Persistence.createEntityManagerFactory("CalleOrtega-Pablo-Examen").createEntityManager();
		// TODO Auto-generated constructor stub
	}

}