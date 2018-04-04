package com.dgd.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Entity
@Table(name = "EMPLOYEE", uniqueConstraints = { @UniqueConstraint(columnNames = { "EMP_NO" }) })
public class Employee {
    private long empId;
    private String empName;
    private String empNo;
    private Date hireDate;
    private byte[] image;
    private String job;
    private double salary;

    private Employee manager;

    private Department department;

    private Set<Employee> employees = new HashSet<>(0);

    public Employee() {
    }

    public Employee(Long empId, String empName, String job, Employee manager, Date hideDate, Float salary, Float comm,
                    Department department) {
        this.empId = empId;
        this.empNo = "E" + this.empId;
        this.empName = empName;
        this.job = job;
        this.manager = manager;
        this.hireDate = hideDate;
        this.salary = salary;
        this.department = department;
    }


    @Id
    @Column(name = "EMP_ID")
    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "EMP_NAME")
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "EMP_NO")
    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "HIRE_DATE")
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "IMAGE")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "SALARY")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPT_ID", nullable = false)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "empId")
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        if (empName != null ? !empName.equals(employee.empName) : employee.empName != null)
            return false;
        if (empNo != null ? !empNo.equals(employee.empNo) : employee.empNo != null)
            return false;
        if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null)
            return false;
        if (!Arrays.equals(image, employee.image)) return false;
        if (job != null ? !job.equals(employee.job) : employee.job != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (empId ^ (empId >>> 32));
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empNo != null ? empNo.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
