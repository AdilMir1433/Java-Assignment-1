import Interface.INewsInterface;

import java.util.ArrayList;

public class News {
    private static ArrayList<INewsInterface> subscribers = new ArrayList<>();
    private String news;

    public News(String news) {
        this.news = news;

        if(News.subscribers!=null && !News.subscribers.isEmpty()) {
            for (INewsInterface sub : News.subscribers) {
                sub.newsUpdate(this.news);
            }
        }
        else {
            System.out.println("No one to send this news");
        }
    }

    public static void subscribe(Subscriber subscriber) {
        News.subscribers.add(subscriber);
    }
    public void setNews(String news) {
        this.news = news;
    }
    public int subscriberCount() {
        return subscribers.size();
    }
}
