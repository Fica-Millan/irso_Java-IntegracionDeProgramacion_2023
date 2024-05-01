package capitulo17_nikotutos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//DECLARACION DE LA CLASE: La clase Fontetizar extiende JFrame e implementa ItemListener. JFrame se utiliza para crear una ventana, y ItemListener se utiliza para manejar eventos de cambio de estado en los componentes de la interfaz gráfica.
public class Fontetizar extends JFrame implements ItemListener{
	
	//ATRIBUTOS DE LA CLASE, Estos son los atributos de la clase. texto es un campo de texto, negrita y cursiva son casillas de verificación, y fuente es un objeto de la clase Font que representa la fuente del texto.
	private JTextField texto;
	private JCheckBox negrita, cursiva;
	private Font fuente;
	
	
	//CONSTRUCTOR: El constructor de la clase crea una instancia de la ventana (JFrame), le asigna un título, establece su diseño (FlowLayout), define los componentes de la ventana llamando al método definirVentana(), establece el tamaño, define la operación al cerrar la ventana y la hace visible.
	public Fontetizar () {		
		super ("Fontetizar");	
		this.setLayout (new FlowLayout ());
		this.definirVentana ();
		this.setSize (400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	//METODO: Este método inicializa los componentes de la interfaz: un campo de texto (texto) y dos casillas de verificación (negrita y cursiva). Estos elementos se agregan a la ventana (add). Además, se establece que la clase (this) será la que maneje los eventos de cambio de estado (ItemListener) para las casillas de verificación.
	private void definirVentana() {
		texto = new JTextField(20);
		negrita = new JCheckBox("Negrita");
		cursiva = new JCheckBox("Cursiva");
		add (texto);
		add (negrita);
		add (cursiva);
		negrita.addItemListener(this);
		cursiva.addItemListener(this);
	}
	
	
	//Este método se llama cada vez que cambia el estado de una casilla. Dependiendo de qué casillas estén seleccionadas, se establece la fuente del campo de texto (texto). Si ninguna está seleccionada, se establece la fuente como regular (Font.PLAIN).
	public void itemStateChanged(ItemEvent e) {
		if (negrita.isSelected() && cursiva.isSelected()) {
			fuente = new Font ("Serief", Font.BOLD|Font.ITALIC,14);
			texto.setFont(fuente);
		}else if (cursiva.isSelected()){
			fuente = new Font("Serief", Font.ITALIC, 14);
			texto.setFont(fuente);
		}else if (negrita.isSelected()) {
			fuente = new Font("Serief", Font.BOLD, 14);
			texto.setFont(fuente);
		}else {
            fuente = new Font("Serief", Font.PLAIN, 14);
            texto.setFont(fuente);
        }
        texto.setFont(fuente);
	}

	//Este método crea una instancia de la clase Fontetizar, lo que inicia la aplicación y muestra la ventana.
	public static void main(String[] args) {
        new Fontetizar();
    }
}
