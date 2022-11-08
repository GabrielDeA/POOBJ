//Gabriel De Antoni Santos

import java.util.ArrayList;

public class TRESC {
	private ArrayList <Equipamento> equipamentos = new ArrayList();
	
	
	public String addEquipamentos (Equipamento e) {
		equipamentos.add(e);
		return e.getChave();
	}
	
	public int getVolumeCarga() {
		int volumeTotal = 0;
		for(Equipamento e: equipamentos ) {
			volumeTotal += e.getVolume();
		}
		return volumeTotal;
	}
	
	public String listarEquipamentos() {
		String str = "Tribunal Regional Eleitoral de Santa catarina";
		for(Equipamento e: equipamentos) {
			if( e.getVolume() == 489060) {
				str += "\n" + "Urna " + e.getCodPatrimonio() + ", chave " + e.getChave() + ", volume " + e.getVolume() + ", fabricado em " + e.getDataFabricacao(); 
			} else {
				str += "\n" + "Computador" + e.getCodPatrimonio() + ", chave " + e.getChave() + ", volume " + e.getVolume() + ", fabricado em " + e.getDataFabricacao(); 
			}
		}
			return str;	
	}
}
