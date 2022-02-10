import java.util.ArrayList;

public class PBS implements Observer {
    private NewsAgency newsAgency;

    public PBS (ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            this.newsAgency = (NewsAgency) list.get(i);
            newsAgency.registerObserver(this);
        }
    }

    public void update(NewsItem n) {
        if(n.time != "PM"){
            System.out.println("New Olympic News Item!!" + n.toString());
        }
    }
}
