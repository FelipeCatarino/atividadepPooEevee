package entities;

public class Glaceon extends Eevee{
	private String tipo;

	public Glaceon() {

	}

	public Glaceon(int altura, int hP, double peso) {
		super(altura, hP, peso);
		this.tipo = "Ice";
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String ataque() {
		return "Ice Shard";
	}

	@Override
	public String defesa() {
		return "Ice Beam";
	}

	@Override
	public String especial() {
		return "Ice Shard";
	}

	@Override
	public String toString() {

		return "Oi eu sou Glaceon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
				+ super.getPeso();
	}
}
