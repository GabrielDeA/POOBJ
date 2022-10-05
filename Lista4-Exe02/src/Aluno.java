import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	private String Nome;
	private LocalDate DataNascimento;
	
	public Aluno(String Nome, LocalDate DataNascimento) {
		this.setNome(Nome);
		this.setDataNascimento(DataNascimento);
	}
	


	public int getIdade() {
		return Period.between(DataNascimento, LocalDate.now()).getYears();
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		if(nome.length() >= 5) {
		Nome = nome;
		}
	}
	public LocalDate getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		if (Period.between(DataNascimento, LocalDate.now()).getYears() <= 10) {
		DataNascimento = dataNascimento;
		}
	}
	
	
	
	
}
