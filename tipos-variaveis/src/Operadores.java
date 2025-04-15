public class Operadores {
    public static void main(String[] args) {

        //operador de atribuição "="
        //atribui um valor int, double, boolean, String e etc à uma variavel

        //Operador de adição "+"

        int somar = 20 + 20;

        //Funcionamento do operador "+" em String
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        //operador de subtração "-"

        int subtrair = 50 - 25;

        //operador de multiplicação "*"

        int multiplicar = 5 * 5;

        //operador de divisão "/"

        double dividir = 6 / 5;
    }
}
