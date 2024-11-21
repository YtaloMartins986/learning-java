package aula06;

public class ControleRemoto implements Controlador  {
    //Atributos
    private int volume;
    private boolean tocando;
    private boolean ligado;
    //Metodo construtor
    public void Controlador(){
        this.setVolume(50);
        this.setTocando(false);
        this.setLigado(false);
    }
    //Metodoas especiais get/set
    private void setVolume(int v) {
        this.volume = v;
    }
    private int getVolume() {

        return this.volume;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean getLigado() {

        return ligado;
    }

    private void setTocando(boolean t)
    {
        this.tocando = t;
    }
    private boolean getTocando() {

        return tocando;
    }

    //Metodos abstratos
    @Override
    public void ligar() {

        this.setLigado(true);
    }

    @Override
    public void desligar() {

        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()) {
            System.out.println("Esta ligado?: " + this.getLigado());
            System.out.println("Esta tocando?; " + this.getTocando());
            System.out.println("Volume "  + this.getVolume());
            for (int i = 0;i < getVolume(); i+=10){
                System.out.print("|");
            }


        } else {
            System.out.println("Controle desligado, Ligue o controle!");
        }
    }


    @Override
    public void fecharMenu() {
        if (getLigado() && !getTocando()) {
            System.out.println("Fechando o menu...");
        } else if (getTocando()) {
            System.out.println("Seu celular esta tocando!, nao e possivel fechar o menu agora, atenda primeiro.");
        }

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() - 10);
        }
    }

    int valorAnteriorV; // valor do volume antes do mudo
    @Override
    public void ligarMudo() {
        if (this.getLigado()) {
            valorAnteriorV = getVolume();
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()) {
            this.setVolume(valorAnteriorV);

        }
    }

    @Override
    public void play() {
        if(this.getLigado()) {
            System.out.println(" ");
            System.out.println(" PLAY <>, Sua tv esta despausada ");
            System.out.println(" ");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado()) {
            System.out.println(" ");
            System.out.println("PAUSE ||, Sua tv esta pausada aperte o play.");
            System.out.println(" ");
        }
    }
}
