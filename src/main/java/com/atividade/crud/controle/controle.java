package com.atividade.crud.controle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
