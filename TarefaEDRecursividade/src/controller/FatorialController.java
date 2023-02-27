package controller;

public class FatorialController {
	public FatorialController() {}
	
	public int fatorial(int n) {
		// Condicao de Parada --> Quando n for igual a 0, pois 0! = 1
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n - 1);
			/*
			 5! = 5 * 4!
			 4! = 4 * 3!
			 3! = 3 * 2!
			 2! = 2 * 1!
			 1! = 1 * 0!
			 0! = 1
			*/
		}
	}
}

