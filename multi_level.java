class A
{
int a,b,c;

void add()
{
a  =10;
b =20;
c = a+b;
System.out.println("sum" + c);
}

void sub()
{
a  =100;
b =20;
c = a-b;
System.out.println("subtraction" + c);
}

}

class B extends A{

void mul()
{
a  =10;
b =20;
c = a*b;
System.out.println("multiply " + c);
}

void div()
{
a  =100;
b =20;
c = a/b;
System.out.println("Division "+ c);
}

}


class c extends B{

void mod()
{
a  =210;
b =20;
c = a%b;
System.out.println("module " + c);
}


}

class multi_level
{
public static void main(String args[])
{
c sc = new c();
sc.add();
sc.sub();
sc.mul();
sc.div();
sc.mod();
}
}


