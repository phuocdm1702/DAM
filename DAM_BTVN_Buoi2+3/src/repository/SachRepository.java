/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Sach;
import java.util.ArrayList;
import java.util.List;
import viewmodel.SachViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class SachRepository {

    public List<SachViewModel> getAll() {
        List<SachViewModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.sach.ma_sach, dbo.sach.ten_sach, dbo.sach.nha_xuat_ban, dbo.sach.so_luong, dbo.sach.gia_tien, dbo.the_loai.ten_the_loai
                     FROM   dbo.sach INNER JOIN
                                  dbo.the_loai ON dbo.sach.ma_the_loai = dbo.the_loai.ma_the_loai
                     """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachViewModel SVM = new SachViewModel();
                SVM.setMaSach(rs.getString(1));
                SVM.setTenSach(rs.getString(2));
                SVM.setNhaXuatBan(rs.getString(3));
                SVM.setSoLuong(rs.getInt(4));
                SVM.setGiaTien(rs.getInt(5));
                SVM.setTenTheLoai(rs.getString(6));
                list.add(SVM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean add(Sach sach) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[sach]
                                ([ma_sach]
                                ,[ten_sach]
                                ,[ma_the_loai]
                                ,[so_luong]
                                ,[gia_tien]
                                ,[nha_xuat_ban])
                          VALUES
                                (?,?,?,?,?,?)
                     """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, sach.getMaSach());
            ps.setObject(2, sach.getTenSach());
            ps.setObject(3, sach.getMaTheLoai());
            ps.setObject(4, sach.getSoLuong());
            ps.setObject(5, sach.getGiaTien());
            ps.setObject(6, sach.getNhaXuatBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        int check = 0;
        String sql = """
                     DELETE FROM [dbo].[sach]
                                 WHERE ma_sach = ?
                     """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<SachViewModel> sapXep() {
        List<SachViewModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.sach.ma_sach, dbo.sach.ten_sach, dbo.sach.nha_xuat_ban, dbo.sach.so_luong, dbo.sach.gia_tien, dbo.the_loai.ten_the_loai
                     FROM   dbo.sach INNER JOIN dbo.the_loai ON dbo.sach.ma_the_loai = dbo.the_loai.ma_the_loai
                       ORDER BY [gia_tien] DESC
                     """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachViewModel SVM = new SachViewModel();
                SVM.setMaSach(rs.getString(1));
                SVM.setTenSach(rs.getString(2));
                SVM.setNhaXuatBan(rs.getString(3));
                SVM.setSoLuong(rs.getInt(4));
                SVM.setGiaTien(rs.getInt(5));
                SVM.setTenTheLoai(rs.getString(6));
                list.add(SVM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SachViewModel> sachTreEm() {
        List<SachViewModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.sach.ma_sach, dbo.sach.ten_sach, dbo.sach.nha_xuat_ban, dbo.sach.so_luong, dbo.sach.gia_tien, dbo.the_loai.ten_the_loai
                     FROM   dbo.sach INNER JOIN dbo.the_loai ON dbo.sach.ma_the_loai = dbo.the_loai.ma_the_loai
                     WHERE the_loai.ma_the_loai LIKE 'S3'
                     """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachViewModel SVM = new SachViewModel();
                SVM.setMaSach(rs.getString(1));
                SVM.setTenSach(rs.getString(2));
                SVM.setNhaXuatBan(rs.getString(3));
                SVM.setSoLuong(rs.getInt(4));
                SVM.setGiaTien(rs.getInt(5));
                SVM.setTenTheLoai(rs.getString(6));
                list.add(SVM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SachViewModel> Top5() {
        List<SachViewModel> list = new ArrayList<>();
        String sql = """
                 SELECT TOP 5 dbo.sach.ma_sach, dbo.sach.ten_sach, dbo.sach.nha_xuat_ban, dbo.sach.so_luong, dbo.sach.gia_tien, dbo.the_loai.ten_the_loai
                                  FROM   dbo.sach INNER JOIN dbo.the_loai ON dbo.sach.ma_the_loai = dbo.the_loai.ma_the_loai
                                  ORDER BY dbo.sach.so_luong ASC
                 """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SachViewModel SVM = new SachViewModel();
                SVM.setMaSach(rs.getString(1));
                SVM.setTenSach(rs.getString(2));
                SVM.setNhaXuatBan(rs.getString(3));
                SVM.setSoLuong(rs.getInt(4));
                SVM.setGiaTien(rs.getInt(5));
                SVM.setTenTheLoai(rs.getString(6));
                list.add(SVM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<SachViewModel> search(String tenTL) {
        List<SachViewModel> list = new ArrayList<>();
        String sql = """
                SELECT dbo.sach.ma_sach, dbo.sach.ten_sach, dbo.sach.nha_xuat_ban, dbo.sach.so_luong, dbo.sach.gia_tien, dbo.the_loai.ten_the_loai
                FROM   dbo.sach INNER JOIN dbo.the_loai ON dbo.sach.ma_the_loai = dbo.the_loai.ma_the_loai
                WHERE dbo.the_loai.ten_the_loai = ?
                 """;

        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, tenTL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SachViewModel SVM = new SachViewModel();
                SVM.setMaSach(rs.getString(1));
                SVM.setTenSach(rs.getString(2));
                SVM.setNhaXuatBan(rs.getString(3));
                SVM.setSoLuong(rs.getInt(4));
                SVM.setGiaTien(rs.getInt(5));
                SVM.setTenTheLoai(rs.getString(6));
                list.add(SVM);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<SachViewModel> list1 = new SachRepository().getAll();
        for (SachViewModel sachViewModel : list1) {
            System.out.println(sachViewModel.toString());
        }
    }
}
