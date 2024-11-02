class A
{
	int a;
	String b;
A()
{
a  = 10 ;
b = "Deepak";
System.out.println(a + " " + b);
}

A(A ref)
{
a = ref.a;
b = ref.b;
System.out.println(a + " " + b);
}

	
}

class copy_cons
{

public static void main(String args[])
{
A  obj= new A();

A obj2 = new A(obj);
}
}