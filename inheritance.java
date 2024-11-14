class single
{

int roll, mark;
String  name;

void input()
{
System.out.println("Enter the roll number & marks :");
}

}
class inheritance extends single
{

void show()
{
roll = 97;
name = "Deepak";
mark = 77;
System.out.println(roll+ " " + name + " " + mark);
}

public static void main(String args[])
{
inheritance sc=new inheritance();
sc.input();
sc.show();
}
}


