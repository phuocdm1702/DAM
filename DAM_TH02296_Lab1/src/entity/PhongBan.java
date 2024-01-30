/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class PhongBan {

    private String tenLPB;
    private String loaiPBID;
    private String ma;
    private String ten;
    private int soLuongPB;
    private int trangThai;

    public PhongBan() {
    }

    public PhongBan(String tenLPB, String loaiPBID, String ma, String ten, int soLuongPB, int trangThai) {
        this.tenLPB = tenLPB;
        this.loaiPBID = loaiPBID;
        this.ma = ma;
        this.ten = ten;
        this.soLuongPB = soLuongPB;
        this.trangThai = trangThai;
    }

    public String getTenLPB() {
        return tenLPB;
    }

    public void setTenLPB(String tenLPB) {
        this.tenLPB = tenLPB;
    }

    public String getLoaiPBID() {
        return loaiPBID;
    }

    public void setLoaiPBID(String loaiPBID) {
        this.loaiPBID = loaiPBID;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuongPB() {
        return soLuongPB;
    }

    public void setSoLuongPB(int soLuongPB) {
        this.soLuongPB = soLuongPB;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "PhongBan{" + "tenLPB=" + tenLPB + ", loaiPBID=" + loaiPBID + ", ma=" + ma + ", ten=" + ten + ", soLuongPB=" + soLuongPB + ", trangThai=" + trangThai + '}';
    }
    
}
