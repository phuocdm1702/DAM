/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author ADMIN
 */
public class SachViewModel {

    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soLuong;
    private int giaTien;
    private String tenTheLoai;

    public SachViewModel() {
    }

    public SachViewModel(String maSach, String tenSach, String nhaXuatBan, int soLuong, int giaTien, String tenTheLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tenTheLoai = tenTheLoai;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    @Override
    public String toString() {
        return "SachViewModel{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", nhaXuatBan=" + nhaXuatBan + ", soLuong=" + soLuong + ", giaTien=" + giaTien + ", tenTheLoai=" + tenTheLoai + '}';
    }
    
    
}
