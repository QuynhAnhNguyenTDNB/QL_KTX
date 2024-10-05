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
    private String LoaiVe;

    public Xe(String BienSo, String LoaiVe) {
        this.BienSo = BienSo;
        this.LoaiVe = LoaiVe;
    }
    
    

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    public String getLoaiVe() {
        return LoaiVe;
    }

    public void setLoaiVe(String LoaiVe) {
        this.LoaiVe = LoaiVe;
    }

    
    
}
