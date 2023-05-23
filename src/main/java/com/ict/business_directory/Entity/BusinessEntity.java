package com.ict.business_directory.Entity;


import jakarta.persistence.*;
import org.yaml.snakeyaml.DumperOptions;

@Entity
public class BusinessEntity {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private  String phone;

    @OneToOne(cascade = {CascadeType.ALL})
    private Address address;
    @OneToOne(cascade ={CascadeType.ALL} )
    private Location location;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}





