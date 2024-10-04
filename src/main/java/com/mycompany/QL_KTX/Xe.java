/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.QL_KTX;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Xe {
    private String BienSo;
    private Date NgayDangKy;

    public Xe(String BienSo, Date NgayDangKy) {
        this.BienSo = BienSo;
        this.NgayDangKy = NgayDangKy;
    }

    // Getters and setters
//    public String getMaSV() {
//        return MaSV; 
//    }
//    public void setMaSV(String MaSV) { 
//        this.MaSV = MaSV; 
//    }
    public String getBienSo() {
        return BienSo; 
    }
    public void setBienSo(String BienSo) {
        this.BienSo = BienSo; 
    }
    public Date getNgayDangKy() {
        return NgayDangKy; 
    }
    public void setNgayDangKy(Date NgayDangKy) { 
        this.NgayDangKy = NgayDangKy; 
    }
    // Phương thức toString để hiển thị thông tin xe
    @Override
    public String toString() {
        return "Xe{" +
                ", BienSo='" + BienSo + '\'' +
                ", NgayDangKy='" + NgayDangKy + '\'' +
                '}';
    }
}
