package com.dgd.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Entity
@Table(name = "DEPARTMENT", uniqueConstraints = { @UniqueConstraint(columnNames = { "DEPT_NO" }) })
public class Department {
    private int deptId;
    private String deptName;
    private String deptNo;
    private String location;
    private Set<Employee> employees = new HashSet<>(0);

    public Department() {}

    public Department(int deptId, String deptName, String deptNo, String location) {
        this.deptId = deptId;
        this.deptNo = "D" + this.deptNo;
        this.deptName = deptName;
        this.location = location;
    }

    @Id
    @Column(name = "DEPT_ID")
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "DEPT_NAME")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "DEPT_NO")
    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Basic
    @Column(name = "LOCATION")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
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

        Department that = (Department) o;

        if (deptId != that.deptId) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null)
            return false;
        if (deptNo != null ? !deptNo.equals(that.deptNo) : that.deptNo != null)
            return false;
        if (location != null ? !location.equals(that.location) : that.location != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptId;
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (deptNo != null ? deptNo.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
