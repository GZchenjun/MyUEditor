package com.cj.dao;

import com.cj.hibernateUtil.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 * Created by interface on 2017/2/8.
 */
public class BaseDAO {
    protected static SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
}
