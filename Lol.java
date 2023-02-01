public class Lol {
    public static void main(String[] args) {
        Janhvi x = new Janhvi();
        x.fanSpeed();

      Isha y = new Isha();
        y.fanSpeed();
    }
    
}


interface funtionsSpecific{
    void fanSpeed();
}

abstract class Hello{
    abstract void yellow();
    void dekho()
    {
        
    }
}


class Isha implements funtionsSpecific{

    @Override
    public void fanSpeed() {
       int fanSpeed = 5;
       fanSpeed--;
    }
}

class Janhvi implements funtionsSpecific{

    @Override
    public void fanSpeed() {
       int fanSpeed = 5;
       fanSpeed++;
    }

}


// private - public - protected

