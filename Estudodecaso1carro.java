public class Estudodecaso1carro {
    private String modelo;
    private int velocidade;
    private int aceleracao;
    private int marcha;
    private boolean ligado;

    public Estudodecaso1carro(String modelo, int velocidade, int aceleracao, int marcha) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void acelerar() {
        if (this.ligado) {
            this.velocidade += this.aceleracao;
        }
    }

    public void desacelerar() {
        if (this.ligado && this.velocidade > 0) {
            this.velocidade -= this.aceleracao;
        }
    }

    public void virarDireita() {
        if (this.ligado) {
            System.out.println(this.modelo + " virou à direita");
        }
    }

    public void virarEsquerda() {
        if (this.ligado) {
            System.out.println(this.modelo + " virou à esquerda");
        }
    }

    public void marchaCima() {
        if (this.ligado) {
            this.marcha += 1;
        }
    }

    public void marchaBaixo() {
        if (this.ligado && this.marcha > 1) {
            this.marcha -= 1;
        }
    }
}
