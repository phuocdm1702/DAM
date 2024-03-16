/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int idSP;
    private int spID;
    private String maSP;
    private String tenSP;
    private int soLuongSP;
    private Float gia;
    private String mieuTa;

    public SanPham() {
    }

    public SanPham(int idSP, int spID, String maSP, String tenSP, int soLuongSP, Float gia, String mieuTa) {
        this.idSP = idSP;
        this.spID = spID;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuongSP = soLuongSP;
        this.gia = gia;
        this.mieuTa = mieuTa;
    }

   

    public int getIdSP() {
        return idSP;
    }

    public void setIdSP(int idSP) {
        this.idSP = idSP;
    }

    public int getSpID() {
        return spID;
    }

    public void setSpID(int spID) {
        this.spID = spID;
    }

    

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }

    @Override
    public String toString() {
        return "SanPham{" + "idSP=" + idSP + ", spID=" + spID + ", maSP=" + maSP + ", tenSP=" + tenSP + ", soLuongSP=" + soLuongSP + ", gia=" + gia + ", mieuTa=" + mieuTa + '}';
    }


    
    
}
