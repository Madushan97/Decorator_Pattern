package Observer;

import java.util.Scanner;


//reading the news
public class Type1Observer implements Observer{

//accept the email

    String email;

    @Override
    public void notifyObserver(String news) {
        System.out.println("Reading the news" + news);

    }
}
