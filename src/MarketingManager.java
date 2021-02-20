import java.util.ArrayList;

public class MarketingManager extends Employee{
    protected ArrayList<Employee> employees;

    MarketingManager(String name, ArrayList<Employee> employees,
                     MarketingManager manager, long id, ArrayList<Client> client) {
        super(name, manager, id, client);
        this.employees = employees;
    }


    double bonus() {
        return 250*this.getClients().size();
    }

}
