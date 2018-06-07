public class Test {
	int aa ;
	class B {
		int bb;
	}
	public static void main(String[] args) {
		Test a = new Test();
		a.aa = 1;
		B b = a.new B();
		b.bb = 2;
		System.out.println(a.aa);
		System.out.println(b.bb);
	}
}