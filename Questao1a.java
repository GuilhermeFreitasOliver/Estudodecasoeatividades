public class Questao1a {
    
    private String codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private int numeroPortas;
    private String tipoCombustivel;
    private int quantidadeDisponivel;
    private double preco;
    private boolean isCompleto;

    public Questao1a(String codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, int quantidadeDisponivel, double preco, boolean isCompleto) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.isCompleto = isCompleto;
    }

    public void cadastrar(String codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, int quantidadeDisponivel, double preco, boolean isCompleto) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.isCompleto = isCompleto;
    }

    public void alterar(String codigo, String marca, String cor, String modelo, int anoFabricacao, int numeroPortas, String tipoCombustivel, int quantidadeDisponivel, double preco, boolean isCompleto) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.isCompleto = isCompleto;
    }

    public void listar() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Número de Portas: " + this.numeroPortas);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Quantidade Disponível: " + this.quantidadeDisponivel);
        System.out.println("Preço: " + this.preco);
        System.out.println("É completo? " + (this.isCompleto ? "Sim" : "Não"));
    }

    public class ProgramaCarro {
        public static void main(String[] args) {
            Questao1a carro1 = new Questao1a("001", "Toyota", "Preto", "Corolla", 2020, 4, "Gasolina", 10, 30000.0, true);
            Questao1a carro2 = new Questao1a("002", "Honda", "Branco", "Civic", 2021, 4, "Gasolina", 8, 32000.0, true);
    
            carro1.listar();
            carro2.listar();
    
            carro1.alterar("001", "Toyota", "Azul", "Corolla", 2020, 4, "Gasolina", 9, 29000.0, true);
            carro1.listar();
        }
    }
}
