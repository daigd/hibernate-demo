package com.dgd.demo;

import com.dgd.entity.Employee;
import com.dgd.entity.ShortEmpInfo;
import com.dgd.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
public class ShortEmpInfoQueryDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        List<ShortEmpInfo> empInfoList = session.createQuery("select new " + ShortEmpInfo.class.getName() + "(e.empId,e.empNo, e.empName) from " + Employee.class.getName() + " e ").getResultList();
        empInfoList.forEach(e -> System.out.println("Emp:" + e.getEmpNo() + ":" + e.getEmpName()));

        session.getTransaction().commit();
    }
}
