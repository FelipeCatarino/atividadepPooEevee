package entities;

public class Vaporeon extends Eevee {
	private String tipo;

	public Vaporeon() {

	}

	public Vaporeon(int altura, int hP, double peso) {
		super(altura, hP, peso);
		this.tipo = "Água";
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String ataque() {
		return " Water Gun";
	}

	@Override
	public String defesa() {
		return "Aqua Ring";
	}

	@Override
	public String especial() {
		return " Ice Beam";
	}

	@Override
	public String toString() {

		return "Oi eu sou Vaporeon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
				+ super.getPeso();
	}
}
