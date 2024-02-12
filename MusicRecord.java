import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicRecord extends Record {

    // genre, artist, album name, songs list
    private String genre;
    private String artist;
    private String albumName;
    private List<String> songList;
}
