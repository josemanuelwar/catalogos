
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*obyect de perro*/
		Perro perro = new Perro("Tiburon","corriente",12);
		Perro perro1 = new Perro("Rocy","pastro aleman",12);
		Perro perro2 = new Perro("Tobi","pitbull",12);
		
		Lista lista = new Lista();
		
		lista.guardar(perro);
		lista.guardar(perro1);
		lista.guardar(perro2);
		Perro perroa = new Perro("cheila","labrador",12);
		lista.mostrar();
		lista.buscar(2);
		lista.editar(1, perroa);
		lista.eliminar(0);
		
		/***pelota**/
		
		Pelota pelota = new Pelota(1,"ll","lk");
		Pelota pelota1 = new Pelota(1,"ch","lhf");
		Pelota pelota2 = new Pelota(1,"xv","k");
		
		Lista lista1 = new Lista();
		
		lista1.guardar(pelota);
		lista1.guardar(pelota1);
		lista1.guardar(pelota2);
		Pelota morad = new Pelota(2,"lls","kdhduy");
		lista1.mostrarp();
		lista1.buscarp(2);
		lista1.editar(1, morad);
		lista1.eliminarp(0);

	}

}
