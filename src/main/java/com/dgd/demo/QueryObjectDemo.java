package com.dgd.demo;

import com.dgd.entity.Employee;
import com.dgd.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
public class QueryObjectDemo {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.getTransaction().begin();
        String sql = "SELECT e from " + Employee.class.getName() + " e order by e.empName,e.empNo";
        Query<Employee> query = session.createQuery(sql);
        List<Employee> employeeList = query.getResultList();
        employeeList.forEach(e-> System.out.println(e.getEmpName()+","+e.getEmpNo()));
        session.getTransaction().commit();
    }
}
