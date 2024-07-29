/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addRow_Table;

import java.io.Serializable;

/**
 *
 * @author hieuvo
 */
public class Student implements Serializable{
    private String msv,name,className;
    private double diem;

    public Student(String msv, String name, double diem) {
        this.msv = msv;
        this.name = name;
        this.diem = diem;
    }

    public Student(String msv, String name, String className, double diem) {
        this.msv = msv;
        this.name = name;
        this.className = className;
        this.diem = diem;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }


}
