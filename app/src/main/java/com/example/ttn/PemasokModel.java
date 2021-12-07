package com.example.ttn;

import androidx.annotation.NonNull;

public class PemasokModel {
    private int id;
    private String namaPemasok;
    private String alamatPemasok;
    private String teleponPemasok;
    private String statusPemasok;
    private String passwordPemasok;
    private String aktivasiPemasok;

    public PemasokModel(){

    }

    public PemasokModel(int id, String namaPemasok, String alamatPemasok, String teleponPemasok, String statusPemasok, String passwordPemasok, String aktivasiPemasok) {
        this.id = id;
        this.namaPemasok = namaPemasok;
        this.alamatPemasok = alamatPemasok;
        this.teleponPemasok = teleponPemasok;
        this.statusPemasok = statusPemasok;
        this.passwordPemasok = passwordPemasok;
        this.aktivasiPemasok = aktivasiPemasok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPemasok() {
        return namaPemasok;
    }

    public void setNamaPemasok(String namaPemasok) {
        this.namaPemasok = namaPemasok;
    }

    public String getAlamatPemasok() {
        return alamatPemasok;
    }

    public void setAlamatPemasok(String alamatPemasok) {
        this.alamatPemasok = alamatPemasok;
    }

    public String getTeleponPemasok() {
        return teleponPemasok;
    }

    public void setTeleponPemasok(String teleponPemasok) {
        this.teleponPemasok = teleponPemasok;
    }

    public String getStatusPemasok() {
        return statusPemasok;
    }

    public void setStatusPemasok(String statusPemasok) {
        this.statusPemasok = statusPemasok;
    }

    public String getPasswordPemasok() {
        return passwordPemasok;
    }

    public void setPasswordPemasok(String passwordPemasok) {
        this.passwordPemasok = passwordPemasok;
    }

    public String getAktivasiPemasok() {
        return aktivasiPemasok;
    }

    public void setAktivasiPemasok(String aktivasiPemasok) {
        this.aktivasiPemasok = aktivasiPemasok;
    }
    @NonNull
    @Override
    public String toString() {
        return "PemasokModel{" +
                "id=" + id +
                ", namaPemasok='" + namaPemasok + '\'' +
                ", alamatPemasok='" + alamatPemasok + '\'' +
                ", teleponPemasok='" + teleponPemasok + '\'' +
                ", statusPemasok='" + statusPemasok + '\'' +
                ", passwordPemasok='" + passwordPemasok + '\'' +
                ", aktivasiPemasok='" + aktivasiPemasok + '\'' +
                '}';
    }
}
