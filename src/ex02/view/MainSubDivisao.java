package ex02.view;

import ex02.controller.SubDivisao;

public class MainSubDivisao {

	public static void main(String[] args) {
		
		SubDivisao div = new SubDivisao();
		int dividendo =37;
		int divisor = 6;
		
		int divisao = div.Dividir(dividendo, divisor);
		
		System.out.println(divisao);
	}

}
