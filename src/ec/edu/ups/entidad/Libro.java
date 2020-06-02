package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity
public class Libro implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	//codigo, nombre, ISBN y número de páginas
	@Id
	private String codigo;
	private String nombre;
	private String ISBN;
	private String numeroPaginas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private List<Capitulo> capitulos= new ArrayList<Capitulo>();

	public Libro() {
		super();
	}

	public Libro(String codigo, String nombre, String ISBN, String numeroPaginas, List<Capitulo> capitulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ISBN = ISBN;
		this.numeroPaginas = numeroPaginas;
		this.capitulos = capitulos;
	}

	public Libro(String codigo, String nombre, String ISBN, String numeroPaginas) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ISBN = ISBN;
		this.numeroPaginas = numeroPaginas;
	}

	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", ISBN=" + ISBN + ", numeroPaginas=" + numeroPaginas
				+ ", capitulos=" + capitulos + "]";
	}

	

}
