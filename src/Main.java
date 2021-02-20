import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
//        Employee Peter = new MarketingAssociate("Peter", John, 12345, new ArrayList<>());
//        Employee Jim = new MarketingAssociate("Jim", Mary, 123, new ArrayList<Client>());
//        Employee Janet = new MarketingAssociate("Janet", Mary, 12345, new ArrayList<Client>());
//        ArrayList<Employee> john = new ArrayList<Employee>(Peter, Marry);
//        MarketingManager John = new MarketingManager("John", john, );
//        Employee Mary = new MarketingManager("Marry", new ArrayList<Employee>(), John, 1234, new ArrayList<Client>());

        MarketingManager john = new MarketingManager("John", null, null, 1, new ArrayList<>());
        MarketingManager mary = new MarketingManager("Mary", null, john, 2, new ArrayList<>());

        MarketingAssociate peter = new MarketingAssociate("Peter", john, 11, new ArrayList<>());
        MarketingAssociate jim = new MarketingAssociate("Jim", mary, 12, new ArrayList<>());
        MarketingAssociate janet = new MarketingAssociate("Janet", mary, 13, new ArrayList<>());

        Client client3 = new Client(3, "Jacob", new ArrayList<Employee>(Arrays.asList(mary)));
        Client client9 = new Client(9, "Mayank", new ArrayList<Employee>(Arrays.asList(john)));
        Client client42 = new Client(42, "Rahil", new ArrayList<Employee>(Arrays.asList(mary)));

        john.addClient(client9);
        john.setEmployees(new ArrayList<Employee>(Arrays.asList(peter, mary)));

        mary.addClient(client3);
        mary.addClient(client42);
        mary.setEmployees(new ArrayList<Employee>(Arrays.asList(jim, janet)));

        //Print based off John's attributes
        //Print John's name
        printManagerInfo(john);

        //Print Associate Info
        System.out.print("\n");
        //Array of associates for looping
        MarketingAssociate[] associates = {peter, jim, janet};
        //Loop through array printing each MA's name and their manager's name
        for(MarketingAssociate e: associates){
            System.out.print("Employee: " + e.getEmployeeName() + ". ");
            System.out.println("Marketing Manager: " + e.getManager().getEmployeeName() + ".");
        }

        //Print Client info
        System.out.print("\n");
        //Array of clients for looping
        Client[] cltArray = {client3, client9, client42};
        //Loop through array printing each client's ID and the names of all associated employees
        for(Client c: cltArray){
            System.out.print("ClientID: " + c.getClientID() + ". ");
            System.out.print("Marketing Employee: ");

            //Get and print all associated employee names
            ArrayList<Employee> employees = c.getEmployee();
            ListIterator it = employees.listIterator();
            System.out.print(((Employee)it.next()).getEmployeeName());
            //In the example no client has more than 1 employee, so this while loop isn't strictly necessary
            while(it.hasNext()){
                System.out.print(", " + ((Employee)it.next()).getEmployeeName());
            }
            System.out.println(".");
        }
    }

    private static void printManagerInfo(MarketingManager m){
        //Print Manager's name
        System.out.print("Marketing Manager: " + m.getEmployeeName() + ". ");

        ArrayList<Employee> employees = m.getEmployees();
        ArrayList<Client> clients = m.getClients();
        ListIterator it = employees.listIterator();

        //Print all employee names
        System.out.print("Employees: " + ((Employee)it.next()).getEmployeeName());
        while(it.hasNext()){
            System.out.print(", " + ((Employee)it.next()).getEmployeeName());
        }
        System.out.print(". ");

        //Print all client IDs
        it = clients.listIterator();
        System.out.print("Clients: " + ((Client)it.next()).getClientID());
        while(it.hasNext()){
            System.out.print(", " + ((Client)it.next()).getClientID());
        }
        System.out.print("\n");

        //Repeat this for all employees who are also managers
        it = employees.listIterator();
        while(it.hasNext()){
            Employee e = (Employee)it.next();
            if(e instanceof MarketingManager){
                printManagerInfo((MarketingManager) e);
            }
        }
    }
}
