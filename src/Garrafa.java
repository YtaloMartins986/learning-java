public class Garrafa {
    private String modelo;
    private String cor;
    private int ml;
    private boolean tampada;

    //Construct Garrafa

    public Garrafa(String m, String c, int l){
        this.modelo = m;
        this.cor = c;
        this.ml = l;
    }

    //Status Da Garrafa

    public void status(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("ML; " + getMl());
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







}
