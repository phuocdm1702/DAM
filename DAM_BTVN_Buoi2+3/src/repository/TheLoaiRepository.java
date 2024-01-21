/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.TheLoai;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class TheLoaiRepository {

    public List<TheLoai> getAll() {
        List<TheLoai> list = new ArrayList<>();
        String sql = """
                     SELECT [ma_the_loai]
                           ,[ten_the_loai]
                       FROM [dbo].[the_loai]
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai TL = new TheLoai();
                TL.setMaTheLoai(rs.getString(1));
                TL.setTenTheLoai(rs.getString(2));
                list.add(TL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<TheLoai> list1 = new TheLoaiRepository().getAll();
        for (TheLoai theLoai : list1) {
            System.out.println(theLoai.toString());
        }
    }
}
