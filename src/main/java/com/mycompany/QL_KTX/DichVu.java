/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.QL_KTX;

/**
 *
 * @author ADMIN
 */
public class DichVu {
    private String MaDV; // MaDV
    private String TenDV; // TenDV
    private double donGia; // Đơn giá

    // Constructor không tham số
    public DichVu() {
    }

    // Constructor đầy đủ tham số
    public DichVu(String MaDV, String TenDV, double donGia) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.donGia = donGia;
    }

    // Getter và Setter cho từng thuộc tính

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }


    // Phương thức toString để hiển thị thông tin dịch vụ
    @Override
    public String toString() {
        return "Dich Vu{" +
                ", MaDV='" + MaDV + '\'' +
                ", TenDV='" + TenDV + '\'' +
                ", donGia=" + donGia  + '\'' +
                '}';
    }
}
