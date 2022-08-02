package UserTypes;

public class AdminUser extends User{

    private String adminuserName;
    private String adminPassword;

    public AdminUser(int id, String first, String last, String un, String pw){
        super(id, first, last);
        this.adminuserName = un;
        this.adminPassword = pw;
    }

}
