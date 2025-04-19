public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada = true;
        System.out.println("TV ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("TV desligada");
    }

    public void checarStatus(){
        if (ligada == true){
            System.out.println("A TV está ligada.");
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    public void aumentarVolume(){
        volume ++;
        System.out.printf("Volume: %d\n", volume);
    }

    public void abaixarVolume(){
        volume --;
        System.out.printf("Volume: %d\n", volume);
    }
    
    public void passarCanal(){
        canal ++;
        System.out.printf("Canal: %d\n", canal);
    }

    public void voltarCanal(){
        canal --;
        System.out.printf("Canal: %d\n", canal);
    }

    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }

}