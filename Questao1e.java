import java.util.Date;

public class Questao1e {
    private String nome;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private String endereco;
    private String naturalidade;
    private double salario;
    private String profissao;
    private String grauInstrucao;
    private String matricula;

    public Questao1e(String nome, Date dataNascimento, String rg, String cpf, String endereco, String naturalidade, double salario, String profissao, String grauInstrucao, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void cadastrar(String nome, Date dataNascimento, String rg, String cpf, String endereco, String naturalidade, double salario, String profissao, String grauInstrucao, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void alterar(String nome, Date dataNascimento, String rg, String cpf, String endereco, String naturalidade, double salario, String profissao, String grauInstrucao, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Salário: " + this.salario);
        System.out.println("Profissão: " + this.profissao);
        System.out.println("Grau de Instrução: " + this.grauInstrucao);
        System.out.println("Matrícula: " + this.matricula);
    }
    public static class ProgramaFuncionario {
        public static void main(String[] args) {
            Questao1e funcionario1 = new Questao1e("João", new Date(), "12345678", "111.111.111-11", "Rua 1", "Brasil", 3000.0, "Engenheiro", "Superior", "001");
            Questao1e funcionario2 = new Questao1e("Maria", new Date(), "87654321", "222.222.222-22", "Rua 2", "Brasil", 4000.0, "Médica", "Superior", "002");
    
            funcionario1.imprimirDados();
            funcionario2.imprimirDados();
    
            funcionario1.alterar("João", new Date(), "12345678", "111.111.111-11", "Rua 1", "Brasil", 3500.0, "Engenheiro", "Superior", "001");
            funcionario1.imprimirDados();
        }
    }
}

