
public class Methods {

	public static void main(String[] args) {
		
		
		Methods d = new Methods();
		String name = d.getdata();
		System.out.println(name);
		
		MethodsDemo1 d1 =new MethodsDemo1();
		System.out.println(d1.Usergetdata());
		getdata1();
		

	}

	
	public String getdata()
	
	{
		
		System.out.println("Hello world");
		return "vishali";
	}
	
	
public static String getdata1()
	
	{
		
		System.out.println("Hello world2");
		return "vishali sharma";
	}
}
