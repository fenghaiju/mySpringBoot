package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * com.example.demo.model
 * 94936
 * 2018/1/5
 * 14:21
 * mySpringBoot
 **/
@Entity
@Table(name = "Conf")
public class Conf {
    @Id
    @GeneratedValue
    private String id;
    private String confName;
    private String urgentPeople;
    private String urgentPhone;
    private String hospital;
    private String familyDoctor;
    private String modelBody;


    public Conf() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public String getUrgentPeople() {
        return urgentPeople;
    }

    public void setUrgentPeople(String urgentPeople) {
        this.urgentPeople = urgentPeople;
    }

    public String getUrgentPhone() {
        return urgentPhone;
    }

    public void setUrgentPhone(String urgentPhone) {
        this.urgentPhone = urgentPhone;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getFamilyDoctor() {
        return familyDoctor;
    }

    public void setFamilyDoctor(String familyDoctor) {
        this.familyDoctor = familyDoctor;
    }

    public String getModelBody() {
        return modelBody;
    }

    public void setModelBody(String modelBody) {
        this.modelBody = modelBody;
    }

    @Override
    public String toString() {
        return "Conf{" +
                "id='" + id + '\'' +
                ", confName='" + confName + '\'' +
                ", urgentPeople='" + urgentPeople + '\'' +
                ", urgentPhone='" + urgentPhone + '\'' +
                ", hospital='" + hospital + '\'' +
                ", familyDoctor='" + familyDoctor + '\'' +
                ", modelBody='" + modelBody + '\'' +
                '}';
    }
}
