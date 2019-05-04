package talentech;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverload m=new MethodOverload();
		m.msg();
		m.msg(15, 12f);
		m.msg(20, 12);
			
	}
	void msg() {
		System.out.println("Farhan Yousuf");
		
	}
	void msg(int a,float b) {
		float c=a/b;
		System.out.println(c);
			
	}
	void msg(int a,int b) {
		int c=a/b;
		System.out.println(c);
				
	}
}
