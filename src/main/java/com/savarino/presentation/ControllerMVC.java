package com.savarino.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.savarino.entities.Magazzino;
import com.savarino.services.MagazzinoService;

@Controller
@RequestMapping("")
public class ControllerMVC {
	
	@Autowired
	private MagazzinoService service;
	
	@GetMapping("login")
	public String login(Model m) {
		
		m.addAttribute("titolo", "login");
		
		return "Login";
	}
	
	@PostMapping("login")
	public String doLogin(@RequestParam String username, @RequestParam String password) {
		
		if (username.equals("admin") && password.equals("admin")) {
			
			System.out.println(username + password);
			return "redirect:home";
		}
		return "redirect:login";
	}
	
	
	
	@GetMapping("carico")
	public String carico(Model m) {
		
		m.addAttribute("titolo", "carico");
		m.addAttribute("prodotti", service.getProdotti());
		return "Carico";
	}
	
	@PostMapping("carica")
	public String carica(Magazzino m) {
		
		service.caricaMagazzino(m);
		
		return "redirect:magazzino";
		
	}
	
	
	
	@GetMapping("home")
	public String home(Model m) {
		
		m.addAttribute("titolo", "home");
		
		return "Home";
	}
	@GetMapping("magazzino")
	public String magazzino(Model m) {
		
		m.addAttribute("titolo", "magazzino");
		
		m.addAttribute("prodotti", service.getMagazzino());
		
		return "Magazzino";
	}
	@GetMapping("scarico")
	public String scarico(Model m) {
		
		m.addAttribute("titolo", "scarico");
		m.addAttribute("prodotti", service.getProdotti());
		return "Scarico";
	}
	
	@PostMapping("scarica")
	public String scarica(Magazzino m) {
		
		if(m.getQuantita()>0) {
			m.setQuantita(- m.getQuantita());
		}
		
		service.scaricaMagazzino(m);
		
		return "redirect:magazzino";
		
	}
	

}
