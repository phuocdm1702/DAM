/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SinhVienService {

    private List<SinhVien> listSV = new ArrayList<>();

    public List<SinhVien> getAll() {
        return listSV;
    }

    public SinhVienService() {
        listSV.add(new SinhVien("SV01", "Đinh Mạnh Phước", 17, "Java", "AI", true));
        listSV.add(new SinhVien("SV02", "Nguễn Hữu Huân", 20, "Python", "IS", false));
        listSV.add(new SinhVien("SV03", "Lê Quang Phúc", 18, "Java", "JS", true));
        listSV.add(new SinhVien("SV04", "Nguyễn Thị An", 21, "Java", "JS", false));
        listSV.add(new SinhVien("SV05", "Nguyễn Duy Nam", 19, "Python", "IS", true));
    }
    
    public String addData(SinhVien sinhVien){
        if(sinhVien == null){
            return"add thất bại!";
        }
        listSV.add(sinhVien);
        return"add thành công.";
    }
    
    public String updateData(int index, SinhVien newSinhVien){
        if(newSinhVien == null){
            return"Update thất bại!";
        }
        listSV.set(index, newSinhVien);
        return"Update thành công.";
    }
    
    public void removeDate(int index){
        listSV.remove(index);
    }
    
   public List<SinhVien> getChuyenNganh(){
       List<SinhVien> listCN = new ArrayList<>();
       for (SinhVien sinhVien : listSV) {
           if(sinhVien.getChuyenNganhHep().equalsIgnoreCase("JS")){
               listCN.add(sinhVien);
           }
       }
       return listCN;
   }
}
