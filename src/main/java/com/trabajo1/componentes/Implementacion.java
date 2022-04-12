package com.trabajo1.componentes;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Implementacion implements Dependencia {

	@Override
	public void salida_mensaje(String mensaje) {
		System.out.println("La respuesta es: " + mensaje);
	}

	@Override
	public int leer_teclado() {
		System.out.println("Ingrese un numero: ");
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}

	@Override
	public String suma(int a, int b) {
		int resultado = a + b;
		return String.valueOf(resultado);
	}

	@Override
	public String resta(int a, int b) {
		int resultado = a - b;
		return String.valueOf(resultado);
	}

	@Override
	public String multiplicacion(int a, int b) {
		int resultado = a * b;
		return String.valueOf(resultado);
	}

	@Override
	public String division(int a, int b) {
		int resultado = a / b;
		return String.valueOf(resultado);
	}

	@Override
	public String mayor(int a, int b) {
		if (a > b) {
			return "El numero " + a + " es mayor que el numero " + b;
		} else {
			return "El numero " + b + " es mayor que el numero " + a;
		}
	}

	@Override
	public ArrayList<String> tabla(int numero) {
		ArrayList<String> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(String.valueOf(i * numero));
		}
		return lista;
	}
	
	
}
