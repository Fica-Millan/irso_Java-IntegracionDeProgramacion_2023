package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.Paciente;

public class PacientesForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblBanner;
	private JButton btnUsuario;
	private JButton btnTurnos;
	private JLabel lblUsuario;
	private JLabel lblTurnos;
	private Paciente paciente;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacientesForm frame = new PacientesForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PacientesForm() {
		setTitle("P A C I E N T E S");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Archivos JAVA\\Ejercicios clase JAVA\\Practica_Profesionalizante\\src\\imagenes\\Icono.png"));
		setBounds(100, 100, 500, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 14));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblBanner());
		contentPane.add(getBtnUsuario());
		contentPane.add(getBtnTurnos());
		contentPane.add(getLblUsuario());
		contentPane.add(getLblTurnos());	
	}

	public PacientesForm(Paciente paciente) {
		this();
		this.paciente = paciente;
	}
	
	private JLabel getLblBanner() {
		if (lblBanner == null) {
			lblBanner = new JLabel("");
			lblBanner.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Practica Profesionales\\Imagenes\\Banner.jpeg"));
			lblBanner.setBounds(57, 21, 375, 134);
		}
		return lblBanner;
	}
	private JButton getBtnUsuario() {
		if (btnUsuario == null) {
			btnUsuario = new JButton("");
			btnUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					verDatosUsuario();
				}
			});			
			btnUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
			btnUsuario.setBackground(new Color(255, 255, 255));
			btnUsuario.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Practica Profesionales\\Imagenes\\Usuario.jpg"));
			btnUsuario.setBounds(119, 205, 85, 85);
		}
		return btnUsuario;
	}
	private JButton getBtnTurnos() {
		if (btnTurnos == null) {
			btnTurnos = new JButton("");
			btnTurnos.setHorizontalTextPosition(SwingConstants.CENTER);
			btnTurnos.setBackground(new Color(255, 255, 255));
			btnTurnos.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Practica Profesionales\\Imagenes\\calendario.png"));
			btnTurnos.setBounds(117, 326, 85, 85);
		}
		return btnTurnos;
	}
	private JLabel getLblUsuario() {
		if (lblUsuario == null) {
			lblUsuario = new JLabel("Datos del Usuario");
			lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblUsuario.setBounds(214, 236, 141, 21);
		}
		return lblUsuario;
	}
	private JLabel getLblTurnos() {
		if (lblTurnos == null) {
			lblTurnos = new JLabel("Gestionar Turnos");
			lblTurnos.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblTurnos.setBounds(212, 361, 141, 21);
		}
		return lblTurnos;
	}

	private void verDatosUsuario() {
		PacienteDialog form = new PacienteDialog(this.paciente);
		form.setVisible(true);
	}
}
