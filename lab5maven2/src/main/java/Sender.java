import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Sender implements User {
    private static int id;

    @Override
    public String update(String status) {
        return "Current status is  " + status;
    }
}