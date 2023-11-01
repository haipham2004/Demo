/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Windows 10 Pro
 */
public class Profile implements Serializable{
    private String hoTen;
    private float thuNhap;
    private String nhomMau;
    private String queQuan;

    public Profile() {
    }

    public Profile(String hoTen, float thuNhap, String nhomMau, String queQuan) {
        this.hoTen = hoTen;
        this.thuNhap = thuNhap;
        this.nhomMau = nhomMau;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(float thuNhap) {
        this.thuNhap = thuNhap;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    
    public Object[] toData(){
        return new Object[]{
            this.hoTen,this.thuNhap,this.nhomMau,this.queQuan
        };
    }
}
