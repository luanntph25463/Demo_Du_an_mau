package com.example.demo_du_an_mau.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "Đăng Ký Môn Học", (SQLiteDatabase.CursorFactory)null, 1);
    }

    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String dbThuThu = "CREATE TABLE THUTHU(matt text primary key,hoten  text, matkhau text)";
        sqLiteDatabase.execSQL(dbThuThu);
        String dbThanhVien = "CREATE TABLE THANHVIEN(matv integer primary key autoincrement,hoten  text, namsinh text)";
        sqLiteDatabase.execSQL(dbThanhVien);
        String dbLoai = "CREATE TABLE LOAISACH(maloai integer primary key autoincrement,tenloai text)";
        sqLiteDatabase.execSQL(dbLoai);
        String dbSach = "CREATE TABLE SACH(masach integer primary key autoincrement,tensach text,giathue integer,maloai integer references LOAISACH(maloai))";
        sqLiteDatabase.execSQL(dbSach);
        String dbPhieuMuon = "CREATE TABLE PHIEUMUON(mapm integer primary key autoincrement,matv integer references THANHVIEN(matv),matt text references THUTHU(matt),masach integer references SACH(masach),ngay text,tienthu integer)";
        sqLiteDatabase.execSQL(dbPhieuMuon);
        sqLiteDatabase.execSQL("INSERT INTO LOAISACH VALUES (1,'thiếu nhi'),(2,'thiếu niên'),(3,'thiếu giáo khoa')");
        sqLiteDatabase.execSQL("INSERT INTO SACH VALUES (1,'hãy đợi đấy',2500,1)");
        sqLiteDatabase.execSQL("INSERT INTO THUTHU VALUES ('thuthu1','abc','abc')");
        sqLiteDatabase.execSQL("INSERT INTO PHIEUMUON VALUES (1,1,'thuthu01', 1, '19/03/2022', 1, 2500),(2,1,'thuthu01', 3, '19/03/2022', 0, 2000),(3,2,'thuthu02', 1, '19/03/2022', 1, 2000)");
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if (i != i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS THUTHU");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS THANHVIEN");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS LOAISACH");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SACH");
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS PHIEUMUON");
            this.onCreate(sqLiteDatabase);
        }

    }
}
