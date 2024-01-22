/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author ADMIN
 */
public class SinhVienViewModel {

    private String maSV;
    private String ten;
    private int gioiTinh;
    private String sdt;
    private String email;
    private String tenLop;

    public SinhVienViewModel() {
    }

    public SinhVienViewModel(String maSV, String ten, int gioiTinh, String sdt, String email, String tenLop) {
        this.maSV = maSV;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.tenLop = tenLop;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "SinhVienViewModel{" + "maSV=" + maSV + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", email=" + email + ", tenLop=" + tenLop + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{maSV,ten,gioiTinh,sdt,email,tenLop};
    }
}
