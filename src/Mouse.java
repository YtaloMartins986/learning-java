public class Mouse {
    String modelo;
    String cor;
    int dpi;
    int carga;
    boolean ligado;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Dpi: " + this.dpi);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta ligado?: " + this.ligado);

    }

    void funcionando(){
      this.ligado = true;
    }

    void desligado() {
        this.ligado = false;
    }

    void movimentar() {
        if (this.carga <= 5 && this.ligado == true) {
            System.out.println("O mouse esta descarregando, por favor coloque ele para carregar.");
        }
        else if (this.ligado == true) {
            System.out.println("Luz verde, seu mouse esta funcionando!");
        } else {
            System.out.println("A luz esta desligada! (ligue o mouse)");
        }
    }






}
