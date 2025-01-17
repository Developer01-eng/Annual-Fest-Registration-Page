
public class Main {
    public static void main(String[] args) {
        try {
            Operations.createDatabase();
            Operations.createTable();
            new RegistrationPage();
        } catch (Exception e) {
            System.out.println("Main page error");
            e.printStackTrace();
        }
    }
}

