package Observer;

//Wrapping the food
public class Type2Observer implements Observer{


    @Override
    public void notifyObserver(String news) {
        System.out.println("Wrap the foods using the news : " + news);

    }
}
