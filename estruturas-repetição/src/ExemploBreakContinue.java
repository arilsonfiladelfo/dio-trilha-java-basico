public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        // Loop para iterar sobre os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Se o número for 5, interrompe o loop
            if (i == 5) {
                System.out.println("Número 5 encontrado, interrompendo o loop...");
                break; // Interrompe o loop quando i for 5
            }
            
            // Se o número for par, pula para a próxima iteração
            if (i % 2 == 0) {
                System.out.println("Número " + i + " é par, mas continuando o loop...");
                continue; // Pula para a próxima iteração do loop
            }
            
            // Caso contrário, apenas imprime o número
            System.out.println("Número " + i + " é ímpar.");
        }
    }
}
