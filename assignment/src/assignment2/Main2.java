package assignment2;
import assignment.*;
public class Main2 extends assignment.Main1 {

	public static void main(String[] args) {
		assignment.Main1 A=new Main1();
		System.out.println("this is default"+A.a);
		System.out.println("this is public"+A.b);
		System.out.println("this is private"+A.c);
		System.out.println("this is protected"+A.d);
	}
}
