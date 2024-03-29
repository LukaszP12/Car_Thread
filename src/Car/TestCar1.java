package Car;

import Car.Car;

public class TestCar1 {

    // Symulacja upływu czasu...
    static void delay(int sek) {
        while(sek-- > 0) {
            try {
                Thread.sleep(1000);
            } catch (Exception exc)  { }
        }
    }

    public static void main(String[] args)  {
        Car c = new Car("WA1090", new Person("Janek", "0909090"),
                100, 100, 100, 100, 50);

        c.fill(10);   // napełniamy bak
        c.start();    // ruszamy ...
        System.out.println(c + ""); // co się dzieje z samochodem
        delay(12);    // niech upłynie 12 sek. jazdy od tego momentu
        System.out.println(c + ""); // co się dzieje z samochodem
    }
}
