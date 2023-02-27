package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		int res, num = 5;
		
		FatorialController fc = new FatorialController();
		res = fc.fatorial(num);
		System.out.println("Fatorial de "+ num +" é: "+ res);
	}

}