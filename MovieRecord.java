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

}

