import java.util.Date;

public class Questao1c {
    private String especie;
    private Date dataNascimento;
    private String nome;
    private String numeroRegistro;
    private String localNascimento;

    public Questao1c(String especie, Date dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void cadastrar(String especie, Date dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterar(String especie, Date dataNascimento, String nome, String numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void imprimirInformacoes() {
        System.out.println("Espécie: " + this.especie);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de Registro: " + this.numeroRegistro);
        System.out.println("Local de Nascimento: " + this.localNascimento);
    }
    public static class ProgramaAnimal {
        public static void main(String[] args) {
            Questao1c animal1 = new Questao1c("Leão", new Date(), "Simba", "001", "África");
            Questao1c animal2 = new Questao1c("Tigre", new Date(), "Rajah", "002", "Ásia");
    
            animal1.imprimirInformacoes();
            animal2.imprimirInformacoes();
    
            animal1.alterar("Leão", new Date(), "Mufasa", "001", "África");
            animal1.imprimirInformacoes();
        }
    }
    
}
