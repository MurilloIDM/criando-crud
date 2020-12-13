package com.atividade.crud.classes;

public class Disciplina {

	private Integer idDisciplina;
	private String nomeDisciplina;
	private String nomeProfessor;
	private Integer periodo;
	private String codigoSala;
	
	public Integer getIdDisciplina() { return this.idDisciplina; }
	
	public void setIdDisciplina(Integer idDisciplina) { this.idDisciplina = idDisciplina; }
	
	public Integer getPeriodo() { return this.periodo; }
	
	public void setPeriodo(Integer periodo) { this.periodo = periodo; }
	
	public String getNomeDisciplina() { return this.nomeDisciplina; }
	
	public void setNomeDisciplina(String nomeDisciplina) { this.nomeDisciplina = nomeDisciplina; }
	
	public String getNomeProfessor() { return this.nomeProfessor; }
	
	public void setNomeProfessor(String nomeProfessor) { this.nomeProfessor = nomeProfessor; }
	
	public String getCodigoSala() { return this.codigoSala; }
	
	public void setCodigoSala(String codigoSala) { this.codigoSala = codigoSala; }
	
	public Disciplina() { super(); }
	
	public Disciplina(Integer idDisciplina, String nomeDisciplina, String nomeProfessor, Integer periodo, String codigoSala) {
		super();
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		this.periodo = periodo;
		this.codigoSala = codigoSala;
	}
	
	public Disciplina(String nomeDisciplina, String nomeProfessor, Integer periodo, String codigoSala) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		this.periodo = periodo;
		this.codigoSala = codigoSala;
	}
	
}
