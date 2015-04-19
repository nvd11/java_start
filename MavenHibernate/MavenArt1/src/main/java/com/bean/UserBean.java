package com.bean;

import org.hibernate.*;  
import org.hibernate.cfg.*;  
import java.util.*;  
import com.model.*;
import com.hbm.*;
  
/** 
 * 和course相关的业务逻辑 
 */  
public class UserBean extends HibernateBase {  
    public UserBean() throws HibernateException {  
        super();  
    }  
  
    /** 
     * 增加一个Course 
     */  
    public void addUser(User user) throws HibernateException {  
        beginTransaction();  
        session.save(user);  
        endTransaction(true);  
    }  
  
    /** 
     * 查询系统中所有的Course，返回的是包含有Course持久对象的Iterator。 
     */  
    public Iterator getAllUsers() throws HibernateException {  
        String queryString = "select users from User as user";  
        beginTransaction();  
        Query query = session.createQuery(queryString);  
        Iterator it = query.iterate();  
        return it;  
    }  
  
    /** 
     * 删除给定ID的course 
     */  
    public void deleteUser(String id) throws HibernateException {  
        beginTransaction();  
        User user = (User) session.load(User.class, id);  
        session.delete(user);  
        endTransaction(true);  
    }  
  
    /** 
     * 按course的名字进行模糊查找，返回的是包含有Course持久对象的Iterator。 
     */  
    public Iterator getSomeUser(String name) throws HibernateException {  
        String queryString = "select u from User as u where u.name like :name";  
        beginTransaction();  
        Query query = session.createQuery(queryString);  
        query.setString("name", "%" + name + "%");  
        Iterator it = query.iterate();  
        return it;  
    }  
} 