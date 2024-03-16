/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private int idHoaDon;
    private String maHD;
    private int tongTienHD;
    private int trangThaiHD;

    public HoaDon() {
    }

    public HoaDon(int idHoaDon, String maHD, int tongTienHD, int trangThaiHD) {
        this.idHoaDon = idHoaDon;
        this.maHD = maHD;
        this.tongTienHD = tongTienHD;
        this.trangThaiHD = trangThaiHD;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getTongTienHD() {
        return tongTienHD;
    }

    public void setTongTienHD(int tongTienHD) {
        this.tongTienHD = tongTienHD;
    }

    public int getTrangThaiHD() {
        return trangThaiHD;
    }

    public void setTrangThaiHD(int trangThaiHD) {
        this.trangThaiHD = trangThaiHD;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "idHoaDon=" + idHoaDon + ", maHD=" + maHD + ", tongTienHD=" + tongTienHD + ", trangThaiHD=" + trangThaiHD + '}';
    }
    
}
