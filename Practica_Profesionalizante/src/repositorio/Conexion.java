package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exceptions.UsuarioNoEncontradoException;
import model.Medico;
import model.Paciente;

public class Conexion {

	public static Paciente loginPaciente(String user, char[] pass) throws SQLException, UsuarioNoEncontradoException {

		Connection cn = Conexion.conectar();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
		
			//CONSULTA EN BD PARA VERIFICAR EL USUARIO
			String query = "SELECT * FROM pacientes WHERE email = ? AND password = ?";
			pst = cn.prepareStatement(query);
			pst.setString(1, user);
			pst.setString(2, new String(pass));
			rs = pst.executeQuery();

			if (rs.next()) {
				Paciente paciente = new Paciente();
				paciente.setDNI_Paciente(rs.getInt("DNI_Paciente"));
				paciente.setNombre(rs.getString("Nombre_Pacientes"));
				paciente.setNroAfiliado(rs.getInt("Nro_Afiliado"));
				paciente.setDomicilio(rs.getString("Domicilio"));
				paciente.setLocalidad(rs.getString("Localidad"));
				paciente.setCodigo_Postal(rs.getString("Codigo_Postal"));
				paciente.setCelular(rs.getString("Celular"));
				paciente.setEmail(rs.getString("Email"));
				paciente.setPass(rs.getString("Password"));
				
				return paciente ;

			} else {
				throw new UsuarioNoEncontradoException("Usuario o contraseña incorrectos.");
			}

		} finally {			
			if(rs!= null) rs.close();
			if(pst!= null) pst.close();
			if(cn!= null) cn.close();
		}
	}
	public static Medico loginMedico(String user, char[] pass) throws SQLException, UsuarioNoEncontradoException {

		Connection cn = Conexion.conectar();
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
		
			//CONSULTA EN BD PARA VERIFICAR EL USUARIO
			String query = "SELECT * FROM medicos WHERE email = ? AND password = ?";
			pst = cn.prepareStatement(query);
			pst.setString(1, user);
			pst.setString(2, new String(pass));
			rs = pst.executeQuery();

			if (rs.next()) {
				Medico medico = new Medico();
				medico.setMatricula(rs.getString("Matricula"));
				medico.setNombre(rs.getString("Nombre_Medico"));
				medico.setDomicilio(rs.getString("Domicilio"));
				medico.setLocalidad(rs.getString("Localidad"));
				medico.setCodigo_Postal(rs.getString("Codigo_Postal"));
				medico.setCelular(rs.getString("Celular"));
				medico.setEmail(rs.getString("Email"));
				medico.setPass(rs.getString("Password"));
				
				return medico ;

			} else {
				throw new UsuarioNoEncontradoException("Usuario o contraseña incorrectos.");
			}

		} finally {			
			if(rs!= null) rs.close();
			if(pst!= null) pst.close();
			if(cn!= null) cn.close();
		}
	}
	public void desconectar() {

	}

	public static Connection conectar() {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/clinicaosecac", "root","maCHUpiCHU2018");
			return cn;
		} catch (SQLException e) {
			System.out.println("Error en conexion local" + e);
		}
		return (null);
	}
	public static void guardarMedico(Medico medico) {
		
		
	}

}
