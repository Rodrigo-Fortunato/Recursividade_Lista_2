package view;

import Ex01.controller.controller.MultiplicaAB;
public class Main {

	public static void main(String[] args) {
		MultiplicaAB multiplica = new MultiplicaAB();
		
		int A = 5;
		int B = 8;
		
		int SomaMult = multiplica.Mult(A, B);
		
		System.out.println(SomaMult);
	}

}
