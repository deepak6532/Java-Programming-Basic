import java.util.*;





// class Student{

//     String name;
//     String age;

//    Student()
//    {
//     System.out.println("Default constructor called!");    // default constructor 
//    }
// }

// public class oops2{
//     public static void main(String[] args)
//     {
//         Student st = new Student();
//         st.name = "Deepak";

//         System.out.println("name is "   + st.name);

      
       

//     }
// }



// Parameterzed Constuctor

// class Student{

//     String name;
//     int  age;

//    Student(String n,int a)
//    {
//     this.name  = n;
//     this.age = a;
//     System.out.println("parameterized constructor called");    // parameterized  constructor

//     System.out.println("name is  " + this.name + " age is " + this.age);
//    }
// }

// public class oops2{
//     public static void main(String[] args)
//     {
//         Student st = new Student("Deepu ",20);
        
//         System.out.println("name is "   + st.name);

//     }
// }



// COPY CONSTRUCTOR CALLED!


class Student{

    String name;
    int  age;

   Student(Student st2)
   {
    this.name  = st2.name;
    this.age = st2.age;
    System.out.println("copy constructor called");    // parameterized  constructor

    
   }

   Student()
   {

   }


   public void show()
   {
    System.out.println("name is  " + this.name + " age is " + this.age);
   }
}

public class oops2{
    public static void main(String[] args)
    {
        Student st = new Student();
        st.name= "ankit";
        st.age = 23;

        Student st2  = new Student(st);
        
        st2.show();

    }
}