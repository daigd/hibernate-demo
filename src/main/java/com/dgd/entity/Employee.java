package com.dgd.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Arrays;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Entity
public class Employee {
    private long authorEmpIdKunjie;
    private String authorEmpNameKunjie;
    private String authorEmpNoKunjie;
    private Date authorHireDateKunjie;
    private byte[] authorImageKunjie;
    private String authorJobKunjie;
    private double authorSalaryKunjie;

    @Id
    @Column(name = "EMP_ID")
    public long getEmpId() {
        return authorEmpIdKunjie;
    }

    public void setEmpId(long empId) {
        authorEmpIdKunjie = empId;
    }

    @Basic
    @Column(name = "EMP_NAME")
    public String getEmpName() {
        return authorEmpNameKunjie;
    }

    public void setEmpName(String empName) {
        authorEmpNameKunjie = empName;
    }

    @Basic
    @Column(name = "EMP_NO")
    public String getEmpNo() {
        return authorEmpNoKunjie;
    }

    public void setEmpNo(String empNo) {
        authorEmpNoKunjie = empNo;
    }

    @Basic
    @Column(name = "HIRE_DATE")
    public Date getHireDate() {
        return authorHireDateKunjie;
    }

    public void setHireDate(Date hireDate) {
        authorHireDateKunjie = hireDate;
    }

    @Basic
    @Column(name = "IMAGE")
    public byte[] getImage() {
        return authorImageKunjie;
    }

    public void setImage(byte[] image) {
        authorImageKunjie = image;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return authorJobKunjie;
    }

    public void setJob(String job) {
        authorJobKunjie = job;
    }

    @Basic
    @Column(name = "SALARY")
    public double getSalary() {
        return authorSalaryKunjie;
    }

    public void setSalary(double salary) {
        authorSalaryKunjie = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (authorEmpIdKunjie != employee.authorEmpIdKunjie) return false;
        if (Double.compare(employee.authorSalaryKunjie, authorSalaryKunjie) != 0) return false;
        if (authorEmpNameKunjie != null ? !authorEmpNameKunjie.equals(employee.authorEmpNameKunjie) : employee.authorEmpNameKunjie != null)
            return false;
        if (authorEmpNoKunjie != null ? !authorEmpNoKunjie.equals(employee.authorEmpNoKunjie) : employee.authorEmpNoKunjie != null)
            return false;
        if (authorHireDateKunjie != null ? !authorHireDateKunjie.equals(employee.authorHireDateKunjie) : employee.authorHireDateKunjie != null)
            return false;
        if (!Arrays.equals(authorImageKunjie, employee.authorImageKunjie)) return false;
        if (authorJobKunjie != null ? !authorJobKunjie.equals(employee.authorJobKunjie) : employee.authorJobKunjie != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (authorEmpIdKunjie ^ (authorEmpIdKunjie >>> 32));
        result = 31 * result + (authorEmpNameKunjie != null ? authorEmpNameKunjie.hashCode() : 0);
        result = 31 * result + (authorEmpNoKunjie != null ? authorEmpNoKunjie.hashCode() : 0);
        result = 31 * result + (authorHireDateKunjie != null ? authorHireDateKunjie.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(authorImageKunjie);
        result = 31 * result + (authorJobKunjie != null ? authorJobKunjie.hashCode() : 0);
        temp = Double.doubleToLongBits(authorSalaryKunjie);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
