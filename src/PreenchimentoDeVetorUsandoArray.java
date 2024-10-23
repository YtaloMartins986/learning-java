import java.util.Arrays;
public class PreenchimentoDeVetorUsandoArray {
    public static void main(String[] args) {
        //vetor com 20 espacos
        int[] valores = new int [20];
        //preenchimento de todos os 20 espacos do vetor automatico/eficiente
        Arrays.fill(valores,0);
        //for it, para mostrar todos os valores que estao no vetor
        for (int valor: valores){
            System.out.print(valor+ " ");
        }
    }
}

