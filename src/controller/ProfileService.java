/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.Profile;

/**
 *
 * @author Windows 10 Pro
 */
public interface ProfileService {
    List<Profile> getAll();
    String them(Profile pf);
    String sua(int index,Profile pf);
    String xoa(int index);
    void sapXep(List<Profile> pf);
    List<Profile> timKiem(String ten);
    String ghiFile(String path);
    String docFile(String path);
}
