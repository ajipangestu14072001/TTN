package com.example.ttn;

public class PemesananModel {
    private int id;
    private String kuatitasPemesanan;
    private String tanggalePemesanan;
    private String waktuPemesanan;
    private String statusPemesanan;

    public PemesananModel(int id, String kuatitasPemesanan, String tanggalePemesanan, String waktuPemesanan, String statusPemesanan) {
        this.id = id;
        this.kuatitasPemesanan = kuatitasPemesanan;
        this.tanggalePemesanan = tanggalePemesanan;
        this.waktuPemesanan = waktuPemesanan;
        this.statusPemesanan = statusPemesanan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKuatitasPemesanan() {
        return kuatitasPemesanan;
    }

    public void setKuatitasPemesanan(String kuatitasPemesanan) {
        this.kuatitasPemesanan = kuatitasPemesanan;
    }

    public String getTanggalePemesanan() {
        return tanggalePemesanan;
    }

    public void setTanggalePemesanan(String tanggalePemesanan) {
        this.tanggalePemesanan = tanggalePemesanan;
    }

    public String getWaktuPemesanan() {
        return waktuPemesanan;
    }

    public void setWaktuPemesanan(String waktuPemesanan) {
        this.waktuPemesanan = waktuPemesanan;
    }

    public String getStatusPemesanan() {
        return statusPemesanan;
    }

    public void setStatusPemesanan(String statusPemesanan) {
        this.statusPemesanan = statusPemesanan;
    }

    @Override
    public String toString() {
        return "PemesananModel{" +
                "id=" + id +
                ", kuatitasPemesanan='" + kuatitasPemesanan + '\'' +
                ", tanggalePemesanan='" + tanggalePemesanan + '\'' +
                ", waktuPemesanan='" + waktuPemesanan + '\'' +
                ", statusPemesanan='" + statusPemesanan + '\'' +
                '}';
    }
}
