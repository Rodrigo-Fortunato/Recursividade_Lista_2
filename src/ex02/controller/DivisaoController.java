package ex02.controller;

public class DivisaoController {
	public DivisaoController() {
		super();
	}

	public int dividir(int dividendo, int divisor) {
		// Condição de parada
		if (dividendo < divisor) {
			return 0;
		} else {
			dividendo = dividendo - divisor;
			return 1 + dividir(dividendo, divisor);
			
		}
	}
}