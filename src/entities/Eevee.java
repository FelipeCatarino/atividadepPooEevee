package entities;

public class Eevee {

    private String tipo;
    private int altura, HP;
    private double peso;
    
    public Eevee() {
    	
    }
    
    public Eevee(String tipo, int altura, int hP, double peso) {
		this.tipo = tipo;
		this.altura = altura;
		HP = hP;
		this.peso = peso;
	}
    public Eevee(int altura, int hP, double peso) {
    	this.altura = altura;
    	HP = hP;
    	this.peso = peso;
    }

    
	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public int getHP() {
		return HP;
	}



	public void setHP(int hP) {
		HP = hP;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String ataque() {
        return "Ataque rápido";
    }

    public String defesa() {
        return "Desvio";
    }

    public String especial() {
        return "Tri-ataque";
    }

	@Override
	public String toString() {
		return "Oi eu sou Eevee tipo=" + tipo + ", altura=" + altura + ", HP=" + HP + ", peso=" + peso;
	}
    
    
	
}
