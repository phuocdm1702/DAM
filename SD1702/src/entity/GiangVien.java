/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class GiangVien {
    private String id;
    private String tenGV;
    private boolean gioiTinh;
    private int bac;
    private int namSinh;
    private String diaChi;

    public GiangVien() {
    }

    public GiangVien(String id, String tenGV, boolean gioiTinh, int bac, int namSinh, String diaChi) {
        this.id = id;
        this.tenGV = tenGV;
        this.gioiTinh = gioiTinh;
        this.bac = bac;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "id=" + id + ", tenGV=" + tenGV + ", gioiTinh=" + gioiTinh + ", bac=" + bac + ", namSinh=" + namSinh + ", diaChi=" + diaChi + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{id,tenGV,bac,diaChi,gioiTinh,namSinh};
    }
}
