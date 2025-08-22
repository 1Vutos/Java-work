//Classe base
public abstract class Figura {
    protected String cor;
    protected int tamanho;

    public Figura(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public abstract void desenhar();
}
