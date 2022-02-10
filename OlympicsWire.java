import java.util.ArrayList;
import java.util.List;

public class OlympicsWire implements Subject {
    private List<Observer> newsAgency = new ArrayList<>();
    private NewsItem news;

    public OlympicsWire() { }

    public void broadcast(NewsItem n) {
        notifyObservers(n);
    }

    @Override
    public void registerObserver(Observer o) {
        this.newsAgency.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.newsAgency.remove(o);
    }

    @Override
    public void notifyObservers(NewsItem n) {
        this.news = n;
        for (Observer newsAgency: this.newsAgency){
            newsAgency.update(n);
        }
    }
}
