/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class KhachHang {

    private String maKH;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private int loaiKH_ID;

    public KhachHang() {
    }

    public KhachHang(String maKH, String ten, int tuoi, boolean gioiTinh, int loaiKH_ID) {
        this.maKH = maKH;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.loaiKH_ID = loaiKH_ID;
    }

    

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getLoaiKH_ID() {
        return loaiKH_ID;
    }

    public void setLoaiKH_ID(int loaiKH_ID) {
        this.loaiKH_ID = loaiKH_ID;
    }

    

}
