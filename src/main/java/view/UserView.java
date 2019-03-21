package view;
import javax.swing.JOptionPane;

//ASCF
public class UserView {

	void imprimir() {
		
		String message="Bienvenido al registro de personas"+"\n"
		+"[1]Registrar nueva persona"+"\n"
		+"[2]Mostrar lista de personas"+"\n"
		+"[3]Salir"+"\n"
		;
		
		int i=0;
		while(i==0){
		int option=Integer.parseInt(JOptionPane.showInputDialog(message+"Ingrese una opcion"));
		switch (option) {
		case 1:
			 System.out.println("Registrar");
			 //Funcion registrar
			break;
		case 2:
			System.out.println("Mostrar lista de personas");
			 //Funcion listar
			break;
		case 3:
			break;
		}
		}
	}
}
