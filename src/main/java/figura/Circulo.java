package figura;

public class Circulo implements Figura {
    private ConfiguracaoPadrao config;

    public Circulo(ConfiguracaoPadrao config) {
        this.config = config;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando círculo na cor " + config.getCor() +
                           " com espessura " + config.getEspessura());
    }

    @Override
    public Figura clone() {
        return new Circulo(config.clone());
    }
}
