/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.QL_KTX;

/**
 *
 * @author ADMIN
 */
public class Phong {
    private String soPhong; // Số phòng
    private String loaiPhong; // Loại phòng
    private String donGia; // Đơn giá
    private int soNguoiToiDa; // Số người tối đa trong phòng
    private int soNguoiHienTai; // Số người hiện tại trong phòng

    // Constructor không tham số
    public Phong() {
    }

    // Constructor đầy đủ tham số
    public Phong(String soPhong, String loaiPhong, String donGia, int soNguoiToiDa, int soNguoiHienTai) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.donGia = donGia;
        this.soNguoiToiDa = soNguoiToiDa;
        this.soNguoiHienTai = soNguoiHienTai;
    }

    // Getter và Setter cho từng thuộc tính

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }
    
    public int getSoNguoiHienTai() {
        return soNguoiHienTai;
    }
    
    public void setSoNguoiHienTai(int soNguoiHienTai) {
        this.soNguoiHienTai = soNguoiHienTai;
    }

    // Phương thức toString để hiển thị thông tin phòng
    @Override
    public String toString() {
        return "Phong{" +
                ", soPhong='" + soPhong + '\'' +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", donGia=" + donGia  + '\'' +
                ", soNguoiToiDa=" + soNguoiToiDa + '\'' +
                ", soNguoiHienTai=" + soNguoiHienTai +
                '}';
    }
}

