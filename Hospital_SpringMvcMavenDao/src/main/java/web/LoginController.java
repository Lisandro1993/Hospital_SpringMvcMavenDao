package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dominio.Usuario;
import service.UsuarioDao;

@Controller
@RequestMapping("/index")

public class LoginController {
	
	private UsuarioDao usuarioDao;
	@Autowired
	public LoginController(UsuarioDao usuarioDao) {
		this.usuarioDao= usuarioDao;
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public void setupForm() {

	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@RequestParam("email") String us, @RequestParam("password") String ps, Model model) {
		 Usuario temp ;
		if (us != null && ps != null) {
		
			temp =	usuarioDao.findByUsuarioNo(us, ps);
			if (temp != null) {
				model.addAttribute("usuario",temp);
				return"bienvenida";		
			}		
		}
		return "index";
	}

	
	
}
