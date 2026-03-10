package com.klef.fsad.exam.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();

        Delivery d = new Delivery("Tulasi", "10-03-2026", "Delivered", "Hyderabad");

        s.persist(d);

        System.out.println("Delivery Record Inserted");

        tx.commit();

        Transaction tx2 = s.beginTransaction();

        String hql = "delete from Delivery where id=?1";

        Query query = s.createQuery(hql);

        query.setParameter(1, d.getId());

        int result = query.executeUpdate();

        System.out.println(result + " Record Deleted");

        tx2.commit();

        s.close();
        sf.close();
    }
}