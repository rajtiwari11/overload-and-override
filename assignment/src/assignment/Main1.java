package assignment;

public class Main1{

	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
}
  class B{
	 public static void main(String[] args) {
		Main1 A = new Main1();
		System.out.println("this is default"+A.a);
		System.out.println("this is public"+A.b);
		System.out.println("thus is private"+A.c);
		System.out.println("this is protected"+A.d);
		
	}
	 
 }