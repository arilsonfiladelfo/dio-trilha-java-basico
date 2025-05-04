public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        /*
         * Em arrays o indice inicia-se em 0, nesse array, seria correspondido pelo nome "FELIPE"
         */
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}
