// static or non-static

// static means always fully excisible in the class
// non-static it is personal

class c
{

}


class B
{

    static int a = 1;

    static void isha()
    {
            a = 1;
    }

   static void janhvi()
    {
            a = 0;
    }


    public static void main(String[] args) {
        janhvi();
        isha();
      }

    }
 
    
