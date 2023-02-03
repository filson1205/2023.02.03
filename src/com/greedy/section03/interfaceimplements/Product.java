package com.greedy.section03.interfaceimplements;

/* Ŭ�������� �������̽� ��� �� implements Ű���� ��� �����ϴ�. */
public class Product extends java.lang.Object implements InterProduct, SmartPhone {

	@Override
	public void nonStaticMethod() {
		System.out.println("InterProduct�� nonStaticMethod �������̵��� �޼ҵ� ȣ���...");
	}

	@Override
	public void abstMethod() {
		System.out.println("InterProduct�� abstMethod �������̵��� �޼ҵ� ȣ���...");
	}
	
	/* default Ű���带 �����ϸ� defaultMethod�� �������̵� �� �� �ִ�. */
	@Override
	public void defaultMethod() {
		System.out.println("Product Ŭ������ defaultMethod ȣ���...");
	}
	
	/* static �޼ҵ�� �������̵��� �� �� ����. */
//	@Override
//	public static void staticMethod() {}
}
