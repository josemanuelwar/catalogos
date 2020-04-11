import java.util.Scanner;

public class Menu {
	
	protected int salir;
	
	protected String nombre;
	protected String Raza;
	protected int Tamano;
	
	protected int ID;
	protected String Modelo;
	protected String Color;
	
	public Menu() {
		this.salir=0;
	}
	
	public void selecciondemenus() {
		Scanner lectura = new Scanner(System.in);
		Lista lista = new Lista();
		do {
			System.out.println("Persiona 1 si bas agregar un perro precionas 2 si va agragar una peloata");
			System.out.println("Presiona 3 si bas a editar un perro Preciona 4 Si vas a editar una pelota");
			System.out.println("Preciona 5 si bas a mostrar la informacion de un perro preciona 6 si bas a mostrar informacion de una pelota");
			System.out.println("Preciona 7 si bas a eliminar un perro preciona 8 si vas a eliminar un pelota");
			System.out.println("---------- esperando respuesta precionas 0 salir ----------------");
			salir=lectura.nextInt();
			
			switch(salir) {
				
				case 1:
					System.out.println("ingresa el nombre del perro");
					nombre=lectura.next();
					System.out.println("ingresa el raza del perro");
					Raza=lectura.next();
					System.out.println("ingresa el tamaño del perro");
					Tamano=lectura.nextInt();
					Perro perro = new Perro(nombre,Raza,Tamano);
					lista.guardar(perro);
				break;
				
				case 2:
					System.out.println("ingresa el id de la pelota");
					ID=lectura.nextInt();
					System.out.println("ingresa el modelo de la pelota");
					Modelo=lectura.next();
					System.out.println("ingresa el color de la pelota");
					Color=lectura.next();
					Pelota pelota = new Pelota(ID,Modelo,Color);
					lista.guardar(pelota);
				break;
				
				case 3:
					System.out.println("ingresa el numero del perro a editar");
					int index=lectura.nextInt();
					System.out.println("ingresa el nombre del perro");
					nombre=lectura.next();
					System.out.println("ingresa el raza del perro");
					Raza=lectura.next();
					System.out.println("ingresa el tamaño del perro");
					Tamano=lectura.nextInt();
					Perro perro1 = new Perro(nombre,Raza,Tamano);
					lista.editar(index, perro1);
					
				break;
				
				case 4:
					System.out.println("ingresa el numero del pelota a editar");
					index=lectura.nextInt();
					System.out.println("ingresa el id de la pelota");
					ID=lectura.nextInt();
					System.out.println("ingresa el modelo de la pelota");
					Modelo=lectura.next();
					System.out.println("ingresa el color de la pelota");
					Color=lectura.next();
					Pelota pelota1 = new Pelota(ID,Modelo,Color);
					lista.editar(index, pelota1);
				break;
				
				case 5:
					lista.mostrar();
				break;
				
				case 6:
					lista.mostrarp();
				break;
				
				case 7:
					System.out.println("ingresa el numero del perro a eliminar");
					index=lectura.nextInt();
					lista.eliminar(index);
				break;
				
				case 8:
					System.out.println("ingresa el numero del pelota a eliminar");
					index=lectura.nextInt();
					lista.eliminarp(index);
				break;
			
			}
		}while(salir != 0);
		
		
	}

}
