import Abstract.BaseCampaignManager;
import Abstract.BaseUserManager;
import Abstract.SellManager;
import Adapters.MernisServiceAdapter;
import Concreate.CampaignManager;
import Concreate.UsualSellManager;
import Concreate.UsualUserManager;
import Entities.Campaign;
import Entities.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        User hasan = new User(1,12323211,"Hasan","Akgün",new Date(1999,10,16),"xxKralTR");
        BaseUserManager userManager = new UsualUserManager(new MernisServiceAdapter());
        //userManager.save(hasan);

        SellManager sellManager= new UsualSellManager();
        sellManager.sell(hasan);
        BaseCampaignManager campaignManager = new CampaignManager();

        Campaign campaign10 = new Campaign(1,"%10 Discount",10);
        campaignManager.addCampaign(campaign10);

        sellManager.sell(hasan,campaign10);





    }
}