package com.cj.daoimpl;

import com.cj.bean.Content;
import com.cj.dao.BaseDAO;
import com.cj.dao.ContentDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by interface on 2017/2/8.
 */
public class ContentDAOImpl extends BaseDAO implements ContentDAO {

    @Override
    public void AddText(Content content) {
        Session session = sessionfactory.openSession();//获取到Sessin连接
        Transaction transaction = session.beginTransaction();//打开事物
        session.save(content);
        transaction.commit();
    }
}
