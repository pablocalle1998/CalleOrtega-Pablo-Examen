package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Telefono
 *
 */
@Entity
public class Autor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//codigo, nombre y nacionalidad
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String nacionalidad;
	@OneToOne
	@JoinColumn
	private Capitulo capitulo;
	
	
	public Autor() {
		super();
	}


	public Autor(int codigo, String nombre, String nacionalidad, Capitulo capitulo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.capitulo = capitulo;
	}





	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public Capitulo getCapitulo() {
		return capitulo;
	}


	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
	}


	
}
