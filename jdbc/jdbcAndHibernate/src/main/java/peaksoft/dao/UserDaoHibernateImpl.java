package peaksoft.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import peaksoft.config.Config;
import peaksoft.model.User;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
        try {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            session.createQuery("drop table users").executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("droped");
        }catch (HibernateException e){
            e.getMessage();
        }
    }

    @Override
    public void saveUser(User user) {
        try{
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            System.out.println("success!");
            session.close();
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void removeUserById(long id) {
        try {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            session.delete(session.get(User.class, id));
            session.getTransaction().commit();
            session.close();
            System.out.println("removed");
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
    }


    @Override
    public List<User> getAllUsers() {
        try {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            List<User> users = session.createQuery("FROM User").getResultList();
            session.getTransaction().commit();
            session.close();
            System.out.println("Finded " + users.size() + " student");
            return users;
        }catch (HibernateException e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public void cleanUsersTable() {
        try {
            Session session = Config.getSession().openSession();
            session.beginTransaction();
            session.createQuery("delete from User").executeUpdate();
            session.getTransaction().commit();
            session.close();
            System.out.println("deleted all User");
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }

    }
}
