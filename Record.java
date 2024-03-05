import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Record implements RecordInterface {

    private String genre;

    public String processGenge() {
        String result = "";
        switch (this.genre) {
            case "rock":
                result = "Result is rock";
                break;
            case "pop":
                result = "Result is pop";
                break;
            case "metal":
                result = "Result is metal";
                break;
            default:
                result = "Result is unknown";
                break;
        }
        return result;
    }

    public String processGenge2() {
        switch (this.genre) {
            case "rock":
                return "Result is rock";
            case "pop":
                return "Result is pop";
            case "metal":
                return "Result is metal";
            default:
                return "Result is unknown";
        }
    }

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
