/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author ADMIN
 */
public class PhongBanModel {
    private String id;

    private String maPB;
    private String tenPB;
    private int trangThai;
    private int soLuongPB;
    private String maLPBID;
    private String tenLPB;

    public PhongBanModel() {
    }

    public PhongBanModel(String id, String maPB, String tenPB, int trangThai, int soLuongPB, String maLPBID, String tenLPB) {
        this.id = id;
        this.maPB = maPB;
        this.tenPB = tenPB;
        this.trangThai = trangThai;
        this.soLuongPB = soLuongPB;
        this.maLPBID = maLPBID;
        this.tenLPB = tenLPB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getMaPB() {
        return maPB;
    }

    public void setMaPB(String maPB) {
        this.maPB = maPB;
    }

    public String getTenPB() {
        return tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoLuongPB() {
        return soLuongPB;
    }

    public void setSoLuongPB(int soLuongPB) {
        this.soLuongPB = soLuongPB;
    }

    public String getMaLPBID() {
        return maLPBID;
    }

    public void setMaLPBID(String maLPBID) {
        this.maLPBID = maLPBID;
    }

    public String getTenLPB() {
        return tenLPB;
    }

    public void setTenLPB(String tenLPB) {
        this.tenLPB = tenLPB;
    }

    @Override
    public String toString() {
        return "PhongBanModel{" + "id=" + id + ", maPB=" + maPB + ", tenPB=" + tenPB + ", trangThai=" + trangThai + ", soLuongPB=" + soLuongPB + ", maLPBID=" + maLPBID + ", tenLPB=" + tenLPB + '}';
    }

    

    public Object[] toRowData() {
        return new Object[]{maPB, tenPB, trangThai, soLuongPB, maLPBID, tenLPB};
    }

}
