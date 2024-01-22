/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Lop {
    private String id;
    private String tenLop;

    public Lop() {
    }

    public Lop(String id, String maLopHoc) {
        this.id = id;
        this.tenLop = maLopHoc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaLopHoc() {
        return tenLop;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.tenLop = maLopHoc;
    }

    @Override
    public String toString() {
        return "Lop{" + "id=" + id + ", maLopHoc=" + tenLop + '}';
    }
    
}
