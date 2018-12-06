package ru.job4j;
import org.junit.Test;
<<<<<<< Updated upstream
import java.util.ArrayList;
import java.util.HashMap;
=======
>>>>>>> Stashed changes
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class UserConvertTest {
    @Test
<<<<<<< Updated upstream
    public void convertListUserInHashMap() {
        User user = new User(1, "Ivan", "SPB");
        List<User> list = new ArrayList<>();
        list.add(user);
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> map = userConvert.process(list);
        HashMap<Integer, User> exeprtion = new HashMap<>();
        exeprtion.put(1, user);
        assertThat(map, is(exeprtion));
=======
    public void addNewUser() {
        UserConvert convert = new UserConvert();
        List<User> list = (List<User>) new User(1, "Ivan", "SPB");

        System.out.print(convert.process(list));
>>>>>>> Stashed changes
    }
}
