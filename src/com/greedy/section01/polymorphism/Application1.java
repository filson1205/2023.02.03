package com.greedy.section01.polymorphism;

public class Application1 {

	public static void main(String[] args) {
		
		/* ������ */
		System.out.println("Animal ���� --------------");
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
		
		System.out.println("Rabbit ���� ---------------");
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		rabbit.jump();
		
		System.out.println("Tiger ���� ----------------");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		tiger.bite();
		
		/* Rabbit�� Tiger�� Animal Ŭ������ ��ӹ޾Ҵ�.
		 * ���� Rabbit�� Rabbit Ÿ���̱⵵ �ϸ鼭 Animal Ÿ���̱⵵ �ϸ�
		 * Tiger�� Tiger Ÿ���̸鼭 Animal Ÿ���̱⵵ �ϴ�.
		 * */
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
		/* Animal�� Animal���� Tiger�� Rabbit�� �ƴϴ�. */
//		Rabbit r = new Animal();
//		Tiger t = new Animal();
		
		System.out.println("�������ε� -----------------");
		a1.cry();
		a2.cry();
		
//		a1.jump();
//		a2.bite();
		
		System.out.println("Ŭ����Ÿ�� ����ȯ -------------");
		((Rabbit) a1).jump();
		((Tiger) a2).bite();
		
		/* Ÿ�� ����ȯ�� �߸� �ϴ� ��� ������ �ÿ��� �������� ������ ��Ÿ�� �� ClassCastException �߻��� */
//		((Tiger) a1).bite();
		
		System.out.println("instanceof Ȯ�� -------------");
		System.out.println("a1�� Tiger Ÿ������ Ȯ�� : " + (a1 instanceof Tiger));
		System.out.println("a1�� Rabbit Ÿ������ Ȯ�� : " + (a1 instanceof Rabbit));
		System.out.println("a1�� Animal Ÿ������ Ȯ�� : " + (a1 instanceof Animal));
		System.out.println("a1�� Object Ÿ������ Ȯ�� : " + (a1 instanceof Object));
		
		if(a1 instanceof Rabbit) {
			((Rabbit) a1).jump();
		}
		
		if(a1 instanceof Tiger) {
			((Tiger) a1).bite();
		}
		
		/* Ŭ���� ����ȯ�� up-casting�� down-casting���� ������ �� �ִ�. 
		 * up-casting : ���� Ÿ�� ����ȯ (������ ����ȯ)
		 * down-casting : ���� Ÿ������ ����ȯ (����� ����ȯ)
		 * */
		Animal animal1 = (Animal) new Rabbit();
		Animal animal2 = new Rabbit();
		
		Rabbit rabbit1 = (Rabbit) animal1;
//		Rabbit rabbit2 = animal2;
	}

}










