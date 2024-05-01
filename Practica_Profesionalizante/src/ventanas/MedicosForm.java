package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.Medico;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MedicosForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblBanner;
	private JLabel lblUsuario;
	private JLabel lblGestionarTurnos;
	private JLabel lblListados;
	private JButton btnUsuario;
	private JButton btnTurnos;
	private JButton btnListados;
	private Medico medico;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicosForm frame = new MedicosForm();
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
	public MedicosForm() {
		setTitle("M E D I C O S");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Medico.class.getResource("/imagenes/Icono.png")));
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
		contentPane.add(getLblGestionarTurnos());
		contentPane.add(getLblListados());
		contentPane.add(getBtnListados());
	}
	public MedicosForm(Medico medico) {
		this();
		this.medico = medico;
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
			btnUsuario.setBounds(117, 166, 85, 85);
		}
		return btnUsuario;
	}
	private JButton getBtnTurnos() {
		if (btnTurnos == null) {
			btnTurnos = new JButton("");
			btnTurnos.setHorizontalTextPosition(SwingConstants.CENTER);
			btnTurnos.setBackground(new Color(255, 255, 255));
			btnTurnos.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Practica Profesionales\\Imagenes\\calendario.png"));
			btnTurnos.setBounds(117, 262, 85, 85);
		}
		return btnTurnos;
	}
	private JLabel getLblUsuario() {
		if (lblUsuario == null) {
			lblUsuario = new JLabel("Datos del Usuario");
			lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblUsuario.setBounds(212, 199, 141, 21);
		}
		return lblUsuario;
	}
	private JLabel getLblGestionarTurnos() {
		if (lblGestionarTurnos == null) {
			lblGestionarTurnos = new JLabel("Gestionar Turnos");
			lblGestionarTurnos.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblGestionarTurnos.setBounds(212, 293, 141, 21);
		}
		return lblGestionarTurnos;
	}
	private JLabel getLblListados() {
		if (lblListados == null) {
			lblListados = new JLabel("Listados");
			lblListados.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblListados.setBounds(212, 391, 141, 21);
		}
		return lblListados;
	}
	private JButton getBtnListados() {
		if (btnListados == null) {
			btnListados = new JButton("");
			btnListados.setIcon(new ImageIcon("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Practica Profesionales\\Imagenes\\Listados.png"));
			btnListados.setHorizontalTextPosition(SwingConstants.CENTER);
			btnListados.setBackground(Color.WHITE);
			btnListados.setBounds(117, 360, 85, 85);
		}
		return btnListados;
	}

	private void verDatosUsuario() {
		MedicoDialog form = new MedicoDialog(this.medico);
		form.setVisible(true);
	}
}
