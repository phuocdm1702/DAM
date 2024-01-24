/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.LoaiKH;
import java.util.List;
import repository.LoaiKhachHangRepository;

/**
 *
 * @author ADMIN
 */
public class LoaiKhachHangService {
    LoaiKhachHangRepository repo = new LoaiKhachHangRepository();
    
    public List<LoaiKH> getAll(){
        return repo.getAll();
    }
}
