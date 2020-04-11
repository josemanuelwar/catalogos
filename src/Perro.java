
public class Perro {
	private String nombre;
	private String Raza;
	private int Tamano;
	
	public Perro() {
		this.nombre	=	"";
		this.Raza	=	"";
		this.Tamano	=	0;
	}
	
	public Perro(String nombre, String Raza, int Tamaño) {
		this.nombre	=	nombre;
		this.Raza	=	Raza;
		this.Tamano	=	Tamaño;
	}
	
	/*declaramos los get de la clase*/
	public String getNombre() {
		return nombre;
	}
	
	public String getRaza() {
		return Raza;
	}
	
	public int getTamano() {
		return Tamano;
	}
	/* declaramos los set de la clase */
	
	public void setNombre(String nombre) {
		this.nombre	=	nombre;
	}
	
	public void setRaza(String Raza) {
		this.Raza	=	Raza;
	}
	
	public void setTamaño(int tamaño) {
		this.Tamano=tamaño;
	}
	
	/* metodo para mostrar la salidad a comsola*/
	
	public String tostring() {
		return "Nombre del perro: "+nombre+" Raza del perro: "+Raza+" Tamano del perro: "+Tamano;
	}
}
