package com.greedy.section02.abstractclass;

public abstract class Product {
	
	private int nonStaticField;
	private static int staticField;
	
	public Product() {
		System.out.println("Product�� �⺻ ������ ȣ���...");
	}
	
	public void printField() {
		System.out.println("nonStaticField : " + nonStaticField);
		System.out.println("staticField : " + staticField);
	}
	
	public static void staticMethod() {
		System.out.println("Product Ŭ������ staticMethod ȣ����...");
	}
	
	/* �߻�޼ҵ� 
	 * ������(��ü)�� ���� �޼ҵ带 �ǹ��Ѵ�.
	 * �߻� �޼ҵ尡 1�� �̻� �����ϴ� ��� class�� abstract Ű���尡 �ʼ��̸�,
	 * �߻� �޼ҵ尡 0�� �� ��� ���������� class�� abstract Ű���� ����� �����ϴ�.
	 * */
	public abstract void abstMethod();
}
