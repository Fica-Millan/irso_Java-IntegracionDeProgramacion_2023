package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import exceptions.UsuarioNoEncontradoException;
import model.Medico;
import model.Paciente;
import repositorio.Conexion;

public class Login extends JFrame {
	
//DECLARACIONES
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl_LogoLargo;
	private JLabel lbl_Usuario;
	private JLabel lbl_Password;
	private JLabel lblTipoUsuario;
	private JTextField txt_user;
	private JPasswordField txt_password;	
	private JButton btn_Ingresar;
	private JRadioButton rdbtnPaciente;
	private JRadioButton rdbtnMedico;

//METODO MAIN DE LA CLASE LOGIN
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//DISEÑO DE LA INTERFAZ DEL USUARIO	
	public Login() {
		setTitle("G E S T I O N   D E   T U R N O S");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 14));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTxt_user());
		contentPane.add(getLbl_LogoLargo());
		contentPane.add(getTxt_password());
		contentPane.add(getLbl_Usuario());
		contentPane.add(getLbl_Password());
		contentPane.add(getBtn_Ingresar());
		contentPane.add(getRdbtnPaciente());
		contentPane.add(getRdbtnMedico());
		contentPane.add(getLblTipoUsuario());
	}

	private JLabel getLbl_LogoLargo() {
		if (lbl_LogoLargo == null) {
			lbl_LogoLargo = new JLabel("");
			lbl_LogoLargo.setHorizontalTextPosition(SwingConstants.CENTER);
			lbl_LogoLargo.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_LogoLargo.setBounds(92, 34, 318, 158);
			lbl_LogoLargo.setDisplayedMnemonic(KeyEvent.VK_ENTER);
			lbl_LogoLargo.setIcon(new ImageIcon(Login.class.getResource("/imagenes/OSECAC - largo.png")));
		}
		return lbl_LogoLargo;
	}

	private JTextField getTxt_user() {
		if (txt_user == null) {
			txt_user = new JTextField();
			txt_user.setHorizontalAlignment(SwingConstants.CENTER);
			txt_user.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txt_user.setForeground(new Color(0, 0, 139));
			txt_user.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			txt_user.setBounds(226, 229, 184, 29);
			txt_user.setColumns(10);
		}
		return txt_user;
	}

	private JPasswordField getTxt_password() {
		if (txt_password == null) {
			txt_password = new JPasswordField();
			txt_password.setHorizontalAlignment(SwingConstants.CENTER);
			txt_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
			txt_password.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			txt_password.setForeground(new Color(0, 0, 139));
			txt_password.setBounds(226, 273, 184, 29);
		}
		return txt_password;
	}

	private JLabel getLbl_Usuario() {
		if (lbl_Usuario == null) {
			lbl_Usuario = new JLabel("E-MAIL");
			lbl_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl_Usuario.setBounds(92, 229, 71, 29);
		}
		return lbl_Usuario;
	}

	private JLabel getLbl_Password() {
		if (lbl_Password == null) {
			lbl_Password = new JLabel("CONTRASEÑA");
			lbl_Password.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lbl_Password.setBounds(92, 273, 87, 29);
		}
		return lbl_Password;
	}

	private JRadioButton getRdbtnPaciente() {
		if (rdbtnPaciente == null) {
			rdbtnPaciente = new JRadioButton("Paciente");
			rdbtnPaciente.setOpaque(false);
			rdbtnPaciente.setBackground(new Color(176, 224, 230));
			rdbtnPaciente.setBounds(226, 329, 87, 23);
		}
		return rdbtnPaciente;
	}

	private JRadioButton getRdbtnMedico() {
		if (rdbtnMedico == null) {
			rdbtnMedico = new JRadioButton("Medico");
			rdbtnMedico.setOpaque(false);
			rdbtnMedico.setBackground(new Color(176, 224, 230));
			rdbtnMedico.setBounds(226, 355, 87, 23);
		}
		return rdbtnMedico;
	}

	private JLabel getLblTipoUsuario() {
		if (lblTipoUsuario == null) {
			lblTipoUsuario = new JLabel("Tipo de usuario");
			lblTipoUsuario.setBounds(92, 345, 106, 14);
		}
		return lblTipoUsuario;
	}
	
	private JButton getBtn_Ingresar() {
		if (btn_Ingresar == null) {
			btn_Ingresar = new JButton("INGRESAR");
			btn_Ingresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//EL TEXTO INGRESADO COMO USER Y PASS SE GUARDAN COMO VARIABLES
					String user = txt_user.getText().trim();
					char[] pass = txt_password.getPassword();
					//ESAS VARIABLES SE UTILIZAN EN EN LA FUNCION LOGIN
					login(user, pass);
				}
			});
			btn_Ingresar.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			btn_Ingresar.setBackground(new Color(255, 250, 250));
			btn_Ingresar.setBounds(226, 422, 89, 23);
		}
		return btn_Ingresar;
	}

//METODO PARA EL INGRESO AL SISTEMA
	private void login(String user, char[] pass) {

//SE VALIDAN DATOS INGRESADOS - SI NO ESTAN COMPLETOS MUESTRA MENSAJE
		if (user.equals("") || pass.length == 0) {
			JOptionPane.showMessageDialog(null, "Se deben completar todos los campos para poder ingresar.");
			return;
		}
		
//DETERMINA SI SE ELIGIO PACIENTE O MEDICO - LLAMANDO AL METODO CORRESPONDIENTE
		if (getRdbtnPaciente().isSelected()) {
			loginPaciente(user, pass);
		} else {
			loginMedico(user, pass);
		}

	}

//METODO INICIO SESION MEDICO. UTILIZA LA CLASE CONEXION PARA AUTENTICAR AL MEDICO EN BD. SI LO AUTENTICA ABRE LA VENTANA MEDICOSFORM Y CIERRA LA DE INICIO DE SESION. SI NO LO HACE MUESTRA EL ERROR.
	private void loginMedico(String user, char[] pass) {
		try {
			Medico medico = Conexion.loginMedico(user, pass);		
			MedicosForm form = new MedicosForm(medico);
			dispose();
			form.setVisible(true);			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en base de datos: " + e.getMessage());
		} catch (UsuarioNoEncontradoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
//METODO INICIO SESION PACIENTE. UTILIZA LA CLASE CONEXION PARA AUTENTICAR AL PACIENTE EN BD. SI LO AUTENTICA ABRE LA VENTANA PACIENTESFORM Y CIERRA LA DE INICIO DE SESION.SI NO LO HACE MUESTRA EL ERROR.
	private void loginPaciente(String user, char[] pass) {
		try {
			Paciente paciente = Conexion.loginPaciente(user, pass);
			PacientesForm form = new PacientesForm(paciente);
			dispose();
			form.setVisible(true);	
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en base de datos: " + e.getMessage());
		} catch (UsuarioNoEncontradoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}