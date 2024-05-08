import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<NewsChannel> newsChannels = new ArrayList<>();

    public void registerChannel(NewsChannel channel) {
        newsChannels.add(channel);
    }

    public void unregisterChannel(NewsChannel channel) {
        newsChannels.remove(channel);
    }

    public void spreadNews(String news) {
        for (NewsChannel channel : newsChannels) {
            channel.update(news);
        }
    }
}

