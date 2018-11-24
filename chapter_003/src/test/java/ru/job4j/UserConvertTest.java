package ru.job4j;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class UserConvertTest {
    @Test
    public void convertListUserInHashMap() {
        User user = new User(1, "Ivan", "SPB");
        List<User> list = new ArrayList<>();
        list.add(user);
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> map = userConvert.process(list);
    }
}
