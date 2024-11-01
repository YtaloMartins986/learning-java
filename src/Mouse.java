public class Mouse {
    private String modelo;
    private String cor;
    private int dpi;
    private int carga;
    private boolean ligado;

    void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Dpi: " + this.getDpi());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Esta ligado?: " + this.ligado);

    }

    //metodo ligado

    public void funcionando(){
      this.ligado = true;
    }

    //metodo desligado

    public void desligado() {
        this.ligado = false;
    }

    //metodo movimento

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

    //Modelo get/set

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    //Cor get/set

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    //Dpi get/set

    public int getDpi(){
        return this.dpi;
    }
    public void setDpi(int d){
        this.dpi = d;
    }

    //Carga get/set

    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int c){
        this.carga = c;
    }


}
