public class Login {
    public Login(String username, String password) {
    }   
}
public class Organization {}

public class Department extends Organization {}

public class Team extends Department {}

public abstract class Person {

    public abstract int getId();

}
public class Employee extends Person {

    private String username = “”;
    private String password = “”;

    public Employee(Team aTeam) {}

    public void loginToSystem(String username, String password) {
        Login logger = new Login(username, password);
        //...
    }

    @Override
    public int getId() {}

    class doWork {
        //…
    }

}
public class Manager extends Person {

    private String username = “”;
    private String password = “”;
    private List<Employee> mangedEmployees = new ArrayList<Employee>();

    public Manager (Team aTeam) {}

    @Override
    public int getId() {}

    public void loginToSystem(String username, String password) {
        Login logger = new Login(username, password);
        //…
    }

    class doWork {
        //…
    }
}