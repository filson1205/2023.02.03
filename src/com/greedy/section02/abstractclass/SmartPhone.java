package com.greedy.section02.abstractclass;

/* extends Ű����� Ŭ������ ��ӹ��� �� �� �� �̻��� Ŭ������ ������� ���Ѵ�. */
public class SmartPhone extends Product/* , java.util.Scanner */ {
	
	public SmartPhone() {
		super();
		System.out.println("SmartPhone Ŭ������ �⺻������ ȣ���...");
	}
	
	@Override
	public void abstMethod() {
		System.out.println("Product Ŭ������ abstMethod�� �������̵� �� �޼ҵ� ȣ����...");
	}
	
	public void printSmartPhone() {
		System.out.println("SmartPhone Ŭ������ printSmartPhone �޼ҵ� ȣ����...");
	}
}
