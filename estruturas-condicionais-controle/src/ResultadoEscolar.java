import java.util.Scanner;
import java.util.Locale;
public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /*
         * Uma estrutura condicional composta seguira por um caminho, dependendo da validação da condição proposta
         */

        System.out.println("Digite a nota do aluno");
        int nota = scanner.nextInt();

        if (nota >= 7){
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Aluno em recuperação!");
        } else{
            System.out.println("Reprovado!");
        }
        
        /*
         * String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
         * acima um exemplo de condição ternaria, facilita o codigo mas oferece apenas duas opções, if e else
         */

        scanner.close();
    }

}
