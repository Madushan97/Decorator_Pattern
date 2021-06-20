package Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your preference News?");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //publisher-> subject
        //subscriber-> observer
        //type of observers-> NewsReader, FoodWrapper

//        creating observer object
        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type2Observer();


        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
//        subject.subscribe(observer3);

        subject.notifyObservers("Curfew will be imposed today!");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("==================================================");

        subject.notifyObservers("Curfew will not be imposed today!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        subject.unsubscribe(observer2);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("==================================================");

        subject.notifyObservers("Fuel Prices gone up!");

//        create a folder call news
//        whenever

    }
}
