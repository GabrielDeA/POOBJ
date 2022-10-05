import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
	private int Ano;
	
	
	public AlunoEnsinoMedio (String Nome, LocalDate DataNascimento) {
		super(Nome, DataNascimento);
		this.setAno(Ano);
	}
	
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		if (Ano > 0 && Ano < 4) {
		Ano = ano;
		}
	}
	
	

}
