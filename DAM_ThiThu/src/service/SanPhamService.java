/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.SanPham;
import java.util.List;
import repository.SanPhamRepository;

/**
 *
 * @author ADMIN
 */
public class SanPhamService {

    SanPhamRepository repo = new SanPhamRepository();

    public List<SanPham> getAll() {
        return repo.getAll();
    }

}
