
public class VetorDeReais {
	public double[] vetor;
	
	public VetorDeReais(int tamanho) {
		this.vetor = new double[tamanho];
	}
	
	//item a
	public void setValor (double valor, int posicao) {
		this.vetor[posicao] = valor;
	}
	
	//item b
	public int nPares () {
		int qtdPar = 0;
		for (int i = 0; i<vetor.length; i++) {
			if ((int)vetor[i] % 2 == 0) {
				qtdPar++;
			}
		}
		return qtdPar;
	}
	
	//item c
	public VetorDeReais divisao(VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return null;
		}
		VetorDeReais novo = new VetorDeReais(vetor.length);
		double novoValor;
		for (int i = 0; i<vetor.length; i++) {
			novoValor = vetor[i]/outro.getValor(i);
			novo.setValor(novoValor, i);
		}
		return novo;
		
	}
	
	public double getValor(int posicao) {
		return this.vetor[posicao];
	}
	
	public int getTamanho() {
		return this.vetor.length;
	}
	
	//item d
	public double multiplicacao (VetorDeReais outro) {
		if (this.getTamanho() != outro.getTamanho()) {
			return Double.NaN;
		}
		double M = 0;
		for (int i = 0; i<vetor.length; i++) {
			M += vetor[i] * outro.getValor(vetor.length - i -1);
		}
		return M;
	}
	
	//item e
	public void inverter() {
		double temporaria;
		
		for (int i = 0; i < this.getTamanho()/2; i++ ) {
			temporaria = vetor[i];
			vetor[i] = vetor[vetor.length - i - 1];
			vetor[vetor.length - i - 1] = temporaria;
		}
	}
	
	
}
