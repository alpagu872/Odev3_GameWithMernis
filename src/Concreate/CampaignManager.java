package Concreate;

import Abstract.BaseCampaignManager;
import Entities.Campaign;

public class CampaignManager implements BaseCampaignManager {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi: " + campaign.getName());
    }

    @Override
    public void removeCampaign(Campaign campaign) {
        System.out.println("Kampanya kaldırıldı: " + campaign.getName());
    }

    @Override
    public void updateCampaign(Campaign campaign) {

        System.out.println("Kampanya güncellendi: " + campaign.getName());
    }
}
