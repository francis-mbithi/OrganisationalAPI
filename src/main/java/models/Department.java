package models;

import java.util.Objects;

public class Department {

    private String departmentname;
    private String description;
    private int totalemployees;
    private int id;

    public Department(String departmentname, String description, int totalemployees, int id) {
        this.departmentname = departmentname;
        this.description = description;
        this.totalemployees = totalemployees;
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalemployees() {
        return totalemployees;
    }

    public void setTotalemployees(int totalemployees) {
        this.totalemployees = totalemployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getTotalemployees() == that.getTotalemployees() &&
                Objects.equals(getDepartmentname(), that.getDepartmentname()) &&
                Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartmentname(), getDescription(), getTotalemployees());
    }
}