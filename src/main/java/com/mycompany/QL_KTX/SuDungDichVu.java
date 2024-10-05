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
    private int SoLanSuDung;

    public SuDungDichVu(String Id, String MaSV, String MaDV, Date NgaySuDung, int SoLanSuDung) {
        this.Id = Id;
        this.MaSV = MaSV;
        this.MaDV = MaDV;
        this.NgaySuDung = NgaySuDung;
        this.SoLanSuDung = SoLanSuDung;
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

    public int getSoLanSuDung() {
        return SoLanSuDung;
    }

    public void setSoLanSuDung(int SoLanSuDung) {
        this.SoLanSuDung = SoLanSuDung;
    }

    


    
    
}
