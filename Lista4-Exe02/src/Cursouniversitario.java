
public class Cursouniversitario {
	private String NomeCurso;
	private String SiglaCurso;
	
	
	public String getNomeCurso() {
		return NomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		if(nomeCurso.length() >= 5) {
		NomeCurso = nomeCurso;
		}
	}
	
	public String getSiglaCurso() {
		return SiglaCurso;
	}
	public void setSiglaCurso(String siglaCurso) {
		if(siglaCurso.length() == 3) {
		SiglaCurso = siglaCurso;
		}
	}
	
}
