package com.dgd.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
public final class HibernateUtil {
    private HibernateUtil() {}
    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        return factory;
    }
}
