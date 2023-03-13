package Controller;

import java.time.LocalDate;
import java.util.Iterator;


import Model.Comercio.*;
import Model.Usuario.*;

public final class ControladorUsuario {
	
	private static ControladorUsuario instancia = null;
	private ComercioEletronico comercio;


	private ControladorUsuario() {
		this.comercio = ComercioEletronico.getInstancia();
	}


	public static ControladorUsuario getInstancia(){
		if (instancia == null){
			instancia = new ControladorUsuario();
		}
		return instancia;
	}


	// Metodos

	public void cadCliente(String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
	String cep, String email, LocalDate dataCasatro, boolean clienteOuro){
		comercio.cadCliente(tamanhoClientes(), nome, cpf, rg, dataNascimento, endereco, cep, email, dataCasatro, clienteOuro);

	}

	public void cadGerente(String nome, String cpf, String rg, LocalDate dataNascimento, String endereco,
	String cep, String email, float salario, String pis, LocalDate dataAdmissao){
		comercio.cadGerente(tamanhoGerentes(), nome, cpf, rg, dataNascimento, endereco, cep, email, salario, pis, dataAdmissao);
	}

	public String tamanhoClientes() {
		String tamanho = "CL";
		int tam = comercio.getTamanhoCliente();
		if(tam < 10) {
			tamanho = tamanho + "000" + Integer.toString(tam);
		} else if (tam < 100) {
			tamanho = tamanho + "00" + Integer.toString(tam);
		} else if(tam < 1000){
			tamanho = tamanho + "0" + Integer.toString(tam);
		} else {
			tamanho = tamanho + Integer.toString(tam);
		}
		return tamanho;
	}

	public String tamanhoGerentes() {
		String tamanho = "GR";
		int tam = comercio.getTamanhoGerente();
		if(tam < 10) {
			tamanho = tamanho + "000" + Integer.toString(tam);
		} else if (tam < 100) {
			tamanho = tamanho + "00" + Integer.toString(tam);
		} else if(tam < 1000){
			tamanho = tamanho + "0" + Integer.toString(tam);
		} else {
			tamanho = tamanho + Integer.toString(tam);
		}
		return tamanho;
	}

	public Iterator<Usuario> getClientesOuro(){
		Iterator<Usuario> resultado = comercio.getClientesOuro();
		return resultado;
	}

	public Iterator<Usuario> getClientes(){
		Iterator<Usuario> resultado = comercio.getClientes();
		return resultado;
	}

	public Iterator<Usuario> getGerente(){
		Iterator<Usuario> resultado = comercio.getGerentes();
		return resultado;
	}
	
	public Usuario buscaCliente(String codigo){
		return buscaCliente(codigo);
	}

	public Usuario buscaGerente(String codigo){
		return buscaGerente(codigo);
	}


	public ComercioEletronico getComercio() {
		return comercio;
	}
	
	public int getTamanhoCliente() {
		return comercio.getTamanhoCliente();
	}
	
	public int getTamanhoGerentes() {
		return comercio.getTamanhoGerente();
	}
	public int getTamanhoClientesouro() {
		return comercio.getTamanhoClientesOuro();
	}

}
