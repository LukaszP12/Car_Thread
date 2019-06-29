package Timer;

import Timer.Timer;

public class Timer_Main {


    public static void main(String[] args){
        Timer timer = new Timer();
        Thread thread = new Thread(timer);
        thread.start();
    }

}
