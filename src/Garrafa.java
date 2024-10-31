public class Garrafa {
    private String modelo;
    private String cor;
    private int ml;
    private boolean tampada;


    //Status Da Garrafa

    public void status(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("ML; " + getMl());
    }

    //Construct Garrafa

    public Garrafa(String m, String c, int l){
        this.setModelo(m);
        this.setCor(c);
        this.setMl(l);
        destampada();
        beberagua();
    }

    //Tapada/Destampada

    public void tampada() {
        this.tampada = true;
    }

    public void destampada() {
        this.tampada = false;
    }


    // Modelo Da Garrafa
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    // Cor Da Garrafa

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    // ML Da Garrafa

    public int getMl(){
        return this.ml;
    }
    public void setMl(int l){
        this.ml = l;
    }

    // Beber agua

    public void beberagua(){
        if(this.tampada == true) {
            System.out.println("Abra sua garrafa, ela esta tampada!");
        } else {
            System.out.println("Beba agua, a sua garrafa esta aberta!");
        }
    }







}
