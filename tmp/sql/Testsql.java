import java.sql.Connection;
import java.sql.DriverManager;

public class Testsql{
    public static void main(String[] args){
        System.out.println("Heloo");
        f();
    }

    public static void f(){
        String dbURL = "jdbc:sqlserver://192.168.43.76:1433; DatabaseName=master";
        String userName = "sa";
        String userPwd = "32565624";
        Connection dbConn;

        try{
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("Done!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
