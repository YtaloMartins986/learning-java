import java.util.Arrays;

public class VetorParaCada {
public static void main(String[] args){
    double[] x = {3.4,-2.3,5.6};

    //*deixando o vetor em ordem numerica

    Arrays.sort(x);

    // estrutura for para cada

    for (double valor: x){
        System.out.print(valor + " ");

    }


    }
 }

