package com.cj.action;

import com.cj.bean.Content;
import com.cj.service.ContentService;
import com.cj.serviceImpl.ContentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by interface on 2017/2/8.
 */
public class ContentAction extends ActionSupport implements ServletRequestAware {
    private Content content;
    private HttpServletRequest request;
    private ContentService contentService;
    public ContentAction(){
        contentService = new ContentServiceImpl();
    }
    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String saveText(){
        System.out.println("进入该函数");
        String text = request.getParameter("content");
        content.setContent(text);
        System.out.print(content.getContent()+"测试");
        contentService.AddText(content);
        return "add";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
       this.request = httpServletRequest;
    }
}
