import java.time.LocalDate;

public class AlunoUniversitario extends Aluno {
	private char FormaIngresso;
	private String Curso;
	
	public AlunoUniversitario (String Nome, LocalDate DataNascimento, 
			char FormaIngresso, String Curso) {
		super(Nome, DataNascimento);
		this.setCurso(Curso);
		this.setFormaIngresso(FormaIngresso);
	}
	
	

	public char getFormaIngresso() {
		return FormaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		if(formaIngresso == 'V' || formaIngresso == 'E' || formaIngresso == 'S'
				|| formaIngresso == 'T' || formaIngresso == 'I') {
		FormaIngresso = formaIngresso;
		}
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		//TODO
		Curso = curso;
		}
	}
	

