package com.example.demo_du_an_mau.Sach;

public class Sach {
    private  int masach;
    private  String tensach;
    private  int giathu;
    private  int maloai;

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getGiathu() {
        return giathu;
    }

    public void setGiathu(int giathu) {
        this.giathu = giathu;
    }

    public int getMaloai() {
        return maloai;
    }

    public void setMaloai(int maloai) {
        this.maloai = maloai;
    }

    public Sach() {
    }

    public Sach(int masach, String tensach, int giathu, int maloai) {
        this.masach = masach;
        this.tensach = tensach;
        this.giathu = giathu;
        this.maloai = maloai;
    }
}
