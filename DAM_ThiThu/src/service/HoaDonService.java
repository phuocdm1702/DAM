/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.HoaDon;
import java.util.List;
import repository.HoaDonRepository;

/**
 *
 * @author ADMIN
 */
public class HoaDonService {

    HoaDonRepository repo = new HoaDonRepository();

    public List<HoaDon> getAll() {
        return repo.getAll();
    }

}
