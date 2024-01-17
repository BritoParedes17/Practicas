import java.util.Scanner;

public class Practica8{
	public static void main(String args[]){
		int rowNum = 0, colNum = 0, contador = 1; 
		Scanner in = new Scanner(System.in);

		System.out.println("¿Cuantas filas tendra su matriz?");
		rowNum = in.nextInt();

		System.out.println("¿y cuantas columnas?");
		colNum = in.nextInt();

		int matriz[][] = new int[rowNum][colNum];

		for(int j = 0; j < rowNum; j++){
			for(int i = 0; i < colNum; i++){
				matriz[j][i] = contador;
				contador++;
				System.out.print("[" + matriz[j][i] + "]");
			}
			System.out,println("");
		}
	}
}
// Problema: realizar programa que pida al usuario la cantidad de filas y columnas que quiere para su matriz y rellenarla automaticamente con un incremento constante de 1.