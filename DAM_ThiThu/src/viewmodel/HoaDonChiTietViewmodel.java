/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTietViewmodel {
    private int idCTSP;
    private String maSP;
    private String maHD;
    private String tenSP;
    private int soLuongCTSP;
    private Float gia;
    private int soLuongSP;
    private Float thanhTien;
    private int trangThai;

    public HoaDonChiTietViewmodel() {
    }

    public HoaDonChiTietViewmodel(int idCTSP, String maSP, String maHD, String tenSP, int soLuongCTSP, Float gia, int soLuongSP, Float thanhTien, int trangThai) {
        this.idCTSP = idCTSP;
        this.maSP = maSP;
        this.maHD = maHD;
        this.tenSP = tenSP;
        this.soLuongCTSP = soLuongCTSP;
        this.gia = gia;
        this.soLuongSP = soLuongSP;
        this.thanhTien = thanhTien;
        this.trangThai = trangThai;
    }

    public int getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(int idCTSP) {
        this.idCTSP = idCTSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuongCTSP() {
        return soLuongCTSP;
    }

    public void setSoLuongCTSP(int soLuongCTSP) {
        this.soLuongCTSP = soLuongCTSP;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChiTietSanPhamViewmodel{" + "idCTSP=" + idCTSP + ", maSP=" + maSP + ", maHD=" + maHD + ", tenSP=" + tenSP + ", soLuongCTSP=" + soLuongCTSP + ", gia=" + gia + ", soLuongSP=" + soLuongSP + ", thanhTien=" + thanhTien + ", trangThai=" + trangThai + '}';
    }
    
}
