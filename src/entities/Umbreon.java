package entities;

public class Umbreon extends Eevee {
    private String tipo;

    public Umbreon() {
    }

    public Umbreon(int altura, int hP, double peso) {
        super(altura, hP, peso);
        this.tipo = "Sombrio";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String ataque() {
        return "Snarl";
    }

    @Override
    public String defesa() {
        return "Last Resort";
    }

    @Override
    public String especial() {
        return "Shadow Ball";
    }

    @Override
    public String toString() {
        return "Oi eu sou Umbreon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
                + super.getPeso();
    }
}
