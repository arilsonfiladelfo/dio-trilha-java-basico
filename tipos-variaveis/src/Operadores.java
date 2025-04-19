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

        double dividir = 6.0 / 5.0;

        //operador ternário ? :

        int idade = 18;
        /*Esse operador é como um if em uma única linha, mas só retorna o mesmo tipo da sua variavel, int int, String String. 
        Ele tem esta estrutura*/
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status);

        // Operadores de comparação
        // Servem para comparar valores e sempre retornam um resultado booleano: true ou false

        // == : verifica se dois valores são iguais
        // != : verifica se dois valores são diferentes
        // >  : verifica se o valor da esquerda é maior que o da direita
        // <  : verifica se o valor da esquerda é menor que o da direita
        // >= : verifica se o valor da esquerda é maior ou igual ao da direita
        // <= : verifica se o valor da esquerda é menor ou igual ao da direita

        int a = 10;
        int b = 20;

        // Exemplo de uso:
        boolean resultado1 = a == b;  // false
        boolean resultado2 = a != b;  // true
        boolean resultado3 = a < b;   // true
        boolean resultado4 = a > b;   // false
        boolean resultado5 = a <= b;  // true
        boolean resultado6 = a >= b;  // false

        System.out.println("a == b? " + resultado1);
        System.out.println("a != b? " + resultado2);
        System.out.println("a < b? " + resultado3);
        System.out.println("a > b? " + resultado4);
        System.out.println("a <= b? " + resultado5);
        System.out.println("a >= b? " + resultado6);

        // Operadores Lógicos

        // 1. Operador AND (&&)
        // Retorna true se **ambas** as condições forem verdadeiras
        boolean condicao1 = (5 > 3);  // true
        boolean condicao2 = (10 > 20); // false

        // O AND vai ser true apenas se ambas as condições forem true
        boolean resultadoAnd = condicao1 && condicao2;  // false
        System.out.println("Resultado AND: " + resultadoAnd);

        // 2. Operador OR (||)
        // Retorna true se **pelo menos uma** das condições for verdadeira
        boolean resultadoOr = condicao1 || condicao2;   // true
        System.out.println("Resultado OR: " + resultadoOr);

        // 3. Operador NOT (!)
        // Inverte o valor lógico da condição. Se for true, torna false e vice-versa.
        boolean resultadoNot = !(condicao1);  // false (inverte o valor de condicao1)
        System.out.println("Resultado NOT: " + resultadoNot);

        // Exemplo com if:
        if (condicao1 && condicao2) {
            System.out.println("Ambas as condições são verdadeiras.");
        } else {
            System.out.println("Pelo menos uma condição é falsa.");
        }

        // Exemplo com OR:
        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma condição é verdadeira.");
        } else {
            System.out.println("Ambas as condições são falsas.");
        }


    }
}
