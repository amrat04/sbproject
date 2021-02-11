package com.test.sbproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int studentid;

    @Column(name="username")
    public String username;

    @Column(name="password")
    public String password;

    @Column(name="name")
    public String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="sid")
    @OrderColumn(name="type")
    public List<Address> addressList;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

}
