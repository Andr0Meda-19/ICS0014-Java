import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Record implements RecordInterface {

    private String genre;

    public int generateNumber() {
        return 4;
    }

    public int generateNumber(int a) {
        return 4 + a;
    }

    public int generateNumber(int a, int b) {
        return 4 + a + b;
    }
}
