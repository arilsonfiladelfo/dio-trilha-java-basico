public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "A";
        /*
         * Sistema de switch-case, mesmo funcionamento do if, else if, else.
         * Na pratica é a mesma coisa, muda apenas a forma de visualização
         * 
         * tem também a versão moderna
         * 
         * String resultado = switch (sigla) {
         *    case "P" -> "PEQUENO";
         *    case "M" -> "MEDIO";
         *    case "G" -> "GRANDE";
         *    default -> "INDEFINIDO";
         * };
         * 
         * mais intuitivo, o -> substitui o break
         */
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        
        }
    }
}