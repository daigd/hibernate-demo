package com.dgd.demo;

import com.dgd.entity.Employee;
import com.dgd.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
public class QuerySomeColumnDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();
        Query<Object[]> query = session.createQuery("select e.empId,e.empNo,e.empName from " + Employee.class.getName() + " e ");
        List<Object[]> list = query.getResultList();
        for (Object[] emp : list) {
            System.out.println("empId:" + emp[0]);
            System.out.println("empNo:" + emp[1]);
            System.out.println("empName:" + emp[2]);
            System.out.println("==================");
        }

        session.getTransaction().commit();



    }
}
