package model.entidades;

public class Pessoa {
	private Long id;
	private String nome;
	private String endereco;
	private String cpf;
	private String email;
	
	public Pessoa() { super(); }
	public Pessoa(String nome, String endereco, String cpf, String email) {
		this();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.email = email;
	}
	public Pessoa(Long id, String nome, String endereco, String cpf, String email) {
		this(nome, endereco, cpf, email);
		this.id = id;
	}
	public Long getId() { return id; }
	public String getNome() { return nome; }
	public String getEndereco() {  return endereco; }
	public String getCpf() { return cpf; }
	public String getEmail() { return email; }
	public void setId(Long id) { this.id = id; }
	public void setNome(String nome) { this.nome = nome; }
	public void setEndereco(String endereco) { this.endereco = endereco; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	public void setEmail(String email) { this.email = email; }
}
