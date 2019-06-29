package Car;

import Car.Person;

public class Vehicle  {

    // stany
    public final int BROKEN = 0, STOPPED = 1, MOVING = 2;
    private final String[] states =  { "ZEPSUTY", "STOI", "JEDZIE" };

    private int width, height, length, weight;
    private Person owner;
    private int state;

    public Vehicle(Person p, int w, int h, int l, int ww)  {  // konstruktor
        owner = p;      width = w;     height = h;
        length = l;     weight = ww;   state = STOPPED;
    }

    public void start()  {     setState(MOVING);  }

    public void stop()   {     setState(STOPPED);  }

    // Prywatna metoda robocza wykorzystywana w metodach start() i stop().
    // Arbitralne ustalenie stanu spoza klasy nie jest możliwe
    private void setState(int newState)  {
        if (state == newState || state == BROKEN)
            System.out.println("Nie jest mozliwe przejscie ze stanu " +
                    states[state] + " do stanu " + states[newState]);
        else state = newState;
    }

    public void repair()  {
        if (state != BROKEN)
            System.out.println("Pojazd sprawny");
        else state = STOPPED;
    }

    // Sprzedaż pojazdu
    public void sellTo(Person p)  {
        owner = p;
    }

    public String toString()  {
        return "Pojazd, właścicielem którego jest "
                + owner.getName() + " - " + states[state];
    }

    public int getState() {
        return state;
    }
}