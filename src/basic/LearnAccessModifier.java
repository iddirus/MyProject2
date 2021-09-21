package basic;

public class LearnAccessModifier {
	
	// Access modifier/ specifier
	
	// types
	
	// public: we can call or use from all the classes where it is located even from a class outside of the package 
	// private: we can call or use variable/method from only the class where it is located 
	// protected: use or call within the class where it is located 
	// default
	
	public static int age =45;
	private static String name="Iddir";
	protected static int number=78;
	static int price=50;
	
	
	
	
	public static void main(String[] args) {
		
		
		
		// LearnDataType.homeAddess;
		
		System.out.println(LearnDataType.homeAddess);
		
		System.out.println(LearnAccessModifier.age);
		System.out.println(LearnAccessModifier.name);
		
		// System.out.println(LearnDataType);
		
		System.out.println(LearnAccessModifier.number);
		System.out.println(LearnDataType.studentName);
		
		
	}
	
	
	
	
	
	

}
