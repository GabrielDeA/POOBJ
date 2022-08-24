
public class ExemploPrincipal {

	public static void main(String[] args) {
		
		VetorDeReais meuVetor = new VetorDeReais(4);
		VetorDeReais segundo = new VetorDeReais(3);
		
		meuVetor.setValor(4, 0);
		meuVetor.setValor(3, 1);
		meuVetor.setValor(2, 2);
		meuVetor.setValor(1, 3);
		
		segundo.setValor(10, 0);
		segundo.setValor(5, 1);
		segundo.setValor(2, 2);
		
		//item b
		//int qtd = meuVetor.nPares();
		//System.out.println(qtd);
		
		//item c
		//VetorDeReais div = meuVetor.divisao(segundo);
		
		
		//for (int i = 0; i<3; i++) {
		//System.out.println(div.getValor(i));
		
		//}
		
		//item d
		double mult = meuVetor.multiplicacao(segundo);
		System.out.println(mult);
		
		//item e
		meuVetor.inverter();
		for (int i = 0; i<4; i++) {
			System.out.println(meuVetor.getValor(i));
		}
	
	}

}
