package builder.solucao;

import java.time.LocalDate;

public class PessoaBuilder {

	private String nome;

	private String sobrenome;

	private String email;

	private String documento;

	private String apelido;

	private LocalDate dataNascimento;

	public PessoaBuilder nome(String nome) {
		this.nome = nome;
		return this; // retorna o proprio objeto
	}

	public PessoaBuilder sobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		return this;
	}

	public PessoaBuilder email(String email) {
		this.email = email;
		return this;
	}

	public PessoaBuilder documento(String documento) {
		this.documento = documento;
		return this;
	}

	public PessoaBuilder apelido(String apelido) {
		this.apelido = apelido;
		return this;
	}

	public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}
	/*
	 Esse método não funciona mais por conta da passagem do construtor da class
	 Pessoa ter sido passado para private

	 public Pessoa criaPessoa() {
	 	return new Pessoa(nome, sobrenome, email,
	 	documento, apelido, dataNascimento);
	 }
	 */



}
