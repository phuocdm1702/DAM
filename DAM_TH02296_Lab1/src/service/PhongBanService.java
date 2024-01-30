/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.PhongBan;
import java.util.List;
import repository.PhongBanRepository;
import viewmodel.PhongBanModel;

/**
 *
 * @author ADMIN
 */
public class PhongBanService {

    PhongBanRepository repo = new PhongBanRepository();

    public List<PhongBanModel> getAll() {
        return repo.getAll();
    }

    public boolean add(PhongBan pb) {
        return repo.add(pb);
    }

    public boolean update(PhongBan pb, String idnew) {
        return repo.update(pb, idnew);
    }

    public boolean delete(String id) {
        return repo.delete(id);
    }

}
