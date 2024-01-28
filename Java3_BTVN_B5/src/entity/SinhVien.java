/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien{
    private String maSV;
    private String ten;
    private int tuoi;
    private String monHocChinh;
    private String chuyenNganhHep;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, String monHocChinh, String chuyenNganhHep, boolean gioiTinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.monHocChinh = monHocChinh;
        this.chuyenNganhHep = chuyenNganhHep;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMonHocChinh() {
        return monHocChinh;
    }

    public void setMonHocChinh(String monHocChinh) {
        this.monHocChinh = monHocChinh;
    }

    public String getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public Object[] toRowData(){
        return new Object[]{this.maSV,this.ten,this.tuoi,this.monHocChinh,this.chuyenNganhHep,this.gioiTinh};
    }
}
