package com.greedy.section01.polymorphism;

public class Tiger extends Animal {
	
	@Override
	public void eat() {
		System.out.println("ȣ���̰� ��⸦ ���Խ��ϴ�.");
	}
	
	@Override
	public void run() {
		System.out.println("ȣ���̴� �ظ��ؼ��� �޸��� �ʽ��ϴ�. ���~ ��� �ɾ�ϴ�.");
	}
	
	@Override
	public void cry() {
		System.out.println("ȣ���̰� ���¢���ϴ�. ������������!~~~");
	}
	
	public void bite() {
		System.out.println("ȣ���̰� �������ϴ�. ��~");
	}
}
