import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando valores (autoboxing de int para Integer)
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando elementos
        System.out.println("Primeiro número: " + numeros.get(0)); // 10

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + numeros.size()); // 3

        // Percorrendo a lista
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        // Removendo um elemento
        numeros.remove(1); // remove o valor na posição 1 (20)

        System.out.println("Lista após remoção: " + numeros); // [10, 30]
    }
}        

