package UserTypes;

public abstract class User {

    private int userID;

    private String fName;
    private String lName;

    public User(int id, String first, String last){
        this.userID = id;
        this.fName = first;
        this.lName = last;
    }

}
