package functionalinterface;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getDBConnectionURL());

    }

    private static String getDBConnectionURL() {
        return "jdbc://localhost:5432/users";
    }



}
