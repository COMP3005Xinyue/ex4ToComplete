import java.util.ArrayList;

public class CBS extends Channel{
    private NewsAgency newsAgency;

    public CBS (ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            this.newsAgency = (NewsAgency) list.get(i);
            newsAgency.registerObserver(this);
        }
    }
}
