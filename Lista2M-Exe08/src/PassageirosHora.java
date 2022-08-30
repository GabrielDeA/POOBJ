
public class PassageirosHora {
	public int[][][] matriz = new int[12][30][24];
	
	//item a
	public void adiciona(int dia, int mes, int hora) {
		matriz[mes-1][dia-1][hora] ++;
	}
	
	//item b
	public int quantosPassageiros (int dia, int mes) {
		int PassDia = 0;
		for (int i = 0; i < 24; i++) {
			PassDia += matriz[mes-1][dia-1][i];
		}
		return PassDia;
	}
	
	//item c
	public int mesMenorFluxo() {
		int menor = 10000;
		int menorMes = 0;
		for (int m = 0; m<12; m++) {
			for (int d = 0; d<30; d++) {
				for (int h = 0; h<24; h++) {
					int PassMes = 0;
					PassMes += matriz[m][d][h];
					if (PassMes < menor) {
						menor = PassMes;
						menorMes = m+1;
					}
				}
			}
		}
		
		return menorMes;
	}
	
}
