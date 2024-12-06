package entities;

public class Espeon extends Eevee {
    private String tipo;

    public Espeon() {
    }

    public Espeon(int altura, int hP, double peso) {
        super(altura, hP, peso);
        this.tipo = "Psíquico";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String ataque() {
        return "Psychic";
    }

    @Override
    public String defesa() {
        return "Confusion";
    }

    @Override
    public String especial() {
        return "Psychic Terrain";
    }

    @Override
    public String toString() {
        return "Oi eu sou Espeon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
                + super.getPeso();
    }
}
