import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        // O loop while é usado quando queremos repetir uma ação 
        // enquanto uma condição for verdadeira.
        // Aqui, ele continuará executando enquanto houver dinheiro na mesada (mesada > 0)
        while (mesada > 0) {
            // Geramos um valor aleatório entre 2 e 8 para simular o preço de um doce
            Double valorDoce = valorAleatorio();

            // Se o doce for mais caro do que a mesada restante,
            // ajustamos para gastar apenas o que resta
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            // Exibimos o valor do doce que foi "comprado"
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");

            // Subtraímos o valor do doce da mesada
            mesada = mesada - valorDoce;
        }

        // Quando a condição do while (mesada > 0) não for mais verdadeira,
        // o laço termina e o programa continua a execução abaixo
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");
    }

    // Método que gera um número aleatório entre 2 e 8
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
