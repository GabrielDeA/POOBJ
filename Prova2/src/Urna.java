//Gabriel De Antoni Santos
import java.time.LocalDate;

public class Urna extends Equipamento{
	public Urna(String codPatrimonio, int zonaEleitoral, LocalDate dataFabricacao,
			int secao, int qtdEleitores, int versaoSoftware, String chave, int volume) {
		super(codPatrimonio, zonaEleitoral, dataFabricacao, chave, volume);
		this.secao = getSecao();
		this.qtdEleitores = getQtdEleitores();
		this.versaoSoftware = getVersaoSoftware();
	}
	private int secao;
	private int qtdEleitores;
	private int versaoSoftware;
	
	public int getVolume() {
		return 489060;
	}
	
	public String getChave() {
		if (getDataFabricacao().isBefore(LocalDate.of(2020, 10, 31)) || getDataFabricacao().isEqual(LocalDate.of(2020, 10, 31))) {
			chave = "UE" + this.versaoSoftware + "ANT" + getZonaEleitoral() + this.secao;
		} else {
			chave = "UE" + this.versaoSoftware + "ATU" + getZonaEleitoral() + this.secao;
		}
		return chave;
	}
	
	
	
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public int getQtdEleitores() {
		return qtdEleitores;
	}
	public void setQtdEleitores(int qtdEleitores) {
		this.qtdEleitores = qtdEleitores;
	}
	public int getVersaoSoftware() {
		return versaoSoftware;
	}
	public void setVersaoSoftware(int versaoSoftware) {
		this.versaoSoftware = versaoSoftware;
	}
}