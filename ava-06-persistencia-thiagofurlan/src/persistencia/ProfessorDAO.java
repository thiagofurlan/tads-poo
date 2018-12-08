package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import modelo.Professor;
import modelo.Professor.EstadoCivil;
import modelo.Professor.Genero;

// Data Access Object: objeto de acesso a dados
// Um objeto que faz a persistência/interface com o "banco"
public class ProfessorDAO {
	private String url = "jdbc:postgresql://localhost/siamelhorado";
	private String user = "postgres";
	private String password = "postgres";

	// CRUD: Create, Read, Update, Delete
	public void insert(Professor professor) { // create, save
		// não inserir um aluno salvo anteriormente
		if (aluno.getId() != null) {
			throw new RegistroDuplicadoException();
		}
		// o nome é NOT NULL no banco, logo o objeto deve ter nome
		if (aluno.getNome() == null) {
			throw new NullPointerException("o nome não pode ser nulo");
		}

		try {
			// abrir a conexão
			Connection conexao = DriverManager.getConnection(url, user, password);
			// preparar o comando
			String sql = "INSERT INTO professores (nome, data_nascimento, estado_civil, genero) " + "VALUES (?, ?, ?, ?);"; // ?
																														// placeholder
																														// (reserva
																														// lugar)
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, professor.getNome()); // sempre tem um nome (NOT NULL)

			if (professor.getDataNascimento() == null) {
				comando.setNull(2, Types.DATE);
			} else {
				comando.setDate(2, Date.valueOf(professor.getDataNascimento()));
			}

			if (professor.getEstadoCivil() == null) {
				comando.setNull(3, Types.INTEGER);
			} else {
				comando.setInt(3, professor.getEstadoCivil().ordinal());
			}

			if (professor.getGenero() == null) {
				comando.setNull(4, Types.CHAR);
			} else {
				comando.setString(4, professor.getGenero().LETRA);
			}
			// executar o comando
			comando.execute();
			// pegar o retorno (pegando o id gerado)
			ResultSet resultado = comando.getGeneratedKeys();
			if (resultado.next()) {
				int idGerado = resultado.getInt(1); // 1ra coluna
				professor.setId(idGerado);
			}
			// fechar a conexão
			conexao.close();
		} catch (Exception e) {
			throw new RuntimeException(e); // relançar excep
		}
	}

	public Professor select(int id) { // read, load, search
		Professor p = null;
		try {
			Connection conexao = DriverManager.getConnection(url, user, password);
			// NÃO CONCATENE SQL! use o ? (place holder)
			String sql = 
				"SELECT * FROM professores WHERE id = ?";
			PreparedStatement comando = 
					conexao.prepareStatement(sql);
			comando.setInt(1, id); // sempre tem um nome (NOT NULL)
			// executar uma query!
			ResultSet resultado = comando.executeQuery();
			if (resultado.next()) { // encontrou!
				p = new Aluno();
				p.setId(id);
				p.setNome(resultado.getString("nome"));
				if (resultado.getDate("data_nascimento") != null) {
					p.setDataNascimento(resultado.getDate("data_nascimento").toLocalDate());
				}
				if (resultado.getString("genero") != null) {
					p.setGenero(Genero.fromString(resultado.getString("genero")));
				}
				if (resultado.getObject("estado_civil") != null) {
					p.setEstadoCivil(EstadoCivil.values()[resultado.getInt("estado_civil")]);
				}
			}
			conexao.close();
			return p;
		} catch (Exception e) {
			throw new RuntimeException(e); // relançar excep
		}
	}

	public List<Professor> select() {
		List<Professor> professores = new ArrayList<>();
		try {
			Connection conexao = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM professores";
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				Professor p = new Professor();
				professores.add(p);
				p.setId(resultado.getInt("id"));
				p.setNome(resultado.getString("nome"));
				if (resultado.getDate("data_nascimento") != null) {
					p.setDataNascimento(resultado.getDate("data_nascimento").toLocalDate());
				}
				if (resultado.getString("genero") != null) {
					p.setGenero(Genero.fromString(resultado.getString("genero")));
				}
				if (resultado.getObject("estado_civil") != null) {
					p.setEstadoCivil(EstadoCivil.values()[resultado.getInt("estado_civil")]);
				}
			}
			conexao.close();
			return professores;
		} catch (Exception e) {
			throw new RuntimeException(e); // relançar excep
		}
	}
	/*
	public void delete(int[] ids) {
		try (Connection cnx = DriverManager.getConnection(url, user, password)) { // autoclose
			String sql = "DELETE FROM alunos WHERE id IN(?)";
			PreparedStatement cmd = cnx.prepareStatement(sql);
			// cmd.setArray(1, ids); // TODO
			cmd.execute();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	*/
	public void delete(int id) { // remove, exclui, destroy
		try (Connection cnx = DriverManager.getConnection(url, user, password)) { // autoclose
			String sql = "DELETE FROM professores WHERE id = ?";
			PreparedStatement cmd = cnx.prepareStatement(sql);
			cmd.setInt(1, id);
			cmd.execute();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void update(Aluno aluno) {

	}

}
