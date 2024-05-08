public class MobileAppNews implements NewsChannel{
    @Override
    public void update(String news) {
        System.out.println("Publishing news on Mobile App");
        System.out.println("News : "+news);
    }
}
