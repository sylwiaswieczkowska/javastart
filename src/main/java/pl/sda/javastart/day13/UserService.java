package pl.sda.javastart.day13;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> registeredUser = new ArrayList<>();

    public boolean registration(String name, String password) {
        boolean notExist = registeredUser.stream()
                .map(User::getName)
                .noneMatch(name::equals);//element -> element.equals(name)
        if (notExist) {
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            user.setId(getNextId());
            registeredUser.add(user);
        }
        return notExist;
    }

    private Long getNextId() {
        Long id = registeredUser.stream()
                .map(User::getId)
                .max(Long::compareTo)
                .orElse(0L);
        return ++id;
    }

    public boolean login(String name, String password){
        User user = registeredUser.stream()
                .filter(u -> u.getName().equals(name) && u.getPassword().equals(password))
                .findAny()
                .orElse(null);
        MainShop.user = user;
        return user != null;
    }
}
