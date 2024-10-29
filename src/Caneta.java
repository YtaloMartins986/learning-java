public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada?: " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! a caneta esta tampada");
        } else {
            System.out.println("Estou rabiscando");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }


}
