package sim.ERPID.Excel;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


public class Customer {
        private String name;
        private String number;
        private String address;
        private String department;
        private String position;
        private String hire;
        private String email;
        private String bodyheat;

    public Customer(String number, String name, String position, String department, String hire, String email,String address,String bodyheat) {
        this.number = number;
        this.name = name;
        this.position = position;
        this.department = department;
        this.hire = hire;
        this.email=email;
        this.address = address;
        this.bodyheat = bodyheat;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }




        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
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


        public String getHire() {
            return hire;
        }

        public void setHire(String hire) {
            this.hire = hire;
        }


    public String getBodyheat() {
        return bodyheat;
    }

    public void setBodyheat(String bodyheat) {
        this.bodyheat = bodyheat;
    }
}