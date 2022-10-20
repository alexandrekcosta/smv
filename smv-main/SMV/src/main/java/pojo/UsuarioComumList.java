package pojo;

import java.util.List;

public class UsuarioComumList {
	
	private String nome;
	private String email;
	private String senha;
	private List<UsuarioComum> lista;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<UsuarioComum> getLista() {
		return lista;
	}
	public void setLista(List<UsuarioComum> lista) {
		this.lista = lista;
	}
	
	

}
