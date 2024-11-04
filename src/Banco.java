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

        //Atributo numcont get/set
        public int getNumcont() {
            return numcont;
        }

        public void setnumcont(int n) {
            this.numcont = n;
        }

        //Atributo tipo get/set
        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        //Atributo dono get/set
        public String getDono() {
            return this.dono;
        }

        public void setDono(String d) {
            this.dono = d;
        }

        //Atributo saldo get/set
        public float getSaldo() {
            return this.saldo;
        }

        public void setNumcont(int n) {
            this.numcont = n;
        }

        //Atributo status get/set
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
            this.saldo = 50;
        } else if (this.tipo == "CP" && this.status == true) {
            this.saldo = 150;
        }
    }

    //Metodo Fechar conta
    public void fecharConta() {
        if (this.saldo > 0.0 || this.saldo <= -1) {
            System.out.println("Para fechar sua conta saque seu saldo.");
            this.status = false;
        } else {
            System.out.println("Conta fechada");
        }

    }

    // Metodo Deposito
    public void deposito(int v) {
        if (status == true) {
            this.saldo = v + this.saldo;
            System.out.println("Voce depositou " + v + " !");
        } else {
            System.out.println("Ative o status do seu banco para depositar");
        }
    }

    // Metodo Sacar
    public void sacar(int s) {
        if (s <= this.saldo) {
            this.saldo = this.saldo - s;
            System.out.println("Voce sacou R$" + s);
        } else {
            System.out.println("Voce nao pode sacar R$" + s + "voce nao tem esse valor na sua conta");
        }
    }
        // Metodo pagarMensal
        public void pagarMensal() {
            if(getTipo() == "CC" && this.status == true) {
                this.saldo = this.saldo - 12;
                System.out.println(" Mensalidade paga -12R$ ");
            } else if (getTipo() == "CP" && this.status == true){
                this.saldo = this.saldo - 20;
                System.out.println(" Mensalidade paga -20R$ ");
            }
        }











}

