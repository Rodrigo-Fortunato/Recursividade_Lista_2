package Ex01.view;

import Ex01.controller.DivisaoController;

public class Principal {
	public static void main(String[] args) {
		DivisaoController dc = new DivisaoController();
		int dividendo = 0;
		int divisor = 0;
		int div = dc.div(dividendo, divisor);
		System.out.println(div);
	}
}