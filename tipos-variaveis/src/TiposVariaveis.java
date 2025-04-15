public class TiposVariaveis {
    public static void main(String[] args) throws Exception {


        String meuNome = "Arilson";
        byte idade = 24;
        short ano = 2025;
        int cep = 48756255;
        long cpf = 14807806586L;
        float pi = 3.14F;
        double salario = 2200.00;

        //Variavel de tipo "menor" cabe em uma de tipo "maior", para o contrario, caso suportado, necessita de casting
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        //Para que uma variavel seja permaneça inalterada sob qualquer circunstancia usamos a palavra reservada Final

        final double VALOR_DE_PI = 3.14;
        
    }
}
