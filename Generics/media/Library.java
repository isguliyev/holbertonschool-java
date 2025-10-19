import java.util.List;
import java.util.ArrayList;

public class Library <T extends Media> {
    private List<T> mediaList;

    public Library() {
        setMediaList(new ArrayList<T>());
    }

    public void addMedia(T media) {
        this.mediaList.add(media);
    }

    public List<T> getMediaList() {
        return this.mediaList;
    }

    public void setMediaList(List<T> mediaList) {
        this.mediaList = mediaList;
    }
}