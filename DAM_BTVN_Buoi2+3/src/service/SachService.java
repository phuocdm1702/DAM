/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Sach;
import java.util.List;
import repository.SachRepository;
import viewmodel.SachViewModel;

/**
 *
 * @author ADMIN
 */
public class SachService {

    SachRepository repo = new SachRepository();

    public List<SachViewModel> getAll() {
        return repo.getAll();
    }

    public boolean add(Sach sach) {
        return repo.add(sach);
    }

    public boolean delete(String ma) {
        return repo.delete(ma);
    }
    
    public List<SachViewModel> sapXep() {
        return repo.sapXep();
    }
    public List<SachViewModel> sachTreEm() {
        return repo.sachTreEm();
    }
    
    public List<SachViewModel> Top5() {
        return repo.Top5();
    }
    
    public List<SachViewModel> search(String tenTL) {
        return repo.search(tenTL);
    }
}
