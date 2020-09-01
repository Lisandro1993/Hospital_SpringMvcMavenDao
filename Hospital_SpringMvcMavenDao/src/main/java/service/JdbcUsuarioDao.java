package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import dominio.Usuario;



@Repository
public class JdbcUsuarioDao implements UsuarioDao {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private int generateId(String nameTable) {
		String sql = "SELECT MAX(id) AS id FROM " + nameTable;
		int id = 1;
		try {
			Connection conn = null;
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1) + 1;
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.getStackTrace();
		}
		return id;
	}

	@Override
	public void insert(Usuario usuario) {

		String sql = "INSERT INTO USUARIO (ID, NOMBRE, EDAD, DIRECCION, TELEFONO, ESPECIALIDAD, RFC, SEXO, EMAIL,PASSWORD) "
				+ " VALUES (?,?, ?, ?, ?, ?, ?, ?,?,?)";

		try {
			Connection conn = null;
			int idg = generateId("usuario");
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idg);
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getEdad());
			ps.setString(4, usuario.getDireccion());
			ps.setString(5, usuario.getTelefono());
			ps.setString(6, usuario.getEspecialidad());
			ps.setString(7,  usuario.getRfc());
			ps.setString(8, usuario.getSexo());
			ps.setString(9, usuario.getEmail());
			ps.setString(10, usuario.getPassword());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Usuario usuario) {
		String sql = "UPDATE USUARIO SET NOMBRE=?,EDAD=?,DIRECCION=?,ESPECIALIDAD=?,SEXO=?, EMAIL=?, PASSWORD=? "
				+ "WHERE USUARIO_NO = ?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getEdad());
			ps.setString(3, usuario.getDireccion());
			ps.setString(4, usuario.getTelefono());
			ps.setString(5, usuario.getEspecialidad());
			ps.setString(6, usuario.getRfc());
			ps.setString(7, usuario.getSexo());
			ps.setString(8, usuario.getEmail());
			ps.setString(9, usuario.getPassword());
			ps.setString(10,usuario.getUsuario_no());
			
			
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	@Override
	public void delete(Usuario usuario) {
		String sql = "DELETE FROM USUARIO WHERE (USUARIO_NO = ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usuario.getUsuario_no());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	@Override
	public Usuario findByUsuarioNo(String email, String password) {
		String sql = "SELECT * FROM USUARIO WHERE EMAIL = ? AND PASSWORD = ?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			Usuario usuario = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				usuario = new Usuario(rs.getString("id"), rs.getString("nombre"), rs.getString("edad"),
						rs.getString("direccion"), rs.getString("telefono"), rs.getString("especialidad"),rs.getString("rfc"), rs.getString("sexo"),
						rs.getString("email"), rs.getString("password"));
				System.out.println(usuario.getNombre());
			}
			rs.close();
			ps.close();
			return usuario;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	@Override
	public void insertFechas(int id, int mes, int semana, int dia, String horaIncio, String horaFin) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO REGISTRO (ID,ID_MES, ID_SEMANA, DIA, ID_USUARIO, HORA_INICIO, HORA_FINAL) "
				+ " VALUES (?,?, ?, ?, ?, ?,?)";

		try {
			Connection conn = null;
			int idg = generateId("usuario");
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idg);
			ps.setInt(2, mes);
			ps.setInt(3, semana);
			ps.setInt(4, dia);
			ps.setInt(5, id);
			ps.setString(6, horaIncio);
			ps.setString(7, horaFin);
			
			ps.executeUpdate();
			System.out.println("inserto registro");
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


}
