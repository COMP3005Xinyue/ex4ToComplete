import java.util.ArrayList;

public class TF1 extends Channel{
    private NewsAgency newsAgency;

    public TF1 (ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            this.newsAgency = (NewsAgency) list.get(i);
            newsAgency.registerObserver(this);
        }
    }
}
