package ex02.view;

import ex02.controller.Ex02_Controller;

public class Ex02_View {

	public static void main(String[] args) {
		Ex02_Controller div = new Ex02_Controller();

		int dividendo =37;
		int divisor = 6;
		
		int divisao = div.dividir(dividendo, divisor);
		System.out.println(divisao);
	}

}
