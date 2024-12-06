package application;

import entities.Eevee;
import entities.Jolteon;

public class Pokedex {

	public static void main(String[] args) throws Exception {
		Eevee e = new Eevee();
		Jolteon j = new Jolteon();

		System.out.println("Eu sou: Eevee");
		System.out.println("Ataque: " + e.ataque());
		System.out.println("Defesa: " + e.defesa());
		System.out.println("Especial: " + e.especial());

		System.out.println("");

		System.out.println("Eu sou: Jolteon");
		System.out.println("Ataque: " + j.ataque());
		System.out.println("Defesa: " + j.defesa());
		System.out.println("Especial: " + j.especial());

		e = j;

		System.out.println("Ataque: " + e.ataque());
		System.out.println("Defesa: " + e.defesa());
		System.out.println("Especial: " + e.especial());
	}

}
