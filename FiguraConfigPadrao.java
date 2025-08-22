// config padrao de qualquer figura + clone
public class FiguraConfigPadrao implements Cloneable {
    private String cor;
    private int tamanho;

    public FiguraConfigPadrao(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public FiguraConfigPadrao clone() {
        try {
            return (FiguraConfigPadrao) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
