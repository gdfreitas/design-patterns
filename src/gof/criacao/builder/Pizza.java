package gof.criacao.builder;

/**
 * @author gabriel.freitas
 */
@SuppressWarnings("all")
public class Pizza {

    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean calabresa;

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.queijo = builder.queijo;
        this.tomate = builder.tomate;
        this.calabresa = builder.calabresa;
    }

    public static class Builder {

        // requerido
        private final int tamanho;

        // opcional
        private boolean queijo;
        private boolean tomate;
        private boolean calabresa;

        public Builder(final int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo(boolean queijo) {
            this.queijo = queijo;
            return this;
        }

        public Builder tomate(boolean tomate) {
            this.tomate = tomate;
            return this;
        }

        public Builder calabresa(boolean calabresa) {
            this.calabresa = calabresa;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamanho=" + tamanho +
                ", queijo=" + queijo +
                ", tomate=" + tomate +
                ", calabresa=" + calabresa +
                '}';
    }
}
