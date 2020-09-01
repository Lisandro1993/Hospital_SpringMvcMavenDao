package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dominio.Usuario;
import service.UsuarioDao;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	
	private UsuarioDao usuarioDao;
	@Autowired
	public RegistroController(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "registro";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("usuario") Usuario usuario) {
		usuarioDao.insert(usuario);
		return "index";

	}
	

}
