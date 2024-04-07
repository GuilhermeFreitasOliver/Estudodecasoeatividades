public class Questao1d {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargaHoraria;
    private double salario;
    private String descricaoDisciplinas;

    public Questao1d(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricaoDisciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void alterarDescricaoDisciplinas(String descricaoDisciplinas) {
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Formação: " + this.formacao);
        System.out.println("Carga Horária: " + this.cargaHoraria);
        System.out.println("Salário: " + this.salario);
        System.out.println("Descrição das Disciplinas: " + this.descricaoDisciplinas);
    }
    public static class ProgramaProfessor {
        public static void main(String[] args) {
            Questao1d professor1 = new Questao1d("João", "Doutor", "Matemática", 40, 5000.0, "Matemática e Estatística");
            Questao1d professor2 = new Questao1d("Maria", "Mestre", "Física", 30, 4000.0, "Física e Química");
    
            professor1.imprimirDados();
            professor2.imprimirDados();
    
            professor1.alterar("João", "Doutor", "Matemática", 40, 5500.0, "Matemática e Estatística");
            professor1.imprimirDados();
        }
    }
}
