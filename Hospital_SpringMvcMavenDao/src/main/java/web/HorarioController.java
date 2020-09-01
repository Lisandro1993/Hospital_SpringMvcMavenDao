package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.UsuarioDao;
import dominio.Usuario;

@Controller
@RequestMapping("/bienvenida")
public class HorarioController {
	
	private UsuarioDao usuarioDao;
	@Autowired
	public HorarioController(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public void setupForm() {
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@RequestParam("id") int id, @RequestParam("mes") int mes,@RequestParam("semana") int semana,@RequestParam("lunes") int dia,@RequestParam("lunesHI") String horaIncio ,@RequestParam("lunesF") String horaFin) {
		usuarioDao.insertFechas(id, mes, semana, dia, horaIncio, horaFin);
		
		return "success";

	}

	
}
