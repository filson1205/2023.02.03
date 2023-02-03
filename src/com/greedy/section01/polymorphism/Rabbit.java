package com.greedy.section01.polymorphism;

public class Rabbit extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Åä³¢°¡ Ç®À» ¶â¾î ¸Ô°í ÀÖ½À´Ï´Ù.");
	}
	
	@Override
	public void run() {
		System.out.println("Åä³¢°¡ ´Þ·Á°©´Ï´Ù. ±øÃÑ~ ±øÃÑ~");
	}
	
	@Override
	public void cry() {
		System.out.println("Åä³¢°¡ ¿ïÀ½¼Ò¸®¸¦ ³À´Ï´Ù. ³¢ÀÍ~ ³¢ÀÍ~");
	}
	
	public void jump() {
		System.out.println("Åä³¢°¡ Á¡ÇÁÇÕ´Ï´Ù. Á¡ÇÁ!!");
	}
}
