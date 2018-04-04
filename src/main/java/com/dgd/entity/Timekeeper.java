package com.dgd.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Entity
public class Timekeeper {
    private String authorTimekeeperIdKunjie;
    private Timestamp authorDateTimeKunjie;
    private String authorInOutKunjie;

    @Id
    @Column(name = "Timekeeper_Id")
    public String getTimekeeperId() {
        return authorTimekeeperIdKunjie;
    }

    public void setTimekeeperId(String timekeeperId) {
        authorTimekeeperIdKunjie = timekeeperId;
    }

    @Basic
    @Column(name = "Date_Time")
    public Timestamp getDateTime() {
        return authorDateTimeKunjie;
    }

    public void setDateTime(Timestamp dateTime) {
        authorDateTimeKunjie = dateTime;
    }

    @Basic
    @Column(name = "In_Out")
    public String getInOut() {
        return authorInOutKunjie;
    }

    public void setInOut(String inOut) {
        authorInOutKunjie = inOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Timekeeper that = (Timekeeper) o;

        if (authorTimekeeperIdKunjie != null ? !authorTimekeeperIdKunjie.equals(that.authorTimekeeperIdKunjie) : that.authorTimekeeperIdKunjie != null)
            return false;
        if (authorDateTimeKunjie != null ? !authorDateTimeKunjie.equals(that.authorDateTimeKunjie) : that.authorDateTimeKunjie != null)
            return false;
        if (authorInOutKunjie != null ? !authorInOutKunjie.equals(that.authorInOutKunjie) : that.authorInOutKunjie != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authorTimekeeperIdKunjie != null ? authorTimekeeperIdKunjie.hashCode() : 0;
        result = 31 * result + (authorDateTimeKunjie != null ? authorDateTimeKunjie.hashCode() : 0);
        result = 31 * result + (authorInOutKunjie != null ? authorInOutKunjie.hashCode() : 0);
        return result;
    }
}
