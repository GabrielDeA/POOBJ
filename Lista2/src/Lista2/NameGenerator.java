/*Seu primeiro nome na s�rie Star Wars:
i.Pegue as tr�s primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome
Seu sobrenome na s�rie Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua m�e
ii.Adicione a ele as tr�s primeiras letras do nome da cidade onde voc� nasce	
*/
package Lista2;
import java.util.Scanner;


public class NameGenerator {
	public static void main(String[] args) {
	
	//public static main String generateStarWarsName(String[] entrada) {
		//Scanner tec = new Scanner(System.in) 
		String[] exemplo = new String[3];
		String[] SW1name = new String[1];
		exemplo[0] = "Jo�o aparecido da silva";
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
