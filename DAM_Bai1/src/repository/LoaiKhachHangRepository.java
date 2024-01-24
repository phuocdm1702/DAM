/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Repository.DBConnect;
import entity.LoaiKH;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class LoaiKhachHangRepository {
    public List<LoaiKH> getAll(){
        List<LoaiKH> list = new ArrayList<>();
        String sql = """
                     SELECT [id]
                           ,[ten]
                       FROM [dbo].[LoaiKH]
                     """;
        try(Connection cnt = DBConnect.getConnection();PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiKH LKH = new LoaiKH();
                LKH.setId(rs.getString(1));
                LKH.setTen(rs.getString(2));
                list.add(LKH);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        List<LoaiKH> list1 = new LoaiKhachHangRepository().getAll();
        for (LoaiKH loaiKH : list1) {
            System.out.println(loaiKH.toString());
        }
    }
}
