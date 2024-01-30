/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.LoaiPhong;
import java.util.List;
import repository.LoaiPhongRepository;

/**
 *
 * @author ADMIN
 */
public class LoaiPhongService {

    LoaiPhongRepository repo = new LoaiPhongRepository();

    public List<LoaiPhong> getAll() {
        return repo.getAll();
    }

}
