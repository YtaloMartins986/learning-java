public class Banco {
    public int numcont;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Estado do objeto
    void estado() {
            System.out.println("Numero da conta: " + this.getNumcont());
            System.out.println("Tipo de conta: " + this.getTipo());
            System.out.println("Usuario da conta: " + this.getDono());
            System.out.println("Seu saldo: " + this.getSaldo());

    }

    //Metodo Construtor contasInic
    public Banco() {
        this.saldo = 0;
        this.status = false;
    }

    //Getters e Setters

    public int getNumcont() {
        return numcont;
    }
    public void setNumcont(int n) {
        this.numcont = n;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }

    //Metodos

    //Metodo tipo de conta
    public void abrirConta() {
        if (this.tipo == "CC" && this.status == true) {
            this.setSaldo(50);
        } else if (this.tipo == "CP" && this.status == true) {
            this.setSaldo(150);
        }
    }

    //Metodo Fechar conta
    public void fecharConta() {
        if (this.saldo > 0.0) {
            System.out.println("Para fechar sua conta saque seu saldo.");
        } else {
            System.out.println("Conta fechada");
            this.setStatus(false);
        }

    }

    // Metodo Deposito
    public void deposito(int v) {
        if (this.status == true) {
            this.setSaldo(this.saldo + v);
            System.out.println("Voce depositou " + v + " !");
        } else {
            System.out.println("Ative o status do seu banco para depositar");
        }
    }

    // Metodo Sacar
    int valorerro;
    public void sacar(int s) {
        if (s <= getSaldo()) {
           this.setSaldo(this.saldo - s);
            System.out.println("Voce sacou R$" + s);
        }  else {
            this.valorerro = s;
        }

    }

    //Metodo saqueerro
    public void saqueErro() {
        if(this.valorerro > getSaldo()) {
            System.out.println("Voce nao tem esse valor de R$" + this.valorerro );
        }

    }

    // Metodo pagarMensal
    public void pagarMensal() {
        if(getTipo() == "CC" && this.status == true) {
            this.setSaldo(this.saldo - 12);
            System.out.println(" Mensalidade paga -12R$ ");
        } else if (getTipo() == "CP" && this.status == true){
            this.setSaldo(this.saldo - 20);
            System.out.println(" Mensalidade paga -20R$ ");
        }
    }

}

