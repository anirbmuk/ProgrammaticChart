package blog.anirbanm.chart.viewmodel.types;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;

public class Employee implements Serializable {
    
    @SuppressWarnings("compatibility:-3432816448408784920")
    private static final long serialVersionUID = 688808414490334492L;
    
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Timestamp hireDate;
    private String jobId;
    private BigDecimal salary;
    private BigDecimal commissionPct;
    private Integer managerId;
    private Integer departmentId;

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee ["
            + employeeId + ", " + firstName + ", "
            + lastName + ", " + email + ", "
            + phoneNumber + "]";
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }

    public BigDecimal getCommissionPct() {
        return commissionPct;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }
}
