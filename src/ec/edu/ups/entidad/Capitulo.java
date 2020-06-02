package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity

public class Capitulo implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	//codigo, número, y título
	@Id
	private String codigo;
	private int numero;
	private String titulo;
	
	@ManyToOne
	@JoinColumn
	private Libro libro;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="capitulo")
	private Autor autor;

	public Capitulo() {
		super();
	}
	
	

	public Capitulo(String codigo, int numero, String titulo, Libro libro) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.titulo = titulo;
		this.libro= libro;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Libro getLibro() {
		return libro;
	}



	public void setLibro(Libro libro) {
		this.libro = libro;
	}



	public Autor getAutor() {
		return autor;
	}



	public void setAutor(Autor autor) {
		this.autor = autor;
	}



	

}
