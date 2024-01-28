/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.GiangVien;
import java.util.List;
import repository.GiangVienRepository;

/**
 *
 * @author ADMIN
 */
public class GiangVienService {

    GiangVienRepository repo = new GiangVienRepository();

    public List<GiangVien> getAll() {
        return repo.getAll();
    }

    public boolean add(GiangVien gv) {
        return repo.add(gv);
    }

    public boolean update(GiangVien gv, String newID) {
        return repo.update(gv, newID);
    }

    public List<GiangVien> sortNameAndBac() {
        return repo.sortNameAndBac();
    }

    public List<GiangVien> searchTen(String ten) {
        return repo.searchTen(ten);
    }

}
