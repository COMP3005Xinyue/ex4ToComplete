import java.util.ArrayList;

public class CBC implements Observer{
    private NewsAgency newsAgency;

    public CBC (ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            this.newsAgency = (NewsAgency) list.get(i);
            newsAgency.registerObserver(this);
        }
    }

    public void update(NewsItem n){
        System.out.println("CBC	reports	" + "New Olympic News Item!!" + n.toString());
    };
}
