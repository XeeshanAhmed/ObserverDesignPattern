public class LiveTvNews implements NewsChannel{
    @Override
    public void update(String news) {
        System.out.println("Publishing news on Live TV");
        System.out.println("News : "+ news);
    }
}
