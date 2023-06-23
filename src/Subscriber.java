import Interface.INewsInterface;

public class Subscriber implements INewsInterface {
    String subName;

    public Subscriber(String subName) {
        this.subName = subName;
    }

    public Subscriber() {
    }

    @Override
    public void newsUpdate(String randomNews) {
        System.out.println(subName + " Here's the news Update : " + randomNews);
    }
}
