

// method overrriding
public class Fruits {
    void colour()
    {
        System.out.println("colour");
    }

    void colour(String x)
    {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Fruits x = new Fruits();
        Fruits y = new Apple();
        Fruits z = new Banana();
        x.colour();
        y.colour();
        z.colour();
        // overiding
        x.colour("PINK");
        //overloading
    }   
}
class Apple extends Fruits{

    void colour()
    {
        System.out.println("i am red");
    }

}

class Banana extends Fruits {
    void colour()
    {
        System.out.println("i am yellow");
    }

}




