package org.opentutorials.javatutorilas.eclipse;
class Calculator{
	int left,right;
	static int base=0; 
//보통 변수의 static 키워드는 프로그래밍 시 메모리의 효율보다는 공유하기 위한 용도로 훨씬 더 많이 사용하게 된다.
	int num=0;
	public void setOprands(int left,int right) {
		this.left=left;
		this.right=right;
	}
	public void sum() {
		System.out.println(this.left+this.right+base+num);
	}
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}
}
public class hellocalc {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();
		
		c1.base=10;
		c1.num=10;
		c1.setOprands(10,20);
		c1.sum();
		c1.avg();

	}

}
