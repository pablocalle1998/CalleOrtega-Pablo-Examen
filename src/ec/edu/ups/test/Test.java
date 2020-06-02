package ec.edu.ups.test;


import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.entidad.Libro;
import ec.edu.ups.entidad.Capitulo;

public class Test {

	public static void main(String[] args) {
		
		LibroDAO lib = DAOFactory.getFactory().getLibroDAO();
		CapituloDAO cap = DAOFactory.getFactory().getCapituloDAO();
		AutorDAO aut = DAOFactory.getFactory().getAutorDAO();
		
		Libro l1 =new Libro("0001","Matematicas Avanzadas", "0-7645-2641-1","500");
		Libro l2 =new Libro("0002","Metodos Numericos", "0-7645-2641-2","600");
		
		
		
		System.out.println(l1);
		//lib.create(l2);
		System.out.println("Libro creado");
		/*
		System.out.println("Agregando capitulo al libro");
		Capitulo c1 = new Capitulo("01","1","Inicio",l1);
		Autor a1 = new Autor("01", "Juan", "Ecuatoriano", v1);
		tick.create(t1);
		cap.create(c1);
		System.out.println("capitulo creado");
		*/
		System.out.println("Libro creado: " +lib.findAll());
		System.out.println("Autor creado: " +aut.findAll());
		
		

	}

}