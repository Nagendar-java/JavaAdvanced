package src.com.java.java8;

interface TestInterface
{
	//abstarct method
	public void square(int a);
	
	//default method
	default String show(int a)
	{
		return "10";
		
	}
	
}
public class DefaulMEx  implements TestInterface{

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		
		System.out.println(a*a);
		
	}
	
	public static void main(String[] args) {
		
		DefaulMEx def= new DefaulMEx();
		def.square(4);
		//default method will executed
		def.show(4);
	}

}
