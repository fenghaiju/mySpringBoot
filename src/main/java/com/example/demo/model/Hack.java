package com.example.demo.model;



import javax.persistence.*;

/**
 * com.example.demo.model
 * 94936
 * 2018/1/5
 * 14:21
 * mySpringBoot
 **/
@Entity
@Table(name = "HEIMA_TEST")
public class Hack {
    @Id
    @GeneratedValue
    private String id;
    private Integer age;//年龄
    private Integer sex;//性别
    private Integer cp;//胸部疼痛类型 痛感由重到无typical、atypical、non-anginal、asymptomatic
    private Integer trestbps;//血压
    private Integer chol;//胆固醇
    private Integer fbs;//空腹血糖 血糖含量大于120mg/dl为true，否则为false
    private Integer restecg;//心电图结果 是否有T波，由轻到重为norm、hyp
    private Integer thalach;//最大心跳数
    private Integer exang;//运动时是否心绞痛
    private Integer oldpeak;//运动相对于休息的ST depression
    private Integer slop;//心电图ST segment的倾斜度 ST segment的slope，程度分为down、flat、up
    private Integer ca;//透视检查看到的血管数
    private Integer status;//是否患病 是否患病，buff是健康、sick是患病
    private Integer thal;//缺陷种类 并发种类，由轻到重norm、fix、rev
    private Integer predict;


    public Hack() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Integer getTrestbps() {
        return trestbps;
    }

    public void setTrestbps(Integer trestbps) {
        this.trestbps = trestbps;
    }

    public Integer getChol() {
        return chol;
    }

    public void setChol(Integer chol) {
        this.chol = chol;
    }

    public Integer getFbs() {
        return fbs;
    }

    public void setFbs(Integer fbs) {
        this.fbs = fbs;
    }

    public Integer getRestecg() {
        return restecg;
    }

    public void setRestecg(Integer restecg) {
        this.restecg = restecg;
    }

    public Integer getThalach() {
        return thalach;
    }

    public void setThalach(Integer thalach) {
        this.thalach = thalach;
    }

    public Integer getExang() {
        return exang;
    }

    public void setExang(Integer exang) {
        this.exang = exang;
    }

    public Integer getOldpeak() {
        return oldpeak;
    }

    public void setOldpeak(Integer oldpeak) {
        this.oldpeak = oldpeak;
    }

    public Integer getSlop() {
        return slop;
    }

    public void setSlop(Integer slop) {
        this.slop = slop;
    }

    public Integer getCa() {
        return ca;
    }

    public void setCa(Integer ca) {
        this.ca = ca;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getThal() {
        return thal;
    }

    public void setThal(Integer thal) {
        this.thal = thal;
    }

    public Integer getPredict() {
        return predict;
    }

    public void setPredict(Integer predict) {
        this.predict = predict;
    }

    @Override
    public String toString() {
        return "Hack{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", cp=" + cp +
                ", trestbps=" + trestbps +
                ", chol=" + chol +
                ", fbs=" + fbs +
                ", restecg=" + restecg +
                ", thalach=" + thalach +
                ", exang=" + exang +
                ", oldpeak=" + oldpeak +
                ", slop=" + slop +
                ", ca=" + ca +
                ", status=" + status +
                ", thal=" + thal +
                '}';
    }
}
