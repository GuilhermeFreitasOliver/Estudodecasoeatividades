public class Questao1b {
    private String nomeCorrentista;
    private String rg;
    private String cpf;
    private double saldo;
    private String numero;
    private String agencia;

    public Questao1b(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void cadastrar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void alterar(String nomeCorrentista, String rg, String cpf, double saldo, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }
    public static class ProgramaContaPoupanca {
        public static void main(String[] args) {
            Questao1b conta1 = new Questao1b("João", "12345678", "111.111.111-11", 1000.0, "0001", "001");
            Questao1b conta2 = new Questao1b("Maria", "87654321", "222.222.222-22", 2000.0, "0002", "002");
    
            conta1.imprimirSaldo();
            conta2.imprimirSaldo();
    
            conta1.alterar("João", "12345678", "111.111.111-11", 1500.0, "0001", "001");
            conta1.imprimirSaldo();
        }
    }
}
