public class Mouse {
    public String modelo;
    public String cor;
    private int dpi;
    protected int carga;
    private boolean ligado;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Dpi: " + this.dpi);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta ligado?: " + this.ligado);

    }

    public void funcionando(){
      this.ligado = true;
    }

    public void desligado() {
        this.ligado = false;
    }

    public void movimentar() {
        if (this.carga <= 5 && this.ligado == true) {
            System.out.println("O mouse esta descarregando, por favor coloque ele para carregar.");
        }
        else if (this.ligado == true) {
            System.out.println("Luz verde, seu mouse esta funcionando!");
        } else {
            System.out.println("A luz esta desligada! (ligue o mouse)");
        }
    }

    public void dpimouse() {
        this.dpi = 1200;
    }





}
