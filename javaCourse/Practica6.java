import java.util.Scanner;

public class Practica6{
	public static void main(String args[]){

		String mainString = "", corteString = "";
		int numChar = 0, fromChar = 0, toChar = 0;

		Scanner in = new Scanner(System.in);

		System.out.print("Hola, por favor introduce una palabra: ");
		mainString = in.nextLine();

		numChar = mainString.length();

		System.out.println("Su palabra" + mainString + " posee " + numChar + " caracteres");

		System.out.print("¿Ahora, desde que caracter quiere cortar la palabra? Introduzca el numero: ");
		fromChar = in.nextInt();
		System.out.print("¿Hasta que caracter desea cortar?: ");
		toChar = in.nextInt();

		corteString = mainString.substring(fromChar, toChar);
		System.out.print("Ha cortado desde el caracter " + fromChar + " hasta " + toChar + " y el resultado es: " + corteString);

	}
}

//Problema: el usuario debe introducir un string, se deberá contar cuantos caracteres tiene y preguntar desde que caracter hasta que caracter quiere obtener.