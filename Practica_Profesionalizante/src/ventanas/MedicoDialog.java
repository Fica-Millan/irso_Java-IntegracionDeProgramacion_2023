package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import model.Medico;
import repositorio.Conexion;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicoDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblMatricula;
	private JTextField txtMatricula;
	private JLabel lblDomicilio;
	private JTextField txtDomicilio;
	private JLabel lblLocalidad;
	private JTextField txtLocalidad;
	private JLabel lblCP;
	private JTextField txtCP;
	private JLabel lblCelular;
	private JTextField txtCelular;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblPass;
	private JTextField txtPass;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private Medico medico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicoDialog frame = new MedicoDialog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MedicoDialog() {
		setTitle("U S U A R I O");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Archivos JAVA\\Ejercicios clase JAVA\\Practica_Profesionalizante\\src\\imagenes\\Icono.png"));
		setBounds(100, 100, 500, 391);
		setModal(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 14));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblTitulo());
		contentPane.add(getLblNombre());
		contentPane.add(getTxtNombre());
		contentPane.add(getLblMatricula());
		contentPane.add(getTxtMatricula());
		contentPane.add(getLblDomicilio());
		contentPane.add(getTxtDomicilio());
		contentPane.add(getLblLocalidad());
		contentPane.add(getTxtLocalidad());
		contentPane.add(getLblCP());
		contentPane.add(getTxtCP());
		contentPane.add(getLblCelular());
		contentPane.add(getTxtCelular());
		contentPane.add(getLblEmail());
		contentPane.add(getTxtEmail());
		contentPane.add(getLblPass());
		contentPane.add(getTxtPass());
		contentPane.add(getBtnCancelar());
		contentPane.add(getBtnGuardar());
	}

	public MedicoDialog(Medico medico) {
		this();
		this.medico = medico;
		setearValores();
	}

	private JTextField getTxtNombre() {
		if (txtNombre == null) {
			txtNombre = new JTextField();
			txtNombre.setEditable(false);
			txtNombre.setBounds(214, 79, 191, 20);
			txtNombre.setColumns(10);
		}
		return txtNombre;
	}
	private JLabel getLblNombre() {
		if (lblNombre == null) {
			lblNombre = new JLabel("Nombre y Apellido");
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombre.setBounds(64, 81, 130, 14);
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
	private JLabel getLblMatricula() {
		if (lblMatricula == null) {
			lblMatricula = new JLabel("Numero de Matricula");
			lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblMatricula.setBounds(64, 106, 130, 14);
		}
		return lblMatricula;
	}
	private JTextField getTxtMatricula() {
		if (txtMatricula == null) {
			txtMatricula = new JTextField();
			txtMatricula.setEditable(false);
			txtMatricula.setColumns(10);
			txtMatricula.setBounds(214, 104, 191, 20);
		}
		return txtMatricula;
	}
	private JTextField getTxtDomicilio() {
		if (txtDomicilio == null) {
			txtDomicilio = new JTextField();
			txtDomicilio.setColumns(10);
			txtDomicilio.setBounds(214, 129, 191, 20);
		}
		return txtDomicilio;
	}
	private JTextField getTxtLocalidad() {
		if (txtLocalidad == null) {
			txtLocalidad = new JTextField();
			txtLocalidad.setColumns(10);
			txtLocalidad.setBounds(214, 153, 191, 20);
		}
		return txtLocalidad;
	}
	private JTextField getTxtCP() {
		if (txtCP == null) {
			txtCP = new JTextField();
			txtCP.setColumns(10);
			txtCP.setBounds(214, 179, 191, 20);
		}
		return txtCP;
	}
	private JLabel getLblDomicilio() {
		if (lblDomicilio == null) {
			lblDomicilio = new JLabel("Domicilio");
			lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDomicilio.setBounds(64, 131, 130, 14);
		}
		return lblDomicilio;
	}
	private JLabel getLblLocalidad() {
		if (lblLocalidad == null) {
			lblLocalidad = new JLabel("Localidad");
			lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblLocalidad.setBounds(64, 156, 130, 14);
		}
		return lblLocalidad;
	}
	private JLabel getLblCP() {
		if (lblCP == null) {
			lblCP = new JLabel("Codigo Postal");
			lblCP.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCP.setBounds(64, 182, 130, 14);
		}
		return lblCP;
	}
	private JLabel getLblCelular() {
		if (lblCelular == null) {
			lblCelular = new JLabel("Celular");
			lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCelular.setBounds(64, 205, 130, 14);
		}
		return lblCelular;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("E-mail");
			lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEmail.setBounds(64, 230, 130, 14);
		}
		return lblEmail;
	}
	private JLabel getLblPass() {
		if (lblPass == null) {
			lblPass = new JLabel("Password");
			lblPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblPass.setBounds(64, 255, 130, 14);
		}
		return lblPass;
	}
	private JTextField getTxtCelular() {
		if (txtCelular == null) {
			txtCelular = new JTextField();
			txtCelular.setColumns(10);
			txtCelular.setBounds(214, 203, 191, 20);
		}
		return txtCelular;
	}
	private JTextField getTxtEmail() {
		if (txtEmail == null) {
			txtEmail = new JTextField();
			txtEmail.setEditable(false);
			txtEmail.setColumns(10);
			txtEmail.setBounds(214, 228, 191, 20);
		}
		return txtEmail;
	}
	private JTextField getTxtPass() {
		if (txtPass == null) {
			txtPass = new JTextField();
			txtPass.setColumns(10);
			txtPass.setBounds(214, 253, 191, 20);
		}
		return txtPass;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(211, 297, 89, 23);
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
					guardar();
				}
			});
			btnGuardar.setBounds(316, 297, 89, 23);
			btnGuardar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			btnGuardar.setBackground(new Color(255, 250, 250));
			
		}	
		return btnGuardar;
	}

	private boolean datosValidos() {
		
		
		return true;
	}
	
	
	private void cancelar() {
		// TODO Auto-generated method stub
		
	}
	
	private void guardar() {
		if (datosValidos()) {
			this.medico.setPass(getTxtPass().getText());
			Conexion.guardarMedico(medico);
		}
	}
	
	private void setearValores() {
		getTxtMatricula().setText(this.medico.getMatricula());
		getTxtNombre().setText(this.medico.getNombre());
		getTxtDomicilio().setText(this.medico.getDomicilio());
		getTxtLocalidad().setText(this.medico.getLocalidad());
		getTxtCP().setText(this.medico.getCodigo_Postal());
		getTxtCelular().setText(this.medico.getCelular());
		getTxtPass().setText(this.medico.getPass());
		getTxtEmail().setText(this.medico.getEmail());				
	}
}