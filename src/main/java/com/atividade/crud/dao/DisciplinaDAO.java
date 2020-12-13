package com.atividade.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.atividade.crud.classes.Disciplina;
import com.atividade.crud.domain.DatabaseApplication;

public class DisciplinaDAO {
	
	public static void inserir(Disciplina disciplina) {
		Connection connection = DatabaseApplication.getConnection();
		PreparedStatement stmt;
		
		String sql = "INSERT INTO disciplina (nome, professor, periodo, codigo_classroom) VALUES (?, ?, ?, ?)";
		
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, disciplina.getNomeDisciplina());
			stmt.setString(2, disciplina.getNomeProfessor());
			stmt.setInt(3, disciplina.getPeriodo());
			stmt.setString(4, disciplina.getCodigoSala());
			
			stmt.execute();
			stmt.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Disciplina> listar() {
		try {
			Connection connection = DatabaseApplication.getConnection();
			List<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
			
			String sql = "SELECT * FROM disciplina";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet retornoBD = stmt.executeQuery();
			
			while(retornoBD.next()) {
				listaDisciplinas.add(
					new Disciplina(
						retornoBD.getInt("id"),
						retornoBD.getString("nome"),
						retornoBD.getString("professor"),
						retornoBD.getInt("periodo"),
						retornoBD.getString("codigo_classroom"))
					);
			}
			
			retornoBD.close();
			stmt.close();
			connection.close();
			
			return listaDisciplinas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
