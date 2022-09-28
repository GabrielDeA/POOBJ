
//André Heller, Gabriel De Antoni Santos, Lucas Tizon
import java.time.LocalDate;

public class Telefone extends Exception{
	private char Tipo;
	private String Endereco;
	private String Nome;
	private String Numero;
	private LocalDate Data;
	private int qtdOcorrencias;
	
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
	
	public double getPreco() {
		double ValorMensal = 0;
		if (Tipo == 'R') {
			ValorMensal = 15.00;
		}
		
		else if(Tipo == 'C') {
			LocalDate PastDate = LocalDate.parse("2019-01-01");
			if (Data.isBefore(PastDate)) {
				ValorMensal =25.00;
			} else { ValorMensal = 37.50;}
		}
		
		else if(Tipo == 'E') {
			if (qtdOcorrencias >= 1 && qtdOcorrencias <=1000) {
				ValorMensal = 50.00;
			} else if (qtdOcorrencias > 1000 && qtdOcorrencias <= 5000) {
				ValorMensal = 67.80;
			} else if (qtdOcorrencias > 5000 && qtdOcorrencias <= 10000) {
				ValorMensal = 98.50;
			} else if (qtdOcorrencias > 10000 && qtdOcorrencias <= 50000) {
				ValorMensal = 123.90;
			} else if (qtdOcorrencias > 50000) {
				ValorMensal = 187.82;
			}
		}
		
		
		return ValorMensal;
	}
	public int getQtdOcorrencias() {
		return qtdOcorrencias;
	}
	public void setQtdOcorrencias(int qtdOcorrencias) {
		if(Tipo == 'E' && qtdOcorrencias > 0) {
		this.qtdOcorrencias = qtdOcorrencias;
		} 
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) throws IllegalArgumentException {
		if(endereco != null && !endereco.isBlank()) {
		Endereco = endereco;
	} else {
		throw new IllegalArgumentException("Endereço não pode estar vazio");
	}
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) throws IllegalArgumentException {
		if (nome != null && !nome.isBlank()) {
		Nome = nome;
		} else {
			throw new IllegalArgumentException("Nome não pode estar vazio");
		}
	}
	public String getNumero() {
		return Numero;
	}
	public void setNumero(String numero) throws IllegalArgumentException {
		if ( numero.length() == 10 && numero.contains("[a-zA-Z]+") != true ) {
			Numero = numero;
		} else {
			throw new IllegalArgumentException("Número deve conter 10 digitos e ser formado apenas por números");
		}
	}
	
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate data) {
		Data = data;
	}
	
	
	
	
}
