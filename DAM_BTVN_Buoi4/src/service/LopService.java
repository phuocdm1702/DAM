/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Lop;
import java.util.List;
import repository.LopRepository;

/**
 *
 * @author ADMIN
 */
public class LopService {
    LopRepository repo = new LopRepository();
    public List<Lop> getAll(){
        return repo.getAll();
    }
}
