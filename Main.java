public class Main {
    public static void main(String[] args) {
        NewsAgency myNewsAgency = new NewsAgency();

        NewsChannel webNews = new WebNews();
        NewsChannel mobileAppNews = new MobileAppNews();
        NewsChannel liveTvNews = new LiveTvNews();

        myNewsAgency.registerChannel(webNews);
        myNewsAgency.registerChannel(mobileAppNews);
        myNewsAgency.registerChannel(liveTvNews);
        myNewsAgency.spreadNews("");

    }
}

