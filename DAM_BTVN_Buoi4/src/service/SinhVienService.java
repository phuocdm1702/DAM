/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.SinhVien;
import java.util.List;
import repository.SinhVienRepository;
import viewmodel.SinhVienViewModel;

/**
 *
 * @author ADMIN
 */
public class SinhVienService {

    SinhVienRepository repo = new SinhVienRepository();

    public List<SinhVienViewModel> getAll() {
        return repo.getAll();
    }

    public boolean add(SinhVien sv) {
        return repo.add(sv);
    }

    public boolean update(SinhVien sv, String maNew) {
        return repo.update(sv, maNew);
    }

    public boolean delete(String ma) {
        return repo.delete(ma);
    }

    public List<SinhVienViewModel> getSD1702() {
        return repo.getSD1702();
    }

    public List<SinhVienViewModel> getTop5() {
        return repo.getTop5();
    }

    public List<SinhVienViewModel> sapXep() {
        return repo.sapXep();
    }
    
        public List<SinhVienViewModel> searchByTenLop(String tenlop) {
            return repo.searchByTenLop(tenlop);
        }


}
