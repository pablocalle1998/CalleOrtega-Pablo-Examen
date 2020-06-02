package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.entidad.Libro;
import ec.edu.ups.entidad.Capitulo;

/**
 * Servlet implementation class AgregarCapitulos
 */
@WebServlet("/AgregarCapitulos")
public class AgregarCapitulos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCapitulos() {
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
		
		String titulo="";
		String numero="";
		String codigo="";
		
		Capitulo capitulo = new Capitulo();
		Libro libro = new Libro();
		LibroDAO libDao = DAOFactory.getFactory().getLibroDAO();
		String accion = request.getParameter("resp");
		CapituloDAO capituloDAO = DAOFactory.getFactory().getCapituloDAO();
		
		if(accion.equals("Registrar")) {
			codigo = request.getParameter("codigo");
			numero = request.getParameter("numero");
			titulo = request.getParameter("titulo");
			
			libro = libDao.read(codigo);
			System.out.println("Libro a ser agregado");
			
			capitulo = new Capitulo();
			System.out.println("el libro: "+libro);
			
			
			getServletContext().getRequestDispatcher("/JSP/Index.jsp").forward(request, response);
		}
		
	}

}