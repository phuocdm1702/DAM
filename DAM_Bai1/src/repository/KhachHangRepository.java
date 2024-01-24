/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Repository.DBConnect;
import entity.KhachHang;
import java.util.ArrayList;
import java.util.List;
import viewmodel.KhachHangViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class KhachHangRepository {

    public List<KhachHangViewModel> getAll() {
        List<KhachHangViewModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.KhachHang.maKH, dbo.KhachHang.ten, dbo.KhachHang.tuoi, dbo.KhachHang.gioi_tinh, dbo.LoaiKH.ten AS TenLoaiKH
                     FROM   dbo.KhachHang INNER JOIN dbo.LoaiKH ON dbo.KhachHang.loaiKH_ID = dbo.LoaiKH.id
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangViewModel KHVD = new KhachHangViewModel();
                KHVD.setMaKH(rs.getString(1));
                KHVD.setTenKH(rs.getString(2));
                KHVD.setTuoi(rs.getInt(3));
                KHVD.setGioiTinh(rs.getBoolean(4));
                KHVD.setTenLoaiKH(rs.getString(5));
                list.add(KHVD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean add(KhachHang KH) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[KhachHang]
                     ([maKH]
                      ,[ten]
                      ,[tuoi]
                      ,[gioi_tinh]
                      ,[loaiKH_ID])
                       VALUES(?,?,?,?,?)
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, KH.getMaKH());
            ps.setObject(2, KH.getTen());
            ps.setObject(3, KH.getTuoi());
            ps.setObject(4, KH.isGioiTinh());
            ps.setObject(5, KH.getLoaiKH_ID());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(KhachHang KH, String maNew) {
        int check = 0;
        String sql = """
                     UPDATE [dbo].[KhachHang]
                        SET 
                            [ten] = ?
                           ,[tuoi] = ?
                           ,[gioi_tinh] = ?
                           ,[loaiKH_ID] = ?
                      WHERE [maKH] = ?
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, KH.getTen());
            ps.setObject(2, KH.getTuoi());
            ps.setObject(3, KH.isGioiTinh());
            ps.setObject(4, KH.getLoaiKH_ID());
            ps.setObject(5, maNew);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public boolean delete(String ma) {
        int check = 0;
        String sql = """
                     DELETE FROM [dbo].[KhachHang]
                           WHERE [maKH] = ?
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {

            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public List<KhachHangViewModel> sapXep() {
        List<KhachHangViewModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.KhachHang.maKH, dbo.KhachHang.ten, dbo.KhachHang.tuoi, dbo.KhachHang.gioi_tinh, dbo.LoaiKH.ten AS TenLoaiKH
                     FROM   dbo.KhachHang INNER JOIN dbo.LoaiKH ON dbo.KhachHang.loaiKH_ID = dbo.LoaiKH.id
                     ORDER BY dbo.KhachHang.ten ASC
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangViewModel KHVD = new KhachHangViewModel();
                KHVD.setMaKH(rs.getString(1));
                KHVD.setTenKH(rs.getString(2));
                KHVD.setTuoi(rs.getInt(3));
                KHVD.setGioiTinh(rs.getBoolean(4));
                KHVD.setTenLoaiKH(rs.getString(5));
                list.add(KHVD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<KhachHangViewModel> search(int max, int min) {
        List<KhachHangViewModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.KhachHang.maKH, dbo.KhachHang.ten, dbo.KhachHang.tuoi, dbo.KhachHang.gioi_tinh, dbo.LoaiKH.ten AS TenLoaiKH
                     FROM   dbo.KhachHang INNER JOIN dbo.LoaiKH ON dbo.KhachHang.loaiKH_ID = dbo.LoaiKH.id
                     WHERE dbo.KhachHang.tuoi >=? AND dbo.KhachHang.tuoi <= ? 
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, min);
            ps.setObject(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangViewModel KHVD = new KhachHangViewModel();
                KHVD.setMaKH(rs.getString(1));
                KHVD.setTenKH(rs.getString(2));
                KHVD.setTuoi(rs.getInt(3));
                KHVD.setGioiTinh(rs.getBoolean(4));
                KHVD.setTenLoaiKH(rs.getString(5));
                list.add(KHVD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<KhachHangViewModel> list1 = new KhachHangRepository().getAll();
        for (KhachHangViewModel khachHangViewModel1 : list1) {
            System.out.println(khachHangViewModel1.toString());
        }
    }
}
