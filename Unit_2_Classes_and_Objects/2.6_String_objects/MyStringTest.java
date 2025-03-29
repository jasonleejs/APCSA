class MyString {
	String value;
	
	public MyString(String s) {
		this.value = s;
	}
	
	public String concat_v1(String s) {
		return (this.value + s);
	}

}

public class MyStringTest {
	public static void main(String args[]) {
		MyString hello = new MyString("hello");

		// System.out.println(hello.concat_v1("world")); // expected:"helloworld"
	
		String s1 = new String("abc");
		s1.concat("def");
		System.out.println(s1); // abcdef
	}
}
