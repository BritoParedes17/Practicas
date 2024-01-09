import java.util.Scanner;

public class Practica7{
	public static void main(String args[]){
		int numIn[] = new int[5];
		Scanner in = new Scanner(System.in);

		System.out.println("Hola, vamos a llenar una arreglo unidimencional.");
		System.out.print("Para ello, primero ingresa el primer numero: ");
		numIn[0] = in.nextInt();

		System.out.print("Ingresa el segundo numero: ");
		numIn[1] = in.nextInt();

		System.out.print("Ingresa el tercer numero: ");
		numIn[2] = in.nextInt();

		System.out.print("Ingresa el cuarto numero: ");
		numIn[3] = in.nextInt();

		System.out.print("Finalmente, ingresa el quinto numero: ");
		numIn[4] = in.nextInt();

		System.out.print("Tu arregle quedo de la siguiente manera: ");
		for(int i = 0; i < 5; i++){
			System.out.print("[" + numIn[i] + "]");
		}
	}
}

//Problema: Programa que pueda recibir un vector de 5 posiciones que pueda guardar un numero en cada una e imprimir en pantalla para confirmacion