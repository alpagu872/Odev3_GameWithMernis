package Abstract;

import Entities.User;

public abstract class BaseUserManager implements UserService {

    @Override
    public void save(User user) throws Exception {
        System.out.println("Kullanıcı kaydedildi: " + user.getUserName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı güncellendi: " + user.getUserName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı sistemden kaldırıldı : " + user.getUserName() );
    }
}
