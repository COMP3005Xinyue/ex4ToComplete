import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject,Observer{
    private String name;
    private String country;
    private NewsItem news;
    private OlympicsWire olympicswire;
    private List<Observer> channel = new ArrayList<>();

    public NewsAgency(String n, OlympicsWire o) {
        this.name = n;
        this.olympicswire = o;
        olympicswire.registerObserver(this);
    }

    public void update(NewsItem n){
        notifyObservers(n);
    }

    @Override
    public void registerObserver(Observer o) {
        this.channel.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.channel.remove(o);
    }

    @Override
    public void notifyObservers(NewsItem n) {
        this.news = n;
        this.country = n.country;

        if (name == "Reuters" && country == "France"){
            for (Observer channel: this.channel){
                channel.update(n);
            }
        }

        if (name == "Canadian Press" && country == "Canada"){
            for (Observer channel: this.channel){
                channel.update(n);
            }
        }

        if (name == "American Press" && country == "US"){
            for (Observer channel: this.channel){
                channel.update(n);
            }
        }
    }
}

