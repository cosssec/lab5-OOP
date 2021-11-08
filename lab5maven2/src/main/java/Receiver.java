import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver implements User{
    @Override
    public String update(String status) {
        return "Current status is " + status;
}