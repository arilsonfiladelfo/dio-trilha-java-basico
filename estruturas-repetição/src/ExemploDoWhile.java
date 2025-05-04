import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        // Exibe mensagem inicial indicando que a chamada está começando
        System.out.println("Discando...");

        // Estrutura do-while: garante que o bloco será executado pelo menos uma vez
        do {
            // Simula o telefone tocando
            System.out.println("Telefone tocando");
        } while (tocando()); // Enquanto o método tocando() retornar true, o telefone continua tocando

        // Quando o método tocando() retornar false, o loop termina e o programa segue aqui
        System.out.println("Alô !!!");
    }

    // Método que simula se a pessoa atendeu ou não a ligação
    private static boolean tocando() {
        // Gera um número aleatório entre 0 e 2
        // Se o número for 1, consideramos que a pessoa atendeu
        boolean atendeu = new Random().nextInt(3) == 1;

        // Imprime no console se a pessoa atendeu (true) ou não (false)
        System.out.println("Atendeu? " + atendeu);

        // Retorna o contrário do valor de "atendeu":
        // - Se atendeu (true), retorna false → para o loop
        // - Se não atendeu (false), retorna true → continua tocando
        return !atendeu;
    }
}
