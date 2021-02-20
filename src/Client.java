import java.util.ArrayList;

public class Client {
    private int clientID;
    private String clientName;
    private ArrayList<Employee> employee;

    Client(int id, String name, ArrayList<Employee> employee) {
        this.clientID = id;
        this.clientName = name;
        this.employee = employee;
    }

    public double totalSales() {
        return 0;
    }
}
