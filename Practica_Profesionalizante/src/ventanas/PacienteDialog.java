package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import model.Paciente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PacienteDialog extends JFrame {
	
//DECLARACIONES
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblTitulo;
	private JLabel lblAfiliado;
	private JLabel lblDomicilio;
	private JLabel lblLocalidad;
	private JLabel lblCP;
	private JLabel lblCelular;
	private JLabel lblEmail;
	private JLabel lblPass;
	private JLabel lblDNI;
	private JTextField txtNombre;
	private JTextField txtAfiliado;
	private JTextField txtDomicilio;
	private JTextField txtLocalidad;
	private JTextField txtCP;
	private JTextField txtCelular;
	private JTextField txtEmail;
	private JTextField txtPass;
	private JTextField txtDNI;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private Paciente paciente;

//METODO MAIN, INICIA LA APLICACION CUANDO SE EJECUTA EL PROGRAMA. CREA UNA INSTANCIA DE PACIENTEDIALOG Y LA HACE VISIBLE.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacienteDialog frame = new PacienteDialog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//CONSTRUCTOR PACIENTEDIALOG - DISEÑO DE LA INTERFAZ	
	public PacienteDialog() {
		setTitle("U S U A R I O");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Archivos JAVA\\Ejercicios clase JAVA\\Practica_Profesionalizante\\src\\imagenes\\Icono.png"));
		setBounds(100, 100, 500, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 14));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxtNombre());
		contentPane.add(getLblNombre());
		contentPane.add(getLblTitulo());
		contentPane.add(getLblAfiliado());
		contentPane.add(getTxtAfiliado());
		contentPane.add(getTxtDomicilio());
		contentPane.add(getTxtLocalidad());
		contentPane.add(getTxtCP());
		contentPane.add(getLblDomicilio());
		contentPane.add(getLblLocalidad());
		contentPane.add(getLblCP());
		contentPane.add(getLblCelular());
		contentPane.add(getLblEmail());
		contentPane.add(getLblPass());
		contentPane.add(getTxtCelular());
		contentPane.add(getTxtEmail());
		contentPane.add(getTxtPass());
		contentPane.add(getBtnCancelar());
		contentPane.add(getBtnGuardar());
		contentPane.add(getTxtDNI());
		contentPane.add(getLblDNI());
	}
	
//CONSTRUCTOR ADICIONAL PACIENTEDIALOG(PACIENTE PACIENTE): LLAMA AL CONSTRUCTOR PRINCIPAL (THIS()) PARA REALIZAR LA CONFIGURACIÓN INICIAL. ESTABLECE LA INSTANCIA DE PACIENTE PROPORCIONADA Y LLAMA AL MÉTODO SETEARVALORES PARA MOSTRAR LA INFORMACIÓN DEL PACIENTE EN LA VENTANA.
	public PacienteDialog(Paciente paciente) {
		this();
		this.paciente = paciente;
		setearValores();
	}	

//DISEÑO DE LA INTERFAZ
	private JTextField getTxtDNI() {
		if (txtDNI == null) {
			txtDNI = new JTextField();
			txtDNI.setEditable(false);
			txtDNI.setColumns(10);
			txtDNI.setBounds(214, 79, 191, 20);
		}
		return txtDNI;
	}
	private JLabel getLblDNI() {
		if (lblDNI == null) {
			lblDNI = new JLabel("Numero de D.N.I.");
			lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDNI.setBounds(64, 81, 130, 14);
		}
		return lblDNI;
	}	
	private JTextField getTxtNombre() {
		if (txtNombre == null) {
			txtNombre = new JTextField();
			txtNombre.setEditable(false);
			txtNombre.setBounds(214, 104, 191, 20);
			txtNombre.setColumns(10);
		}
		return txtNombre;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre y Apellido");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombre.setBounds(64, 106, 130, 14);
		}
		return lblNombre;
	}
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Datos Personales");
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setFont(new Font("Arial Narrow", Font.BOLD, 20));
			lblTitulo.setBounds(158, 32, 166, 34);
		}
		return lblTitulo;
	}
	private JLabel getLblAfiliado() {
		if (lblAfiliado == null) {
			lblAfiliado = new JLabel("Numero de Afiliado");
			lblAfiliado.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAfiliado.setBounds(64, 131, 130, 14);
		}
		return lblAfiliado;
	}
	private JTextField getTxtAfiliado() {
		if (txtAfiliado == null) {
			txtAfiliado = new JTextField();
			txtAfiliado.setEditable(false);
			txtAfiliado.setColumns(10);
			txtAfiliado.setBounds(214, 129, 191, 20);
		}
		return txtAfiliado;
	}
	private JTextField getTxtDomicilio() {
		if (txtDomicilio == null) {
			txtDomicilio = new JTextField();
			txtDomicilio.setColumns(10);
			txtDomicilio.setBounds(214, 154, 191, 20);
		}
		return txtDomicilio;
	}
	private JTextField getTxtLocalidad() {
		if (txtLocalidad == null) {
			txtLocalidad = new JTextField();
			txtLocalidad.setColumns(10);
			txtLocalidad.setBounds(214, 180, 191, 20);
		}
		return txtLocalidad;
	}
	private JTextField getTxtCP() {
		if (txtCP == null) {
			txtCP = new JTextField();
			txtCP.setColumns(10);
			txtCP.setBounds(214, 203, 191, 20);
		}
		return txtCP;
	}
	private JLabel getLblDomicilio() {
		if (lblDomicilio == null) {
			lblDomicilio = new JLabel("Domicilio");
			lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDomicilio.setBounds(64, 156, 130, 14);
		}
		return lblDomicilio;
	}
	private JLabel getLblLocalidad() {
		if (lblLocalidad == null) {
			lblLocalidad = new JLabel("Localidad");
			lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblLocalidad.setBounds(64, 182, 130, 14);
		}
		return lblLocalidad;
	}
	private JLabel getLblCP() {
		if (lblCP == null) {
			lblCP = new JLabel("Codigo Postal");
			lblCP.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCP.setBounds(64, 205, 130, 14);
		}
		return lblCP;
	}
	private JLabel getLblCelular() {
		if (lblCelular == null) {
			lblCelular = new JLabel("Celular");
			lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCelular.setBounds(64, 232, 130, 14);
		}
		return lblCelular;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("E-mail");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEmail.setBounds(64, 257, 130, 14);
		}
		return lblEmail;
	}
	private JLabel getLblPass() {
		if (lblPass == null) {
			lblPass = new JLabel("Password");
			lblPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblPass.setBounds(64, 282, 130, 14);
		}
		return lblPass;
	}
	private JTextField getTxtCelular() {
		if (txtCelular == null) {
			txtCelular = new JTextField();
			txtCelular.setColumns(10);
			txtCelular.setBounds(214, 228, 191, 20);
		}
		return txtCelular;
	}
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setEditable(false);
			txtEmail.setColumns(10);
			txtEmail.setBounds(214, 253, 191, 20);
		}
		return txtEmail;
	}
	private JTextField getTxtPass() {
		if (txtPass == null) {
			txtPass = new JTextField();
			txtPass.setColumns(10);
			txtPass.setBounds(214, 280, 191, 20);
		}
		return txtPass;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(214, 320, 89, 23);
			btnCancelar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			btnCancelar.setBackground(new Color(255, 250, 250));
			
		}
		return btnCancelar;
	}
	private JButton getBtnGuardar() {
		if (btnGuardar == null) {
			btnGuardar = new JButton("Guardar");
			btnGuardar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnGuardar.setBounds(316, 320, 89, 23);
			btnGuardar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			btnGuardar.setBackground(new Color(255, 250, 250));
		}	
		return btnGuardar;
	}
	
//MÉTODO SETEARVALORES: TOMA LA INFORMACIÓN DE LA INSTANCIA DE PACIENTE Y LA ESTABLECE EN LOS CAMPOS DE TEXTO CORRESPONDIENTES EN LA INTERFAZ.
	private void setearValores() {
		getTxtDNI().setText(Integer.toString(this.paciente.getDNI_Paciente()));
		getTxtNombre().setText(this.paciente.getNombre());
		getTxtAfiliado().setText(Integer.toString(this.paciente.getNroAfiliado()));
		getTxtDomicilio().setText(this.paciente.getDomicilio());
		getTxtLocalidad().setText(this.paciente.getLocalidad());
		getTxtCP().setText(this.paciente.getCodigo_Postal());
		getTxtCelular().setText(this.paciente.getCelular());		
		getTxtPass().setText(this.paciente.getPass());
		getTxtEmail().setText(this.paciente.getEmail());				
	}
}