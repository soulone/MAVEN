package Controller;

import javax.swing.JOptionPane;
import model.Model;

public class controller extends Model{
	void registrar(){
		nombre = JOptionPane.showInputDialog("Nombre: "); 
		apellido = JOptionPane.showInputDialog("Apellido: ");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
	}
	void mostrar(){
		JOptionPane.showMessageDialog(null,"El nombre es: "+nombre+""+apellido+"y su edad es "+edad);
	}

}
