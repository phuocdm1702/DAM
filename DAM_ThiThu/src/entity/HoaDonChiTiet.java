/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTiet {
    private int idHDCT;
    private int spID;
    private int hdID;
    private Float giaHDCT;
    private int soLuongHDCT;
    private Float thanhTienHDCT;
    private int trangThaiHDCT;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Float giaHDCT, int soLuongHDCT, Float thanhTienHDCT) {
        this.giaHDCT = giaHDCT;
        this.soLuongHDCT = soLuongHDCT;
        this.thanhTienHDCT = thanhTienHDCT;
    }

    

    public int getIdHDCT() {
        return idHDCT;
    }

    public void setIdHDCT(int idHDCT) {
        this.idHDCT = idHDCT;
    }

    public int getSpID() {
        return spID;
    }

    public void setSpID(int spID) {
        this.spID = spID;
    }

    public int getHdID() {
        return hdID;
    }

    public void setHdID(int hdID) {
        this.hdID = hdID;
    }

    public Float getGiaHDCT() {
        return giaHDCT;
    }

    public void setGiaHDCT(Float giaHDCT) {
        this.giaHDCT = giaHDCT;
    }

    public int getSoLuongHDCT() {
        return soLuongHDCT;
    }

    public void setSoLuongHDCT(int soLuongHDCT) {
        this.soLuongHDCT = soLuongHDCT;
    }

    public Float getThanhTienHDCT() {
        return thanhTienHDCT;
    }

    public void setThanhTienHDCT(Float thanhTienHDCT) {
        this.thanhTienHDCT = thanhTienHDCT;
    }

    public int getTrangThaiHDCT() {
        return trangThaiHDCT;
    }

    public void setTrangThaiHDCT(int trangThaiHDCT) {
        this.trangThaiHDCT = trangThaiHDCT;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "idHDCT=" + idHDCT + ", spID=" + spID + ", hdID=" + hdID + ", giaHDCT=" + giaHDCT + ", soLuongHDCT=" + soLuongHDCT + ", thanhTienHDCT=" + thanhTienHDCT + ", trangThaiHDCT=" + trangThaiHDCT + '}';
    }
    
}
