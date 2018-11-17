package blog.anirbanm.chart.viewmodel.types;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable {
    
    @SuppressWarnings("compatibility:6612815155093525501")
    private static final long serialVersionUID = -1082813144938394497L;
    
    private Integer departmentId;
    private String departmentName;
    private Integer managerId;
    private Integer locationId;
    private List<Employee> employees;

    public Department() {
        super();
    }

    public Department(Integer departmentId, String departmentName, Integer managerId, Integer locationId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.locationId = locationId;
        this.employees = new ArrayList<Employee>();
    }
    
    public void addEmployee(Employee employee) {
        getEmployees().add(employee);
    }
    
    public void addEmployees(List<Employee> employees) {
        getEmployees().addAll(employees);
    }

    @Override
    public String toString() {
        return "Department ["
            + departmentId + ", "
            + departmentName + ", "
            + managerId + ", "
            + locationId + "]";
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
