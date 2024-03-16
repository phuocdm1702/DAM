/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.HoaDonChiTiet;
import java.util.List;
import repository.HoaDonChiTietRepository;
import viewmodel.HoaDonChiTietViewmodel;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTietService {

    HoaDonChiTietRepository repo = new HoaDonChiTietRepository();

    public List<HoaDonChiTietViewmodel> getAll() {
        return repo.getAll();
    }

    public boolean add(HoaDonChiTiet HDCT, String maSP, String maHD) {
        return repo.add(HDCT, maSP, maHD);
    }

    public boolean xoa(int id) {
        return repo.xoa(id);
    }

    }
