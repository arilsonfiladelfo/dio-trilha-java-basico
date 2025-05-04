public class CaixaEletronico {
    public static void main(String[] args) {
        /*
         * Estrutura condicional simples, realizará uma ação caso a condição seja verdadeira.
         */
        double saldo = 25.00;
        double valorSolicitado = 24.00;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }
}
