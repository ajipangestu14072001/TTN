package com.example.ttn;

import androidx.annotation.NonNull;

public class PembayaranModel {
    private int id;
    private String tanggalBayar;
    private String waktuBayar;
    private String totalBayar;
    private String statusBayar;
    private String buktiBayar;

    public PembayaranModel(){

    }

    public PembayaranModel(int id, String tanggalBayar, String waktuBayar, String totalBayar, String statusBayar, String buktiBayar) {
        this.id = id;
        this.tanggalBayar = tanggalBayar;
        this.waktuBayar = waktuBayar;
        this.totalBayar = totalBayar;
        this.statusBayar = statusBayar;
        this.buktiBayar = buktiBayar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(String tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    public String getWaktuBayar() {
        return waktuBayar;
    }

    public void setWaktuBayar(String waktuBayar) {
        this.waktuBayar = waktuBayar;
    }

    public String getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }

    public String getBuktiBayar() {
        return buktiBayar;
    }

    public void setBuktiBayar(String buktiBayar) {
        this.buktiBayar = buktiBayar;
    }

    @NonNull
    @Override
    public String toString() {
        return "PembayaranModel{" +
                "id=" + id +
                ", tanggalBayar='" + tanggalBayar + '\'' +
                ", waktuBayar='" + waktuBayar + '\'' +
                ", totalBayar='" + totalBayar + '\'' +
                ", statusBayar='" + statusBayar + '\'' +
                ", buktiBayar='" + buktiBayar + '\'' +
                '}';
    }
}
