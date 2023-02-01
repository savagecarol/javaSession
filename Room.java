class Room {


    // by default ---> public functions
    public void a()
    {
        System.out.println("A");
    }

    // locally use in a class
    private void b()
    {
        System.out.println("b");
    }

    protected void c()
    {
        System.out.println("c");
    }

    public static void main(String[] args) {
        Room r = new Room();
        r.a();
        r.b();
        r.c();


        Room2 r2 = new Room2();
        r2.a();
        // r2.b(); // error because b is private and can only use in Room2
        r2.c(); 
    }
}


class Room2 {
    final int p = 2;

    static void fun()
    {

        System.out.println("fun");
    }


    // by default ---> public functions
    public void a()
    {
        System.out.println("A");
    }

    // locally use in a class
    private void b()
    {
        System.out.println("b");
    }

    protected void c()
    {
        System.out.println("c");
    }

}

// static non-static 
// final ---> change
// inheritance (extends ) --- implements 
// interface - abstract class
// overloading and overriding
// public private protected
// constructors
// this


