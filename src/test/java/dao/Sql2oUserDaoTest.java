package dao;
import models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Sql2oUserDaoTest {

    private Connection conn;
    private Sql2oUserDao userDao;

    @Before
    public void setup() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/org_api_test";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "c3l12i9f6f6");
        userDao = new Sql2oUserDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
//        userDao.clearAll();
        conn.close();
    }

    @Test
    public void add() {
        User user = setUpNewUser();
        assertEquals(user.getId(), user.getId());
    }

    @Test
    public void getAll() {
        User user = setUpNewUser();
        assertEquals(true, userDao.getAll().contains(user));
    }

    @Test
    public void getAllUsersByDepartment() {
        User user = setUpNewUser();
        List<User> allUserByDept = userDao.getAllUsersByDepartment(user.getDepartmentId());
        assertEquals(user.getDepartmentId(),allUserByDept.get(0).getDepartmentId());
    }
}
