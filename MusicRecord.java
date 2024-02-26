import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicRecord extends Record {

    // genre, artist, album name, songs list

    private String artist;
    private String albumName;
    private List<String> songList;

    @Override
    public String sayHello() {
        return null;
    }

    @Override
    public String composeRecordName(int price) {
        return String.format("Music record '%s' has price %d euro", this.albumName, price);
    }

    @Override
    public String composeRecordName(int price, boolean hasDiscount) {
        String result = "Music record '%s' has price %d euro";
        if (hasDiscount) {
            result += " with discount";
        } else {
            result += " by default";
        }
        return String.format(result, this.albumName, price);
    }

    @Override
    public String composeRecordName(int price, boolean hasDiscount, boolean isNew) {
        String result = "Music record '%s' has price %d euro";
        if (hasDiscount && isNew) {
            result += " having new arrival discount!";
        } else if (hasDiscount) {
            result += " with discount.";
        } else if (isNew) {
            result += " and has just arrived!";
        } else {
            result += " by default.";
        }
        return String.format(result, this.albumName, price);
    }

    @Override
    public int generateNumber() {
        return 10;
    }
}
