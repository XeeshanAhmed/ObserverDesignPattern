public class WebNews implements NewsChannel{

    @Override
    public void update(String news) {
        System.out.println("Publishing news on website");
        System.out.println("News : "+ news);
    }
}
