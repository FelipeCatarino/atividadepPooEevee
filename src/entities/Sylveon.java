package entities;

public class Sylveon extends Eevee {
    private String tipo;

    public Sylveon() {
    }

    public Sylveon(int altura, int hP, double peso) {
        super(altura, hP, peso);
        this.tipo = "Fada";
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String ataque() {
        return "Fairy Wind";
    }

    @Override
    public String defesa() {
        return "Disarming Voice";
    }

    @Override
    public String especial() {
        return "Draining Kiss";
    }

    @Override
    public String toString() {
        return "Oi eu sou Sylveon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
                + super.getPeso();
    }
}