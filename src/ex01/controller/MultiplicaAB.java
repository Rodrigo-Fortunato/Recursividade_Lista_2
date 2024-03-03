package ex01.controller;

public class MultiplicaAB {
	public MultiplicaAB() {
		super();
	}
	public int Mult(int A, int B) {
		
		if (B == 1) {
			return A;
		}else {
			
			return A+ Mult(A, B-1);
			
		}
	}
	
	

}
