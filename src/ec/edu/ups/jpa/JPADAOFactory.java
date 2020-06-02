	package ec.edu.ups.jpa;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public LibroDAO getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}

	@Override
	public CapituloDAO getCapituloDAO() {
		// TODO Auto-generated method stub
		return new JPACapituloDAO();
	}

	@Override
	public AutorDAO getAutorDAO() {
		// TODO Auto-generated method stub
		return new JPAAutorDAO();
	}

}