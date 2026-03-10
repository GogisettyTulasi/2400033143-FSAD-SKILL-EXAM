package com.klef.fsad.exam.entity;

import jakarta.persistence.*;

@Entity
@Table(name="delivery")
public class Delivery 
{
    @Id
    private int id;

    private String name;
    private String date;
    private String status;
    private String address;

    public Delivery() {}

    public Delivery(String name, String date, String status, String address)
    {
        this.name = name;
        this.date = date;
        this.status = status;
        this.address = address;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }
}