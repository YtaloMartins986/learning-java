import java.util.Scanner;

public class SomaDeValoresUsandoFuncao {
    static void soma (int a,int b){
        int s = a + b;
        System.out.println("a soma e "+s);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int v1 = teclado.nextInt();
        System.out.println("Digite o segundo numero");
        int v2 = teclado.nextInt();
        soma(v1,v2);

    }
}
