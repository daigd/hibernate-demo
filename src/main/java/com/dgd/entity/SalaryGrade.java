package com.dgd.entity;

import javax.persistence.*;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Entity
@Table(name = "SALARY_GRADE", schema = "h_db", catalog = "")
public class SalaryGrade {
    private int authorGradeKunjie;
    private double authorHighSalaryKunjie;
    private double authorLowSalaryKunjie;

    @Id
    @Column(name = "GRADE")
    public int getGrade() {
        return authorGradeKunjie;
    }

    public void setGrade(int grade) {
        authorGradeKunjie = grade;
    }

    @Basic
    @Column(name = "HIGH_SALARY")
    public double getHighSalary() {
        return authorHighSalaryKunjie;
    }

    public void setHighSalary(double highSalary) {
        authorHighSalaryKunjie = highSalary;
    }

    @Basic
    @Column(name = "LOW_SALARY")
    public double getLowSalary() {
        return authorLowSalaryKunjie;
    }

    public void setLowSalary(double lowSalary) {
        authorLowSalaryKunjie = lowSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalaryGrade that = (SalaryGrade) o;

        if (authorGradeKunjie != that.authorGradeKunjie) return false;
        if (Double.compare(that.authorHighSalaryKunjie, authorHighSalaryKunjie) != 0) return false;
        if (Double.compare(that.authorLowSalaryKunjie, authorLowSalaryKunjie) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = authorGradeKunjie;
        temp = Double.doubleToLongBits(authorHighSalaryKunjie);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(authorLowSalaryKunjie);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
