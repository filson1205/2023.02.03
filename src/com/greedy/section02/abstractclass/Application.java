package com.greedy.section02.abstractclass;

public class Application {

	public static void main(String[] args) {
		
		/* �߻�Ŭ������ �����ڴ� ���� �� ������ �ν��Ͻ� ������ ���� ���Ѵ�. */
//		Product product = new Product();
		
		Product smartPhone = new SmartPhone();
		smartPhone.printField();
		Product.staticMethod();
		
		smartPhone.abstMethod();
		
		if(smartPhone instanceof SmartPhone) {
			((SmartPhone) smartPhone).printSmartPhone();			
		}
	}

}
