import java.util.ArrayList;

public abstract class Employee {

    protected String employeeName;
    protected MarketingManager manager;
    protected long marketingID;
    protected ArrayList<Client> client;

    public Employee(String name, MarketingManager manager, long id, ArrayList<Client> client) {
        this.employeeName = name;
        this.manager = manager;
        this.marketingID = id;
        this.client = client;
    }

    public boolean addClient(Client client){
        return this.client.add(client);
    }

    protected ArrayList<Client> getClients() {
        return this.client;
    }

}
