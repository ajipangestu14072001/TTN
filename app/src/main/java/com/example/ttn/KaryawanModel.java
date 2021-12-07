package com.example.ttn;

import androidx.annotation.NonNull;

public class KaryawanModel {
    private int id;
    private String namaKaryawan;
    private String alamatKaryawan;
    private String statusKaryawan;
    private String teleponKaryawan;
    private String passwordKaryawan;

    public KaryawanModel(){

    }

    public KaryawanModel(int id, String namaKaryawan, String alamatKaryawan, String statusKaryawan, String teleponKaryawan, String passwordKaryawan) {
        this.id = id;
        this.namaKaryawan = namaKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.statusKaryawan = statusKaryawan;
        this.teleponKaryawan = teleponKaryawan;
        this.passwordKaryawan = passwordKaryawan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public String getStatusKaryawan() {
        return statusKaryawan;
    }

    public void setStatusKaryawan(String statusKaryawan) {
        this.statusKaryawan = statusKaryawan;
    }

    public String getTeleponKaryawan() {
        return teleponKaryawan;
    }

    public void setTeleponKaryawan(String teleponKaryawan) {
        this.teleponKaryawan = teleponKaryawan;
    }

    public String getPasswordKaryawan() {
        return passwordKaryawan;
    }

    public void setPasswordKaryawan(String passwordKaryawan) {
        this.passwordKaryawan = passwordKaryawan;
    }

    @NonNull
    @Override
    public String toString() {
        return "KaryawanModel{" +
                "id='" + id + '\'' +
                ", namaKaryawan='" + namaKaryawan + '\'' +
                ", alamatKaryawan='" + alamatKaryawan + '\'' +
                ", statusKaryawan='" + statusKaryawan + '\'' +
                ", teleponKaryawan='" + teleponKaryawan + '\'' +
                ", passwordKaryawan='" + passwordKaryawan + '\'' +
                '}';
    }
}
