public class Estudodecaso2televisao {
    private int tamanhoTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;
    private boolean ligado;

    public Estudodecaso2televisao(int tamanhoTela, String marca, int voltagem, int canal) {
        this.tamanhoTela = tamanhoTela;
        this.volume = 5; 
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
        this.ligado = false;
    }

    public String getMarca() {
        return this.marca;
    }
    
    
    public void ligar() {
        this.ligado = true;
        int consumo = this.voltagem * this.tamanhoTela;
        System.out.println("Consumo: " + consumo + " watts");
    }

    
    public void desligar() {
        this.ligado = false;
    }

    
    public void aumentarVolume() {
        if (this.ligado && this.volume < 10) {
            this.volume += 1;
        }
    }

    
    public void diminuirVolume() {
        if (this.ligado && this.volume > 1) {
            this.volume -= 1;
        }
    }

    
    public void subirCanal() {
        if (this.ligado) {
            this.canal += 1;
        }
    }

    
    public void descerCanal() {
        if (this.ligado) {
            this.canal -= 1;
        }
    }

    public int getCanal() {
        return this.canal;
    }
    
}
