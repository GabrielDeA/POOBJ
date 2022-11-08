//Gabriel De Antoni Santos
import java.time.LocalDate;

public class Computador extends Equipamento{
	public Computador(String codPatrimonio, int zonaEleitoral, LocalDate dataFabricacao,
			String endereco, int qtdUrnas, String sistOper, String versaoSO, String chave, int volume) {
		super(codPatrimonio, zonaEleitoral, dataFabricacao, chave, volume);
		this.endereco = getEndereco();
		this.qtdUrnas = getQtdUrnas();
		this.sistOper = getSistOper();
		this.versaoSO = getVersaoSO();
	}
	private String endereco;
	private int qtdUrnas;
	private String sistOper;
	private String versaoSO;
	
	public int getVolume() {
		return 352000;
	}
	
	public String getChave() {
		chave = "CA" + this.endereco.charAt(4) + getZonaEleitoral() + this.qtdUrnas + getCodPatrimonio().length();
		return chave;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.length() >= 5) {
		this.endereco = endereco;
		} else throw new IllegalArgumentException("Endereço deve ser ao menos 5 caracteres");
	}
	public int getQtdUrnas() {
		return qtdUrnas;
	}
	public void setQtdUrnas(int qtdUrnas) {
		this.qtdUrnas = qtdUrnas;
	}
	public String getSistOper() {
		return sistOper;
	}
	public void setSistOper(String sistOper) {
		this.sistOper = sistOper;
	}
	public String getVersaoSO() {
		return versaoSO;
	}
	public void setVersaoSO(String versaoSO) {
		this.versaoSO = versaoSO;
	}
}
