import java.util.Scanner;

public class Practica5{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String name = "";
		int key = 0;
		int service = 0;

		System.out.println("Buenas. Por favor diganos su nombre: ");
		name = entrada.nextLine();

		System.out.println("Escriba su clave de departamento");
		key = entrada.nextInt();

		System.out.println("Digamos sus años de servicio (en numero): ");
		service = entrada.nextInt();


		switch (key){
			case 1:
				if(service == 1){
					System.out.println( name + ", tiene 6 días de vacaciones");
				}else if (service >= 2 && service <= 6 ) {
					System.out.println( name + ", tiene 14 días de vacaciones");
				}else if (service >=7){
					System.out.println( name + ", tiene 20 días de vacaciones");
				}

				break;
			case 2:
				if(service == 1){
					System.out.println( name + ", tiene 7 días de vacaciones");
				}else if (service >= 2 && service <= 6 ) {
					System.out.println( name + ", tiene 15 días de vacaciones");
				}else if (service >=7){
					System.out.println( name + ", tiene 22 días de vacaciones");
				}

				break;
			case 3:
				if(service == 1){
					System.out.println( name + ", tiene 10 días de vacaciones");
				}else if (service >= 2 && service <= 6 ) {
					System.out.println( name + ", tiene 20 días de vacaciones");
				}else if (service >=7){
					System.out.println( name + ", tiene 30 días de vacaciones");
				}

				break;
		}
	}
}

/*
Problema: Una empresa quiere dar montar un sistema que le diga a sus empleados los días de vacaciones que tendrán dependiedo de su departamente y los años de servicio que tengan
	Atención al cliente (clave: 1)
		1 año = 6 días
		2 - 6 años = 14 días
		7>= años = 20 días 
	Logistica (Clave: 2)
		1 año = 7 días
		2 - 6 años = 15 días
		7>= años = 22 días
	Gerencia (Clave: 3)
		1 año = 10 días
		2 - 6 años = 20 días
		7>= años = 30 días
*/