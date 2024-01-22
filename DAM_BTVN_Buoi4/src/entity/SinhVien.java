/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    private String maSV;
    private String ten;
    private String cmnd;
    private String sdt;
    private String email;
    private String maLop;
    private String userName;
    private int gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, String cmnd, String sdt, String email, String maLop, String userName, int gioiTinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.maLop = maLop;
        this.userName = userName;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", ten=" + ten + ", cmnd=" + cmnd + ", sdt=" + sdt + ", email=" + email + ", maLop=" + maLop + ", userName=" + userName + ", gioiTinh=" + gioiTinh + '}';
    }
   
}
