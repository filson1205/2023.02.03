package com.greedy.section03.interfaceimplements;

public class Application {

	public static void main(String[] args) {
		
		/* �������̽�(interface) 
		 * �ڹ� Ŭ������ ������ ���������� �߻�޼ҵ�� ��� �ʵ常�� ���� �� �ִ� Ŭ������ ����ü�̴�.
		 * */
		InterProduct.staticMethod();
		
		InterProduct product = new Product();
		product.nonStaticMethod();
		product.abstMethod();
		product.defaultMethod();
		
	}

}
