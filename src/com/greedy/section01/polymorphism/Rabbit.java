package com.greedy.section01.polymorphism;

public class Rabbit extends Animal {
	
	@Override
	public void eat() {
		System.out.println("�䳢�� Ǯ�� ��� �԰� �ֽ��ϴ�.");
	}
	
	@Override
	public void run() {
		System.out.println("�䳢�� �޷����ϴ�. ����~ ����~");
	}
	
	@Override
	public void cry() {
		System.out.println("�䳢�� �����Ҹ��� ���ϴ�. ����~ ����~");
	}
	
	public void jump() {
		System.out.println("�䳢�� �����մϴ�. ����!!");
	}
}
