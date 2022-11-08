//Gabriel De Antoni Santos
import java.time.LocalDate;

public class Equipamento {
	private String codPatrimonio;
	private int zonaEleitoral;
	private LocalDate dataFabricacao;
	protected String chave;	
	protected int volume;
	
	public Equipamento(String codPatrimonio, int zonaEleitoral, LocalDate dataFabricacao, String chave, int volume) {
		super();
		this.codPatrimonio = getCodPatrimonio();
		this.zonaEleitoral = getZonaEleitoral();
		this.dataFabricacao = getDataFabricacao();
	}
	public int getVolume() {
		return volume;
	}
	
	public String getChave() {
		return chave;
	}
	
	public String getCodPatrimonio() {
		return codPatrimonio;
	}
	public void setCodPatrimonio(String codPatrimonio) {
		this.codPatrimonio = codPatrimonio;
	}
	public int getZonaEleitoral() {
		return zonaEleitoral;
	}
	public void setZonaEleitoral(int zonaEleitoral) {
		if(zonaEleitoral >= 1 && zonaEleitoral <= 106) {
		this.zonaEleitoral = zonaEleitoral;
		} else throw new IllegalArgumentException("Zona eleitoral deve ser entre 1 e 106");
	}
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
}
