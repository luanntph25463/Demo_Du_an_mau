package com.example.demo_du_an_mau.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.demo_du_an_mau.Database.DbHelper;
import com.example.demo_du_an_mau.Sach.PhieuMuon;
import com.example.demo_du_an_mau.Sach.Sach;

import java.util.ArrayList;

public class PhieuMuonDao {
    DbHelper dbHelper;
    public PhieuMuonDao
            (Context context){
        dbHelper = new DbHelper(context);
    }
    public ArrayList<PhieuMuon> getDSPhieuMuon(){
        ArrayList<PhieuMuon> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor =  sqLiteDatabase.rawQuery("SELECT pm.mapm, pm.matv, tv.hoten, pm.matt, tt.hoten, pm.masach, sc.tensach, pm.ngay, pm.trasach, pm.tienthue\n" +
                "FROM PHIEUMUON pm, THANHVIEN tv, THUTHU tt, SACH sc \n" +
                "WHERE pm.matv = tv.matv and pm.matt = tt.matt AND pm.masach = sc.masach",null);
        if(cursor.getCount() != 0){
            cursor.moveToFirst();
            do {
                list.add(new PhieuMuon(cursor.getInt(0),cursor.getInt(1),cursor.getString(2),cursor.getInt(3),cursor.getString(4),cursor.getInt(5),cursor.getInt(6),cursor.getString(7),cursor.getString(8),cursor.getString(9)));
            }while (cursor.moveToNext());
        }
        return  list;
    }
}
