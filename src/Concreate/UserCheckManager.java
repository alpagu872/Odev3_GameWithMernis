package Concreate;

import Entities.User;

public class UserCheckManager implements Abstract.UserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        return true;
    }
}
