package inner_class_sample;

public class Outer {
	
	private String greeting = "こんにちは";
	
	public class Inner {
		public String hello() {
			return greeting;
		}
	}
}
