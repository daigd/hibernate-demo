package com.dgd.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Entity
public class Department {
    private int authorDeptIdKunjie;
    private String authorDeptNameKunjie;
    private String authorDeptNoKunjie;
    private String authorLocationKunjie;

    @Id
    @Column(name = "DEPT_ID")
    public int getDeptId() {
        return authorDeptIdKunjie;
    }

    public void setDeptId(int deptId) {
        authorDeptIdKunjie = deptId;
    }

    @Basic
    @Column(name = "DEPT_NAME")
    public String getDeptName() {
        return authorDeptNameKunjie;
    }

    public void setDeptName(String deptName) {
        authorDeptNameKunjie = deptName;
    }

    @Basic
    @Column(name = "DEPT_NO")
    public String getDeptNo() {
        return authorDeptNoKunjie;
    }

    public void setDeptNo(String deptNo) {
        authorDeptNoKunjie = deptNo;
    }

    @Basic
    @Column(name = "LOCATION")
    public String getLocation() {
        return authorLocationKunjie;
    }

    public void setLocation(String location) {
        authorLocationKunjie = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (authorDeptIdKunjie != that.authorDeptIdKunjie) return false;
        if (authorDeptNameKunjie != null ? !authorDeptNameKunjie.equals(that.authorDeptNameKunjie) : that.authorDeptNameKunjie != null)
            return false;
        if (authorDeptNoKunjie != null ? !authorDeptNoKunjie.equals(that.authorDeptNoKunjie) : that.authorDeptNoKunjie != null)
            return false;
        if (authorLocationKunjie != null ? !authorLocationKunjie.equals(that.authorLocationKunjie) : that.authorLocationKunjie != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorDeptIdKunjie;
        result = 31 * result + (authorDeptNameKunjie != null ? authorDeptNameKunjie.hashCode() : 0);
        result = 31 * result + (authorDeptNoKunjie != null ? authorDeptNoKunjie.hashCode() : 0);
        result = 31 * result + (authorLocationKunjie != null ? authorLocationKunjie.hashCode() : 0);
        return result;
    }
}
