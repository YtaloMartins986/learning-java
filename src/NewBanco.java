public class NewBanco {
    public static void main(String[] args) {

    Banco bc = new Banco();
    bc.setNumcont(123456789);
    bc.setTipo("CP");
    bc.setDono("Ytalo");
    bc.setStatus(false);
    bc.abrirConta();
    System.out.println("          RECIBOS          ");
    System.out.println("--------------------------");
    bc.deposito(120);
    //bc.sacar(250);
    bc.pagarMensal();
    System.out.println("--------------------------");
    System.out.println(" ");
    System.out.println("         AVISOS!          ");
    System.out.println("--------------------------");
    bc.fecharConta();
    System.out.println("--------------------------");
    System.out.println(" ");
    bc.estado();

    }

}
