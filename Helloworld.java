abstract class Abstraction
{
	public String name="rocky";
	public int age=20;
	public abstract void study();
}
class Student extends Abstraction
{
	public int passoutyear=2022;
	public void study()
	{
		System.out.println("studying all day long ago");
	}
}
class Helloworld
{
	public static void main(String []args)
	{
		Student obj=new Student();
		
		System.out.println("name: "+obj.name);
		System.out.println("age: "+obj.age);
		System.out.println("Passout:"+obj.passoutyear);
		 
		 obj.study();
	}
}
	