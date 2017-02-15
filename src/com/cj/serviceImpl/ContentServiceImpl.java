package com.cj.serviceImpl;

import com.cj.bean.Content;
import com.cj.dao.BaseDAO;
import com.cj.dao.ContentDAO;
import com.cj.daoimpl.ContentDAOImpl;
import com.cj.service.ContentService;

/**
 * Created by interface on 2017/2/8.
 */
public class ContentServiceImpl extends BaseDAO implements ContentService {
    public ContentDAO contentDAO;
    public ContentServiceImpl(){
        contentDAO = new ContentDAOImpl();
    }
    @Override
    public void AddText(Content content) {
        contentDAO.AddText(content);
    }
}
