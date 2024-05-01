package Tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JPanel panelNorte;
	private JLabel lblNewLabel;
	private JTextField txtUsuario;
	private JPanel panelSur;
	private JButton btnGuardar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanelNorte(), BorderLayout.NORTH);
		contentPane.add(getPanelSur(), BorderLayout.SOUTH);
	}

	private JPanel getPanelNorte() {
		if (panelNorte == null) {
			panelNorte = new JPanel();
			GridBagLayout gbl_panelNorte = new GridBagLayout();
			gbl_panelNorte.columnWidths = new int[]{0, 0, 0};
			gbl_panelNorte.rowHeights = new int[]{0, 0};
			gbl_panelNorte.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_panelNorte.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelNorte.setLayout(gbl_panelNorte);
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(4, 4, 4, 4);
			gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			panelNorte.add(getLblNewLabel(), gbc_lblNewLabel);
			GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
			gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtUsuario.gridx = 1;
			gbc_txtUsuario.gridy = 0;
			panelNorte.add(getTxtUsuario(), gbc_txtUsuario);
		}
		return panelNorte;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Usuario");
		}
		return lblNewLabel;
	}
	private JTextField getTxtUsuario() {
		if (txtUsuario == null) {
			txtUsuario = new JTextField();
			txtUsuario.setColumns(10);
		}
		return txtUsuario;
	}
	private JPanel getPanelSur() {
		if (panelSur == null) {
			panelSur = new JPanel();
			GridBagLayout gbl_panelSur = new GridBagLayout();
			gbl_panelSur.columnWidths = new int[]{0, 0};
			gbl_panelSur.rowHeights = new int[]{0, 0};
			gbl_panelSur.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_panelSur.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panelSur.setLayout(gbl_panelSur);
			GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
			gbc_btnGuardar.fill = GridBagConstraints.VERTICAL;
			gbc_btnGuardar.gridx = 0;
			gbc_btnGuardar.gridy = 0;
			panelSur.add(getBtnGuardar(), gbc_btnGuardar);
		}
		return panelSur;
	}
	private JButton getBtnGuardar() {
		if (btnGuardar == null) {
			btnGuardar = new JButton("Guardar");
		}
		return btnGuardar;
	}
}