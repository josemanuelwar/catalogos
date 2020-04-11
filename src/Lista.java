import java.util.ArrayList;
import java.util.List;
public class Lista implements Metodos {
	
	List<Perro> lista = new ArrayList<Perro>();
	List<Pelota> listas = new ArrayList<Pelota>();
	/**perro*/
	@Override
	public void guardar(Perro perito) {
		lista.add(perito);
	}
	
	public void editar(int indice, Perro perito) {
		lista.set(indice, perito);
	}
	public void eliminar(int indice) {
		lista.remove(indice);
	}
	public void mostrar() {
		System.out.println(lista);	
		
	}
	public void buscar(int indice) {
		System.out.println("Perro encontrado->"+lista.get(indice));

	}
	
	/***pelotas***/
	public void guardar(Pelota pelotita) {
		listas.add(pelotita);
	}
	
	public void editar(int indice, Pelota pelotita) {
		listas.set(indice, pelotita);
	}
	
	public void eliminarp(int indice) {
		listas.remove(indice);
	}
	public void mostrarp() {
		System.out.println(listas);	
	}
	public void buscarp(int indice) {
		System.out.println("Pelota encontrado->"+listas.get(indice));

	}
	
	
	
	
}
