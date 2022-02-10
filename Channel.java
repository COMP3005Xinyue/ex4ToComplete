public class Channel implements Observer {
    public void update(NewsItem n){
        System.out.println("New Olympic News Item!!" + n.toString());
    };
}
