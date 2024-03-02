package Ex01.view;

import Ex01.controller.SubDivisao;

public class MainSubDivisao {

	public static void main(String[] args) {
		
		SubDivisao div = new SubDivisao();
		int dividendo =37;
		int divisor = 6;
		
		int divisao = div.Dividir(dividendo, divisor);
		
		System.out.println(divisao);
	}

}
