//André Heller, Gabriel De Antoni Santos, Lucas Tizon

import java.time.LocalDate;

public class Telefone extends Exception{
	private char Tipo;
	private String Endereco;
	private String Nome;
	private String Numero;
	private LocalDate Data;
	
	public char getTipo() {
		return Tipo;
	}
	public void setTipo(char tipo) throws IllegalArgumentException {
		if (tipo != 'R' && tipo != 'C' && tipo != 'E') {
			throw new IllegalArgumentException ("Tipo deve ser R, C ou E.");
		} else {
		Tipo = tipo;
	}
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) throws IllegalArgumentException {
		if ( numero.length() == 10 && numero.contains("[a-zA-Z]+") != true ) {
			Numero = numero;
		} else {
			throw new IllegalArgumentException("teste");
		}
	}
	
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate data) {
		Data = data;
	}
	
	
	
	
}
