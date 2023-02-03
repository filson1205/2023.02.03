package com.greedy.section03.interfaceimplements;

/* �������̽����� �������̽��� ��ӹ��� �� extends�� ����ϸ� ���� ����� �����ϴ�. */
public interface InterProduct extends SmartPhone, java.io.Serializable {
	
	/* �������̽��� �����ڸ� ���� �� ����. */
//	public InterProduct() {}
	
	/* �������̽��� ��� �ʵ常 ��� �����ϴ�.
	 * public static final ������ ������ ����ʵ��� �θ���.
	 * �ݵ�� ����� ���ÿ� �ʱ�ȭ �ؾ� �Ѵ�.
	 * */
	public static final int MAX_NUM = 100;
	
	/* ��� �ʵ常�� ���� �� �ֱ� ������ ��� �ʵ�� ���������� public static final�� �ǹ̸� ������. */
	int MIN_NUM = 10;
	
	/* �������̽��� �����ΰ� �ִ� non-static �޼ҵ带 ���� �� ����. */
//	public void nonStaticMethod() {}
	
	/* ������ static �޼ҵ�� �ۼ��� �����ϴ�. (JDK 1.8 ���� �߰��� ���) */
	public static void staticMethod() {
		System.out.println("InterProduct�� staticMethod ȣ���...");
	}
	
	/* �߻� �޼ҵ常 ���� �� �ִ�. */
	public abstract void nonStaticMethod();
	
	/* �������̽� ���ο� �ۼ��� �޼ҵ�� ���������� public abstract�� �ǹ̸� ������.
	 * �ٸ� ���������� ����� �Ұ����ϴ�.
	 * �������̽��� �޼ҵ带 �������̵� �ϴ� ���
	 * �ݵ�� ���������ڸ� public���� �ؾ� �������̵��� �����ϴ�.
	 * */
	void abstMethod();
	
	/* default Ű���带 ����ϸ� non-static �޼ҵ嵵 �ۼ� �����ϴ� (JDK 1.8 ���� �߰��� ���) */
	public default void defaultMethod() {
		System.out.println("InterProduct�� defaultMethod ȣ���...");
	}
}







