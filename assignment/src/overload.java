
public class overload {
int add(int a, int b){
	return a+b;
}

int add(int a,int b,int c){
	return a+b+c;
}
public static void main(String[] args) {
overload obj1 = new overload();
System.out.println(obj1.add(10,20));
System.out.println(obj1.add(10,20,30));

}
}
