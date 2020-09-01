package service;

import dominio.Usuario;

public interface UsuarioDao {

	void insert(Usuario usuario);

	void update(Usuario usuario);

	void delete(Usuario usuario);

	Usuario findByUsuarioNo(String email, String password);

	void insertFechas(int id, int mes, int semana, int dia, String horaIncio, String horaFin);

}
