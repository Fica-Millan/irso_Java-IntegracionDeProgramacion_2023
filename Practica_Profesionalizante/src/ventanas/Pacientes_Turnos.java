package ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.BoxLayout;
import com.toedter.calendar.JCalendar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import javax.swing.JCheckBoxMenuItem;

public class Pacientes_Turnos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCalendar calendar;
	private JMenu mnEspecialidad;
	private JMenuItem mntmClinico;
	private JMenuItem mntmCardiologo;
	private JMenuItem mntmEndocrinologo;
	private JLabel lblFecha;
	private JMenu mnMedico;
	private JMenuItem mntmJosePerez;
	private JMenuItem mntmClaraHernandez;
	private JMenuItem mntmPedroAlmodovar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacientes_Turnos frame = new Pacientes_Turnos();
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
	public Pacientes_Turnos() {
		setTitle("T U R N O S");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Yesica\\Dropbox\\Tecnicatura\\2do año\\1_IdP\\Archivos JAVA\\Ejercicios clase JAVA\\Practica_Profesionalizante\\src\\imagenes\\Icono.png"));
		setBounds(100, 100, 500, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new LineBorder(new Color(25, 25, 112), 14));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCalendar());
		contentPane.add(getMnEspecialidad());
		contentPane.add(getLblFecha());
		contentPane.add(getMnMedico());
	}
	private JCalendar getCalendar() {
		if (calendar == null) {
			calendar = new JCalendar();
			calendar.setBounds(236, 155, 184, 153);
		}
		return calendar;
	}
	private JMenu getMnEspecialidad() {
		if (mnEspecialidad == null) {
			mnEspecialidad = new JMenu("Seleccione Especialidad   ");
			mnEspecialidad.setHorizontalTextPosition(SwingConstants.LEFT);
			mnEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
			mnEspecialidad.setFont(new Font("Arial", Font.BOLD, 12));
			mnEspecialidad.setBounds(27, 51, 150, 26);
			mnEspecialidad.add(getMntmClinico());
			mnEspecialidad.add(getMntmCardiologo());
			mnEspecialidad.add(getMntmEndocrinologo());
		}
		return mnEspecialidad;
	}
	private JMenuItem getMntmClinico() {
		if (mntmClinico == null) {
			mntmClinico = new JMenuItem("Medico Clínico");
		}
		return mntmClinico;
	}
	private JMenuItem getMntmCardiologo() {
		if (mntmCardiologo == null) {
			mntmCardiologo = new JMenuItem("Medico Cardiólogo");
		}
		return mntmCardiologo;
	}
	private JMenuItem getMntmEndocrinologo() {
		if (mntmEndocrinologo == null) {
			mntmEndocrinologo = new JMenuItem("Medico Endocrinólogo");
		}
		return mntmEndocrinologo;
	}
	private JLabel getLblFecha() {
		if (lblFecha == null) {
			lblFecha = new JLabel("Seleccione Fecha");
			lblFecha.setFont(new Font("Arial", Font.BOLD, 12));
			lblFecha.setBounds(65, 144, 150, 26);
		}
		return lblFecha;
	}
	private JMenu getMnMedico() {
		if (mnMedico == null) {
			mnMedico = new JMenu("Seleccione Medico");
			mnMedico.setHorizontalTextPosition(SwingConstants.LEFT);
			mnMedico.setHorizontalAlignment(SwingConstants.LEFT);
			mnMedico.setFont(new Font("Arial", Font.BOLD, 12));
			mnMedico.setBounds(27, 100, 150, 26);
			mnMedico.add(getMntmJosePerez());
			mnMedico.add(getMntmClaraHernandez());
			mnMedico.add(getMntmPedroAlmodovar());
		}
		return mnMedico;
	}
	private JMenuItem getMntmJosePerez() {
		if (mntmJosePerez == null) {
			mntmJosePerez = new JMenuItem("Dr. Jose Perez");
		}
		return mntmJosePerez;
	}
	private JMenuItem getMntmClaraHernandez() {
		if (mntmClaraHernandez == null) {
			mntmClaraHernandez = new JMenuItem("Dra. Clara Hernandez");
		}
		return mntmClaraHernandez;
	}
	private JMenuItem getMntmPedroAlmodovar() {
		if (mntmPedroAlmodovar == null) {
			mntmPedroAlmodovar = new JMenuItem("Dr. Pedro Almodovar");
		}
		return mntmPedroAlmodovar;
	}
}
