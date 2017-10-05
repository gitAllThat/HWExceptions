class SomeClass {
	private String password = "abc123";
	public SomeClass(String pw) throws Exception
	{
		if (pw.equals(password))
		{
			System.out.println("SUCCESS");
		}
		else
		{
			throw new Exception("Wrong Password");
		}
	}
 
 public static void main(String[]args) { 
	try{
		SomeClass testClass = new SomeClass("I don't know the password");
	}
	catch (Exception e){
		System.out.println("WRONG PASSWORD TO INSTANTIATE SOMECLASS");
	}
 }
}