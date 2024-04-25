package bean;

/**
 * @author David
 */
public class Persona {
	
	
	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	
	/**
	 * 
	 * @param nombre de la persona
	 * @param edad de la persona
	 * @param peso de la persona
	 * @param altura de la persona
	 */
	public Persona(String nombre, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * 
	 * @return devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre del nombre del set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * 
	 * @return devuelve la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad de la edad del set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	/**
	 * 
	 * @return devuelve el peso de la persona
	 */
	public int getPeso() {
		return peso;
	}
	
	/**
	 * 
	 * @param peso del peso del set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	/**
	 * 
	 * @return devuelve la altura de la persona
	 */
	public int getAltura() {
		return altura;
	}
	
	/**
	 * 
	 * @param altura de la altura del set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "[" + nombre + " - " + edad + " - " + peso + " - " + altura + "]";
	}
	
	
	
	
	
	
	
	
	
}
