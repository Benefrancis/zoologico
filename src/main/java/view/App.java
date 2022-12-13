package view;

import model.Animal;
import model.Zebra;

public class App {

	public static void main(String[] args) {

		Animal pocoto = new Zebra();
		
		pocoto.setAlimento("capim");
		pocoto.setNome("Zebrinha Pocotó");
		pocoto.setRuido(" ri ");

		System.out.println(((Zebra) pocoto).falar());
		
		
		int[] numeros = new int[5];
		
		numeros[0] = 1;
		numeros[1] = 1;
		numeros[2] = 1;
		numeros[3] = 1;
		

	}

}
