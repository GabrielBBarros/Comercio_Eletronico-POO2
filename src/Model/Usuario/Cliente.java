package Model.Usuario;

import java.io.Serializable;
import java.time.LocalDate;

public class Cliente extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6657494391159375128L;
	protected LocalDate dataCadastro;
	protected boolean clienteOuro;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
			String cep, String email, LocalDate dataCasdastro, boolean clienteOuro) {
		super(codigo, nome, cpf, rg, dataNascimento, endereco, cep, email);
		this.dataCadastro = dataCasdastro;
		this.clienteOuro = clienteOuro;
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
	public boolean isClienteOuro() {
		return clienteOuro;
	}

	public void setClienteOuro(boolean clienteOuro) {
		this.clienteOuro = clienteOuro;
	}

	@Override
	public String toString() {
		if(clienteOuro)
			return this.nome + " - Cliente Ouro";
		return this.nome;
	}
	
	

}
