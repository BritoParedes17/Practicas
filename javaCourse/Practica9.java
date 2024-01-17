import javax.swing.*;

public class Practica9 extends JFrame{
	private JLabel label1;

	public Practica9(){
		setLayout(null);
	label1 = new JLabel("Hola mundo");
	label1.setBounds(10,20,200,300);
	add(label1);
	}
	
	public static void main(String args[]){
		Practica9 formulario1 = new Practica9();
		formulario1.setBounds(0,0,400,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	}
}

//Ejercicio para introducir al funcionamiento de las interfaces graficas en java