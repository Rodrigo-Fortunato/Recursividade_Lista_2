package ex01.view;

import ex01.controller.Ex01_Controller;
public class Ex01_View {

	public static void main(String[] args) {
		Ex01_Controller multiplica = new Ex01_Controller();
		
		int A = 5;
		int B = 8;
		
		int SomaMult = multiplica.Mult(A, B);
		System.out.println(SomaMult);
	}

}
