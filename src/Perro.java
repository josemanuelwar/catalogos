
public class Perro extends Menu {
	
	
	public Perro() {
		super();
	}
	
	public Perro(String nombre, String Raza, int Tama�o) {
		this.nombre	=	nombre;
		this.Raza	=	Raza;
		this.Tamano	=	Tama�o;
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
	
	public void setTama�o(int tama�o) {
		this.Tamano=tama�o;
	}
	
	/* metodo para mostrar la salidad a comsola*/
	
	public String tostring() {
		return "Nombre del perro: "+nombre+" Raza del perro: "+Raza+" Tamano del perro: "+Tamano;
	}
}
