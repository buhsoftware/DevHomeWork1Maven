import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class UserTest {
    public static void main(String[] args) {

        User person = new User("Sergey", "Shevchenko");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
