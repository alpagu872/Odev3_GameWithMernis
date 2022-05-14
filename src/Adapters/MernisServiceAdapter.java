package Adapters;

import Abstract.UserCheckService;
import Entities.User;
import mernisServiceReferance.LNGKPSPublicSoap;

public class MernisServiceAdapter implements UserCheckService
{


    @Override
    public boolean checkIfRealPerson(User user) throws Exception {
        LNGKPSPublicSoap client = new LNGKPSPublicSoap();
        return client.TCKimlikNoDogrula(user.getNationalId(),user.getFirstName(), user.getLastName(),user.getBirthDate().getYear());
    }
}
