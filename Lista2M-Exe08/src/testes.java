
public class testes {

	public static void main(String[] args) {
		PassageirosHora ph = new PassageirosHora();
		
		
		
		ph.adiciona(5, 2, 5);
		ph.adiciona(5, 2, 5);
		
		int qtde = ph.quantosPassageiros(5, 2);
		System.out.println(qtde);
		
		int mes = ph.mesMenorFluxo();
		System.out.println(mes);
	}

}
