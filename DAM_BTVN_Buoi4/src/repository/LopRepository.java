/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Lop;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class LopRepository {
    public List<Lop> getAll(){
        List<Lop> list = new ArrayList<>();
        String sql ="""
                    SELECT [id]
                          ,[ma_lop]
                      FROM [dbo].[Lop]
                    """;
        try(Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Lop lop = new Lop();
                lop.setId(rs.getString(1));
                lop.setMaLopHoc(rs.getString(2));
                list.add(lop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        List<Lop> list1 = new LopRepository().getAll();
        for (Lop lop : list1) {
            System.out.println(lop.toString());
        }
    }
}
