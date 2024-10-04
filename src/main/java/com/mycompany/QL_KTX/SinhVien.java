/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.QL_KTX;

/**
 *
 * @author badat
 */
public class SinhVien {
    private String maSv;
    private String soCmt;
    private String ngaySinh;  
    private String lop;
    private String queQuan;
    private String SoPhong;
    private String NgayVaoO;


    // Constructor không tham số
    public SinhVien() {
    }

    // Constructor đầy đủ tham số
    public SinhVien(String maSv, String soCmt, String ngaySinh, String lop, String queQuan, String SoPhong, String NgayVaoO) {
        this.maSv = maSv;
        this.soCmt = soCmt;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.queQuan = queQuan;
        this.SoPhong = SoPhong;
        this.NgayVaoO = NgayVaoO;
    }

    // Getter và Setter cho từng thuộc tính

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getSoCmt() {
        return soCmt;
    }

    public void setSoCmt(String soCmt) {
        this.soCmt = soCmt;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    
    public String getSoPhong() {
        return SoPhong;
    }

    public void setSoPhong(String SoPhong) {
        this.SoPhong = SoPhong;
    }
    
    public String getNgayVaoO() {
        return NgayVaoO;
    }

    public void setNgayVaoO(String NgayVaoO) {
        this.NgayVaoO = NgayVaoO;
    }

    // Override phương thức toString() để in thông tin sinh viên
    @Override
    public String toString() {
        return "SinhVien{" +
                ", maSv='" + maSv + '\'' +
                ", soCmt='" + soCmt + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", lop='" + lop + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", SoPhong='" + SoPhong + '\'' +
                ", NgayVaoO='" + NgayVaoO + '\'' +
                '}';
    }

    void addColumn(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addRow(Object[] object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
