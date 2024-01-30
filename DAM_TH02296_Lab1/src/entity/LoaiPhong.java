/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.math.BigDecimal;

/**
 *
 * @author ADMIN
 */
public class LoaiPhong {
    private String id;
    private String ma;
    private String ten;
    private float donGiaTheoGio;
    private float donGiaQuaNgay;
    private float donGiaQuaDem;
    private int soNguoi;
    private String ghiChu;
    private float tienQuaGio;
    private int trangThai;

    public LoaiPhong() {
    }

    public LoaiPhong(String id, String ma, String ten, float donGiaTheoGio, float donGiaQuaNgay, float donGiaQuaDem, int soNguoi, String ghiChu, float tienQuaGio, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.donGiaTheoGio = donGiaTheoGio;
        this.donGiaQuaNgay = donGiaQuaNgay;
        this.donGiaQuaDem = donGiaQuaDem;
        this.soNguoi = soNguoi;
        this.ghiChu = ghiChu;
        this.tienQuaGio = tienQuaGio;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public float getDonGiaTheoGio() {
        return donGiaTheoGio;
    }

    public void setDonGiaTheoGio(float donGiaTheoGio) {
        this.donGiaTheoGio = donGiaTheoGio;
    }

    public float getDonGiaQuaNgay() {
        return donGiaQuaNgay;
    }

    public void setDonGiaQuaNgay(float donGiaQuaNgay) {
        this.donGiaQuaNgay = donGiaQuaNgay;
    }

    public float getDonGiaQuaDem() {
        return donGiaQuaDem;
    }

    public void setDonGiaQuaDem(float donGiaQuaDem) {
        this.donGiaQuaDem = donGiaQuaDem;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public float getTienQuaGio() {
        return tienQuaGio;
    }

    public void setTienQuaGio(float tienQuaGio) {
        this.tienQuaGio = tienQuaGio;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "LoaiPhong{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", donGiaTheoGio=" + donGiaTheoGio + ", donGiaQuaNgay=" + donGiaQuaNgay + ", donGiaQuaDem=" + donGiaQuaDem + ", soNguoi=" + soNguoi + ", ghiChu=" + ghiChu + ", tienQuaGio=" + tienQuaGio + ", trangThai=" + trangThai + '}';
    }

    
    
    
}
