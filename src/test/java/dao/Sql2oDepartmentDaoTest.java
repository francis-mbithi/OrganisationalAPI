package dao;
import models.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oDepartmentDaoTest {

    private Connection conn;
    private Sql2oDepartmentDao departmentDao;

    @Before
    public void setup() throws Exception{
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString,"francis","123" );
        departmentDao = new Sql2oDepartmentDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception{
        departmentDao.clearAll();
        conn.close();
    }

    @Test
    public void add() {
        Department department = setUpDepartment();
        assertEquals(department.getId(), department.getId());
    }

    @Test
    public void getAll() {
        Department department = setUpDepartment();
        assertTrue(departmentDao.getAll().contains(department));
    }

    @Test
    public void findById() {
        Department department = setUpDepartment();
        assertEquals(department, departmentDao.findById(department.getId()));
    }

    @Test
    public void deleteById() {
        Department department = setUpDepartment();
        departmentDao.deleteById(department.getId());
        assertEquals(0,departmentDao.getAll().size());
    }

    @Test
    public void clearAll() {
        Department department = setUpDepartment();
        departmentDao.clearAll();
        assertEquals(0, departmentDao.getAll().size());
    }

    //helper
    public Department setUpDepartment(){
        Department department = new Department("finance","finance", 5, 2);
        departmentDao.add(department);
        return department;
    }
}
