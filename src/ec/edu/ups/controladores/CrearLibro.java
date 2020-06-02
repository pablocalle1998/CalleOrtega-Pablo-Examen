package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.entidad.Libro;

/**
 * Servlet implementation class CrearCliente
 */
@WebServlet("/CrearLibro")
public class CrearLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigo;
		String nombre;
		String ISBN;
		String numeroPaginas;
		
		Libro libro = new Libro();
		
		String accion = request.getParameter("resp");
		LibroDAO libroDAO = DAOFactory.getFactory().getLibroDAO();
		
		if(accion.equals("Registrarse")) {
			codigo = request.getParameter("codigo");
			nombre = request.getParameter("nombre");
			ISBN = request.getParameter("ISBN");
			numeroPaginas = request.getParameter("numeroPaginas");
			
			libro = new Libro(codigo, nombre, ISBN, numeroPaginas);
			System.out.println("el libro: "+libro);
			
			System.out.println("Creando libro en base");
			libroDAO.create(libro);
			System.out.println("Libro creado en la base"+libroDAO.findAll());
			
			getServletContext().getRequestDispatcher("/JSP/Index.jsp").forward(request, response);
		}
		
		
	}

}