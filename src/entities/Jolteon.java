package entities;

public class Jolteon extends Eevee {

	private String tipo;
	
	public Jolteon() {

	}

	public Jolteon(int altura, int hP, double peso) {
		super(altura, hP, peso);
		this.tipo = "Dark";
	}
	
	

	public String getTipo() {
		return tipo;
	}

	@Override
	public String ataque() {
		return "Trovoada - Thunder-Shock";
	}

	@Override
	public String defesa() {
		return "Carga - Wild Charge";
	}

	@Override
	public String especial() {
		return "Raio - Thunder";
	}

	@Override
	public String toString() {
		
		return "Oi eu sou Joelton tipo=" + tipo + ", altura=" + super.getAltura()+ ", HP=" + super.getHP() + ", peso=" + super.getPeso();
	}
	
	
}