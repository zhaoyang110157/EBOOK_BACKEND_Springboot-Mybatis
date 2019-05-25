package com.zhaoyang.entity;

import org.jetbrains.annotations.Contract;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "orders", schema = "ebook", catalog = "")
public class Orders {
    private int id;
    private int oid;
    private Timestamp time;
    private List<Orderitem> orderitems ;

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY,targetEntity=com.zhaoyang.entity.Orderitem.class)
    @JoinTable(name = "orderitem",joinColumns = {@JoinColumn(name = "oid")},inverseJoinColumns = {@JoinColumn(name = "oid")})
    public List<Orderitem> getOrderitems(){ return orderitems;}
    public void setOrderitems(List<Orderitem> orderitems){this.orderitems = orderitems;}
    public void setItemOid(int oid){
        for(int i=0;i<orderitems.size();i++)
            orderitems.get(i).setOid(oid);
    }
    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oid")
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Contract(value = "null -> false", pure = true)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders that = (Orders) o;

        if (id != that.id) return false;
        if (oid != that.oid) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + oid;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}