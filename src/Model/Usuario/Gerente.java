package Model.Usuario;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;

public class Gerente extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -394007907597939601L;
	protected float salario;
	protected String pis;
	protected LocalDate dataAdmissao;
	
	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public Gerente(String codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
			String cep, String email, float salario, String pis, LocalDate dataAdmissao) {
		super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
		this.salario = salario;
		this.pis = pis;
		this.dataAdmissao = dataAdmissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getPis() {
		return pis;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.pis;
	}
}
