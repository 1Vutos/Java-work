package figura;

public class ConfiguracaoPadrao implements Cloneable {
    private String cor;
    private int espessura;

    public ConfiguracaoPadrao(String cor, int espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getEspessura() { return espessura; }
    public void setEspessura(int espessura) { this.espessura = espessura; }

    @Override
    public ConfiguracaoPadrao clone() {
        try {
            return (ConfiguracaoPadrao) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar configuração!", e);
        }
    }
}
