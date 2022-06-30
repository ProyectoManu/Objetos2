package Gestion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1;
		
		p1 = new Persona();
		//p1.nombre="Ana";
		Persona p2= new Persona("María", "Sánchez");
		
		//p2.nombre="David";
		
		Persona p3= new Persona("David","Martin",23,"Hombre",80,170);
		System.out.println(p3);
		
		Persona copia= new Persona(p3);
		
		Persona referencia=p3;
		//p3.nombre="otro";
		
		System.out.println(copia);
		System.out.println(p3);
		
		System.out.println("La persona 3 es ");
		p3.mostrar();
		System.out.println("La persona copia es ");
		copia.mostrar();
		
		p3.setEdad(28);
		System.out.println("La edad de p3 es "+p3.getEdad());
		p3.setEdad(-30);
		System.out.println("La edad de p3 es "+p3.getEdad());
		
		if (p3.esMayorDeEdad()) {
			System.out.println(p3.getNombre()+ " es mayor de edad");
		} else {
			System.out.println(p3.getNombre()+ " NO mayor de edad");
		}
	}
		
		
		
		
		
		

	}


