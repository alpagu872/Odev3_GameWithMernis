package Concreate;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entities.User;

public class UsualUserManager extends BaseUserManager {
    private UserCheckService userCheckService;

    public UsualUserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void save(User user) throws Exception {
        if (userCheckService.checkIfRealPerson(user)){
            super.save(user);

        }else {
            throw new Exception("Not a valid person.");
        }

    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }
}
