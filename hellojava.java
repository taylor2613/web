package org.opentutorials.javatutorilas.eclipse;

public class hellojava {

	public static void main(String[] args) {
		int a;
		a=1;
		System.out.println(a+1); // a��� ������ int������ �����ϰ� 1�� ���� �� 1�� ����
		
		a=2;
		System.out.println(a+1); //a ������ 2�� �����ϰ� 1�� ����
		
		double b;
		
		b=1.1;
		System.out.println(b+1.1);  //b��� ������ �Ǽ��� Ÿ������ ����
		
		String first = "coding";
		System.out.println(first+" "+"everybody");
		
		String one,two;
		
		one = "coding";
		two="good";
		System.out.println(one+" "+two);
	
		double val = 1234.123;
		val++;
		System.out.println(val);
		
		
		//���ǹ�
		String id = args[0];
		if(id.equals("hyoseok")) {
			System.out.println("right");
			
		}else {
			System.out.println("wrong");
		}
	}
}
