import java.util.ArrayList;

public class MarketingAssociate extends Employee{

    MarketingAssociate(String name, MarketingManager manager,
                       long id, ArrayList<Client> client) {
        super(name, manager, id, client);
    }


    double bonus() {
        return 500*this.getClients().size();
    }
}
