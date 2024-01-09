import java.util.Scanner;

public class Practica4{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String name = "";
		int num1 = 0, num2 = 0, res = 0;

		System.out.println("¿¿Cual es tu nombre??");
		name = entrada.nextLine();

		System.out.println("Dame el primer sumando: ");
		num1 = entrada.nextInt();
		
		System.out.println("Dame el segundo sumando: ");
		num2 = entrada.nextInt();

		int resultado = num1 + num2;

		System.out.println("Hola, " + name +".La suma fue: " + resultado);
	}
}

/*

Problema: programa que pueda recibir el nombre de un usuario y que pueda sumar dos numeros

*/