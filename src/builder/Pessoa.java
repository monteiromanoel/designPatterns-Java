package builder;

import java.time.LocalDate;

public class Pessoa {

	private String nome;

	private String sobrenome;

	private String email;

	private String documento;

	private String apelido;

	private LocalDate dataNascimento;

	private Pessoa(String nome, String sobrenome, String email, String documento, String apelido,
			LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.documento = documento;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", documento=" + documento
				+ ", apelido=" + apelido + ", dataNascimento=" + dataNascimento + "]";
	}

	public static class PessoaBuilder {

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

		public Pessoa build() {
			return new Pessoa(nome, sobrenome, email, documento, apelido, dataNascimento);
		}


	}


}
