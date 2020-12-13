package com.atividade.crud.controle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atividade.crud.classes.Disciplina;
import com.atividade.crud.dao.DisciplinaDAO;

@Controller
public class controle {

	
	@RequestMapping("/disciplinas")
	public String listaDisciplinas(Model model) {
		List<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
		
		listaDisciplinas = DisciplinaDAO.listar();
		model.addAttribute("disciplinas", listaDisciplinas);
		return "disciplina";
	}
	
	@GetMapping("/cadastrar-disciplina")
	public String exibeForm(Model model) {
		model.addAttribute("disciplina", new Disciplina());
		return "cadastrar-disciplina";
	}
	
	@PostMapping("/cadastrar-disciplina")
	public String cadastraDisciplina(Disciplina disciplina) {
		DisciplinaDAO.inserir(disciplina);
		return "redirect:/disciplinas";
	}
}
