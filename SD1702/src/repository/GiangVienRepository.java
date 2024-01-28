/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.GiangVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class GiangVienRepository {

    public List<GiangVien> getAll() {
        List<GiangVien> list = new ArrayList<>();
        String sql = """
                    SELECT [id]
                          ,[ten_giang_vien]
                          ,[gioi_tinh]
                          ,[bac]
                          ,[nam_sinh]
                          ,[dia_chi]
                      FROM [dbo].[GiangVien]
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien giangVien = new GiangVien();
                giangVien.setId(rs.getString(1));
                giangVien.setTenGV(rs.getString(2));
                giangVien.setGioiTinh(rs.getBoolean(3));
                giangVien.setBac(rs.getInt(4));
                giangVien.setNamSinh(rs.getInt(5));
                giangVien.setDiaChi(rs.getString(6));
                list.add(giangVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean add(GiangVien gv) {
        int check = 0;
        if (gv.getTenGV().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên không được để trống!");
        }
        String sql = """
                    INSERT INTO [dbo].[GiangVien]
                               (
                               [ten_giang_vien]
                               ,[gioi_tinh]
                               ,[bac]
                               ,[nam_sinh]
                               ,[dia_chi])
                         VALUES
                    	 (?,?,?,?,?)
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, gv.getTenGV());
            ps.setObject(2, gv.isGioiTinh());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.getNamSinh());
            ps.setObject(5, gv.getDiaChi());
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(GiangVien gv, String newID) {
        int check = 0;
        String sql = """
                                        UPDATE [dbo].[GiangVien]
                                                   SET
                                                   [ten_giang_vien] =?
                                                   ,[gioi_tinh] =?
                                                   ,[bac] =?
                                                   ,[nam_sinh]=?
                                                   ,[dia_chi]=?
                     WHERE Id = ?
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, gv.getTenGV());
            ps.setObject(2, gv.isGioiTinh());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.getNamSinh());
            ps.setObject(5, gv.getDiaChi());
            ps.setObject(6, newID);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<GiangVien> sortNameAndBac() {
        List<GiangVien> list = new ArrayList<>();
        String sql = """
                    SELECT [id]
                          ,[ten_giang_vien]
                          ,[gioi_tinh]
                          ,[bac]
                          ,[nam_sinh]
                          ,[dia_chi]
                      FROM [dbo].[GiangVien]
                     ORDER BY ten_giang_vien ASC,bac DESC
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien giangVien = new GiangVien();
                giangVien.setId(rs.getString(1));
                giangVien.setTenGV(rs.getString(2));
                giangVien.setGioiTinh(rs.getBoolean(3));
                giangVien.setBac(rs.getInt(4));
                giangVien.setNamSinh(rs.getInt(5));
                giangVien.setDiaChi(rs.getString(6));
                list.add(giangVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<GiangVien> searchTen(String ten) {
        List<GiangVien> list = new ArrayList<>();
        String sql = """
                    SELECT [id]
                          ,[ten_giang_vien]
                          ,[gioi_tinh]
                          ,[bac]
                          ,[nam_sinh]
                          ,[dia_chi]
                      FROM [dbo].[GiangVien]
                     WHERE ten_giang_vien LIKE N'%'+?+'%'
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien giangVien = new GiangVien();
                giangVien.setId(rs.getString(1));
                giangVien.setTenGV(rs.getString(2));
                giangVien.setGioiTinh(rs.getBoolean(3));
                giangVien.setBac(rs.getInt(4));
                giangVien.setNamSinh(rs.getInt(5));
                giangVien.setDiaChi(rs.getString(6));
                list.add(giangVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<GiangVien> lists = new GiangVienRepository().getAll();
        for (GiangVien gv : lists) {
            System.out.println(gv.toString());
        }
    }
}
