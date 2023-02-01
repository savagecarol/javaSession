public class Car {
    
    double currSpped;
    double maxSpeed;
    double acceleration;

    Car() // default
    {
        this.currSpped = 0;
        this.acceleration = 10;
        this.maxSpeed = 200;
    }

    Car(double maxSpeed) // paramterized
    {
        this.currSpped = 0;
        this.acceleration = 10;
        this.maxSpeed = maxSpeed; 
    }

    Car(Car x) // copy constructor
    {
        this.currSpped = x.currSpped;
        this.acceleration = x.acceleration;
        this.maxSpeed = x.maxSpeed; 
    }

    double getSpeed()
    {
        return this.currSpped;
    }

    void doAccelerate()
    {
         this.currSpped = this.currSpped + this.acceleration;
    }
    


    public static void main(String[] args) {
        Car isha = new Car(); // default
        Car kartik = new Car(400); // paramterized
        Car janhvi= new Car(kartik); // copy
        
        System.out.println(isha.currSpped);
        System.out.println(isha.acceleration);
        System.out.println(isha.maxSpeed);
        isha.doAccelerate();
        System.out.println(isha.getSpeed());

     
        System.out.println("#################################");

        
        System.out.println(janhvi.currSpped);
        System.out.println(janhvi.acceleration);
        System.out.println(janhvi.maxSpeed);
        janhvi.doAccelerate();
        System.out.println(janhvi.getSpeed());


        System.out.println("#################################");

        
        System.out.println(kartik.currSpped);
        System.out.println(kartik.acceleration);
        System.out.println(kartik.maxSpeed);
        kartik.doAccelerate();
        System.out.println(kartik.getSpeed());
        

    }
}



