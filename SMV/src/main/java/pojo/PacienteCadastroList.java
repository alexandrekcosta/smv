package pojo;

import java.util.Date;
import java.util.List;

public class PacienteCadastroList {
	
	private String nome;
	private Long cpf;
	private Boolean sexo;
	private Date nascimento;
	private String endereco;
	private Long cep;
	private List<PacienteCadastro> lista;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Boolean getSexo() {
		return sexo;
	}
	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public List<PacienteCadastro> getLista() {
		return lista;
	}
	public void setLista(List<PacienteCadastro> lista) {
		this.lista = lista;
	}
	
	

}
