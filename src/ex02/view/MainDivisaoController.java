package ex02.view;

import ex02.controller.DivisaoController;

public class MainDivisaoController {

	public static void main(String[] args) {
		
		DivisaoController div = new DivisaoController();
		int dividendo =37;
		int divisor = 6;
		
		int divisao = div.dividir(dividendo, divisor);
		
		System.out.println(divisao);
	}

}
