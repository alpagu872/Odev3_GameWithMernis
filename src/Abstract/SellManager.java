package Abstract;

import Entities.Campaign;
import Entities.User;

public abstract class SellManager {
    public void sell(User user){
        System.out.println("Eşya " + user.getUserName() + " kullanıcıya satıldı.");
    }

    public void sell(User user, Campaign campaign){
        System.out.println("Eşya " + user.getUserName() + " kullanıcıya satıldı.");
        System.out.println("Kullanılan kampanya: " + campaign.getName());
    }
}
