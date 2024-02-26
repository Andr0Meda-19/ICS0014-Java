import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieRecord extends Record {

    // genre, film director, name

    private String filmDirector;
    private String name;

    @Override
    public String sayHello() {
        return null;
    }

    @Override
    public String composeRecordName(int price) {
        return null;
    }

    @Override
    public String composeRecordName(int price, boolean hasDiscount) {
        return null;
    }

    @Override
    public String composeRecordName(int price, boolean hasDiscount, boolean isNew) {
        return null;
    }

}

