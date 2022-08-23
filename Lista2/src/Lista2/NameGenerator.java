/*Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome
Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasce	
*/
package Lista2;
import java.util.Scanner;


public class NameGenerator {
	public static void main(String[] args) {
	
	//public static main String generateStarWarsName(String[] entrada) {
		//Scanner tec = new Scanner(System.in) 
		String[] exemplo = new String[3];
		String[] SW1name = new String[1];
		exemplo[0] = "João aparecido da silva";
		exemplo[1] = "Dores";
		exemplo[2] = "Blumenau";
		for(int i = exemplo[0].length(); i<=0; i-- ) {
			SW1name = exemplo[0].split(" ");
		}
		
		
		
		//SW1name[0] = exemplo[0].substring( 18, exemplo[0].length()-2);
		System.out.println(SW1name);
	
	}
}
//}
