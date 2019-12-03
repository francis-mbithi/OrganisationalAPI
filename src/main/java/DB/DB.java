package DB;

import org.sql2o.Sql2o;

public class DB {

    // DEVELOPMENT DATABASE
    private static String testConnectionString = "jdbc:postgresql://localhost:5432/org_api";
    private static String testUser = "francis";
    private static String testPassword = "123";
    public static Sql2o sql2o = new Sql2o( testConnectionString, testUser, testPassword);// Comment this out if you are testing your app locally

//    // PRODUCTION DATABASE
//    private static String connectionString = "jdbc:postgresql://localhost:5432/org_api_test";
//    private static String user = "francis";
//    private static String password = "123";
////    public static Sql2o sql2o = new Sql2o( connectionString, user, password);

}