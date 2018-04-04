package com.dgd.demo;

import com.dgd.entity.Employee;
import com.dgd.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
public class QueryObjectDemo2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getTransaction().begin();

        String sql = "select e from " + Employee.class.getName() + " e " + "where e.department.deptNo=:deptNo";
        Query<Employee> query = session.createQuery(sql);
        query.setParameter("deptNo", "D10");
        query.getResultList().forEach(e -> System.out.println(e.getEmpNo() + ":" + e.getEmpName()));

        session.getTransaction().commit();
    }
}
