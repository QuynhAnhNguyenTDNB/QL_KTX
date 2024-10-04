/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.QL_KTX;

/**
 *
 * @author Admin
 */
import java.util.Date;

public class Khach {
    private String SoCMT;
    private String TenKhach;
    private Date NgaySinh;
    private String MaSV;
    private Date NgayTham;

    public Khach( String TenKhach, String SoCMT, Date NgaySinh, String MaSV, Date NgayTham) {
        this.SoCMT = SoCMT;
        this.TenKhach = TenKhach;
        this.NgaySinh = NgaySinh;
        this.MaSV = MaSV;
        this.NgayTham = NgayTham;
    }

    // Getters and setters
    public String getSoCMT() {
        return SoCMT; 
    }
    public void setSoCMT(String SoCMT) { 
        this.SoCMT = SoCMT; 
    }
    public String getTenKhach() {
        return TenKhach; 
    }
    public void setTenKhach(String TenKhach) {
        this.TenKhach = TenKhach; 
    }
    public Date getNgaySinh() {
        return NgaySinh; 
    }
    public void setNgaySinh(Date NgaySinh) { 
        this.NgaySinh = NgaySinh; 
    }
    public String getMaSV() {
        return MaSV; 
    }
    public void setMaSV(String MaSV) {
        this.MaSV = MaSV; 
    }
    public Date getNgayTham() {
        return NgayTham; 
    }
    public void setNgayTham(Date NgayTham) {
        this.NgayTham = NgayTham; 
    }
}

