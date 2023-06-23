
public class Main {
    public static void main(String[] args) {
        News.subscribe(new Subscriber("Adil Mir"));
        News.subscribe(new Subscriber("Ayub Ahmad"));
        News.subscribe(new Subscriber("Talha Munir"));
        News news = new News("Hum Adil mir ko Devsinc join krnay pe MubarikmBaad paish krtay hain");
    }
}