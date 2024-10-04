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
public class SuDungDichVu {
    private String Id;
    private String MaSV;
    private String MaDV;
    private Date NgaySuDung;

    public SuDungDichVu(String Id, String MaSV, String MaDV, Date NgaySuDung) {
        this.Id = Id;
        this.MaSV = MaSV;
        this.MaDV = MaDV;
        this.NgaySuDung = NgaySuDung;
    }
    
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public Date getNgaySuDung() {
        return NgaySuDung;
    }

    public void setNgaySuDung(Date NgaySuDung) {
        this.NgaySuDung = NgaySuDung;
    }


    
    
}
