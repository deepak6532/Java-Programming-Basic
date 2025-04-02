import java.util.*;




class pen{

    String color = "Blue";
    String  type;

    public void  show()
    {
        System.out.println("This is a pen "  + this.color + "nand type is " + this.type);
    }
}

public class oops1{
    public static void main(String[] args)
    {
        pen obj = new pen();

        obj.type= "gel";
        System.out.println(obj.color);
        obj.show();

        pen obj2 = new pen();

        obj2.color=  "Red";

        // obj2.type= "wall";                 //null

        obj2.show();

    }
}