/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Profile;

/**
 *
 * @author Windows 10 Pro
 */
public class ProfileImp implements ProfileService {

    List<Profile> listProfile = new ArrayList<>();

    public ProfileImp() {
        listProfile.add(new Profile("Phạm Ngọc Hai", 17000, "A", "Ninh Binh"));
        listProfile.add(new Profile("Hoang Minh Tam", 17000, "B", "Nghe An"));
        listProfile.add(new Profile("Nguyen Tuan Khanh", 17000, "A", "Ha Noi"));
        listProfile.add(new Profile("Le Tien Dung", 17000, "O", "Thai Binh"));
        listProfile.add(new Profile("Mai Van Anh", 17000, "AB", "Nam Dinh"));
    }

    @Override
    public List<Profile> getAll() {
        return listProfile;
    }

    @Override
    public String them(Profile pf) {
        listProfile.add(pf);
        return "Thêm Ok";
    }

    @Override
    public String sua(int index, Profile pf) {
        listProfile.set(index, pf);
        return "Sửa Ok";
    }

    @Override
    public String xoa(int index) {
        listProfile.remove(index);
        return "Xóa Ok";
    }

    @Override
    public void sapXep(List<Profile> pf) {
        Collections.sort(listProfile, new Comparator<Profile>() {
            @Override
            public int compare(Profile o1, Profile o2) {
                return o2.getHoTen().compareTo(o1.getHoTen());
            }

        });
    }

    @Override
    public List<Profile> timKiem(String ten) {
        List<Profile> listTam = new ArrayList<>();
        for (Profile profile : listProfile) {
            if (profile.getNhomMau().equalsIgnoreCase(ten)) {
                listTam.add(profile);
            }
        }
        return listTam;
    }

    @Override
    public String ghiFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProfile);
            oos.close();
            fos.close();
            return "Ghi Ok";
        } catch (Exception e) {
            return "Ghi that bai";
        }
    }

    @Override
    public String docFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            listProfile = (List<Profile>) ois.readObject();
            ois.close();
            fis.close();
            return "Đọc Ok";
        } catch (Exception e) {
            return "Đọc that bai";
        }
    }

}
