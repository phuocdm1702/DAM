/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.KhachHang;
import entity.LoaiKH;
import java.util.List;
import repository.KhachHangRepository;
import viewmodel.KhachHangViewModel;

/**
 *
 * @author ADMIN
 */
public class KhachHangService {
    KhachHangRepository repo = new KhachHangRepository();
    
    public List<KhachHangViewModel> getAll(){
        return repo.getAll();
    }
    public boolean add(KhachHang KH) {
        return repo.add(KH);
    }
    public boolean update(KhachHang KH, String maNew) {
        return repo.update(KH, maNew);
    }
    public boolean delete(String ma) {
        return repo.delete(ma);
    }
    public List<KhachHangViewModel> sapXep() {
        return repo.sapXep();
    }
    public List<KhachHangViewModel> search(int max, int min) {
        return repo.search(max, min);
    }
}
