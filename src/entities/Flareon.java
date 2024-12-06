package entities;

public class Flareon extends Eevee {
    private String tipo;

    public Flareon() {
    }

    public Flareon(int altura, int hP, double peso) {
        super(altura, hP, peso);
        this.tipo = "Fogo";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String ataque() {
        return "Ember";
    }

    @Override
    public String defesa() {
        return "Quick Attack";
    }

    @Override
    public String especial() {
        return "Heat Wave";
    }

    @Override
    public String toString() {
        return "Oi eu sou Flareon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
                + super.getPeso();
    }
}
