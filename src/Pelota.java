
public class Pelota {
	private int ID;
	private String Modelo;
	private String Color;
	
	public Pelota() {
		this.ID=0;
		this.Modelo="";
		this.Color="";
	}
	
	public Pelota(int id, String modelo, String Color) {
		this.ID = id;
		this.Modelo = modelo;
		this.Color = Color;
	}
	
	/*declaramos los get de la clase*/
	public int getId() {
		return ID;
	}
	
	public String getModelo() {
		return Modelo;
	}
	
	public String getColor() {
		return Color;
	}
	/* declaramos los set de la clase */
	
	public void setId( int id) {
		this.ID=id;
	}
	
	public void setModelo(String modelo) {
		this.Modelo=modelo;
	}
	
	public void setColor(String color) {
		this.Color=color;
	}
	
	/* metodo para mostrar la salidad a comsola*/
	
	public String tostring() {
		return "El id de pelota: "+ID+" El modelo : "+Modelo+" EL color: "+Color;
	}

}
