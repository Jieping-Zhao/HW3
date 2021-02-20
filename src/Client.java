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

    int getClientID() {
        return clientID;
    }

    void setClientID(int clientID) {
        this.clientID = clientID;
    }

    String getClientName() {
        return clientName;
    }

    void setClientName(String clientName) {
        this.clientName = clientName;
    }

    ArrayList<Employee> getEmployee() {
        return employee;
    }

    void setEmployee(ArrayList<Employee> employee) {
        this.employee = employee;
    }
}
