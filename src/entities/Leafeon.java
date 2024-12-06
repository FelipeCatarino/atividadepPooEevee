package entities;

public class Leafeon extends Eevee{
	private String tipo;

	public Leafeon() {

	}

	public Leafeon(int altura, int hP, double peso) {
		super(altura, hP, peso);
		this.tipo = "Grama";
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String ataque() {
		return "Razor Leaf";
	}

	@Override
	public String defesa() {
		return " Vine Whip";
	}

	@Override
	public String especial() {
		return "Energy Ball";
	}

	@Override
	public String toString() {

		return "Oi eu sou Leafeon tipo=" + tipo + ", altura=" + super.getAltura() + ", HP=" + super.getHP() + ", peso="
				+ super.getPeso();
}}
