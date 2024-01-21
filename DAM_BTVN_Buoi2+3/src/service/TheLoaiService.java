/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.TheLoai;
import java.util.List;
import repository.TheLoaiRepository;

/**
 *
 * @author ADMIN
 */
public class TheLoaiService {
    TheLoaiRepository repo = new TheLoaiRepository();
    public List<TheLoai> getAll(){
        return repo.getAll();
    }
}
