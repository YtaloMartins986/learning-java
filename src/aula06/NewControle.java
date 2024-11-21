package aula06;

public class NewControle {
    public static void main(String[] args) {

        ControleRemoto c1 = new ControleRemoto();
        c1.Controlador();
        c1.ligar();
        //c1.desligar();
        c1.maisVolume();
        //c1.menosVolume();
        c1.ligarMudo();
        c1.desligarMudo();
        c1.abrirMenu();
        System.out.println(" ");
        c1.pause();
        //c1.play();
        c1.fecharMenu();























    }
}
