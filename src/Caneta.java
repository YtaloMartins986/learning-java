public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta: " + this.getCor());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Esta tampada?: " + this.tampada);
        System.out.println("Ponta: " + this.getPonta());
    }

    //Modo rabiscar

    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! a caneta esta tampada");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    //Tampar/Destampar

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    //Letras do modelo Protegids

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    //Valor de ponta Protegida

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    //Valor da carga protegido

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int c) {
        this.carga = c;
    }

    //Letras de cor protegidas

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

}
