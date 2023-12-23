public class Practica3{
	public static void main(String[] args){
		int matematicas = 5;
		int biologia = 8;
		int quimica = 7;

		int promedio = (5 + 8 + 7) / 3;

		if(promedio >= 6){
			System.out.println("La calificación del alumno es " + promedio + " y es aprobatoria");
		}
		else{
			System.out.println("La calificación del alumno es " + promedio + " y es reprobatoria");
		}
	}
}

/* problema:
	Realizar un programa que calcule el promedio final de 
	tres materias y que el indique si el alumno aprobó o no
	tomando en cuenta que la calificacion aprobatoria es 6.
*/