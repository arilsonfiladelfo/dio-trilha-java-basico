import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /*
         * Começando os estudos da classe Scanner utilizada para a obtenção de inputs via teclado.
         */
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        /*O scanner.next() lerá a primeira palavra até o primeiro espaçamento.
         * Caso digite "Olá mundo!", ele captará "Olá".
         * 
         * Cuidado pois ele não separa pontuação da palavra.
         * "Olá, tudo bem?" ele capturaria o "Olá".
         */

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt(); //scanner.nextInt() captura a entrada de um inteiro

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble(); //scanner.nextDouble() captura a entrada de um double

        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        scanner.close(); //Sempre que abrirmos um objeto scanner precisaremos fecha-lo
    }
}
