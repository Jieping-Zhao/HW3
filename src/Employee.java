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

    public ArrayList<Client> getClients() {
        return this.client;
    }

    abstract double bonus();

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    MarketingManager getManager() {
        return manager;
    }

    void setManager(MarketingManager manager) {
        this.manager = manager;
    }

    long getMarketingID() {
        return marketingID;
    }

    void setMarketingID(long marketingID) {
        this.marketingID = marketingID;
    }

    ArrayList<Client> getClient() {
        return client;
    }

    void setClient(ArrayList<Client> client) {
        this.client = client;
    }
}
