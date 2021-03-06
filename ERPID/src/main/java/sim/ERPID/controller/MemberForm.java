package sim.ERPID.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter @Setter
public class MemberForm {
    private String name;
    private Integer number;
    private String pw;
    private String email;
    private String sex;
    private String address;
    private String jumin;
    private String department;
    private String position;
    private String status;
    private Date hire;
    private Date resign;
    private String bodyheat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJumin() {
        return jumin;
    }

    public void setJumin(String jumin) {
        this.jumin = jumin;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getHire() {
        return hire;
    }

    public void setHire(Date hire) {
        this.hire = hire;
    }

    public Date getResign() {
        return resign;
    }

    public void setResign(Date resign) {
        this.resign = resign;
    }

    public String getBodyheat() {
        return bodyheat;
    }

    public void setBodyheat(String bodyheat) {
        this.bodyheat = bodyheat;
    }
}
