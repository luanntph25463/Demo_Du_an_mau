package com.example.demo_du_an_mau.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.demo_du_an_mau.Database.DbHelper;

public class ThuThuDao {
    DbHelper dbHelper;
    public ThuThuDao(Context context){
        dbHelper = new DbHelper(context);
    }
    public  boolean checkDangNhap(String matt,String matkhau){
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT *  FROM THUTHU WHERE matt = ? and matkhau =?",new  String[]{matt,matkhau});
        if(cursor.getCount() !=0){
            return  true;
        }else {
            return false;
        }
    }
}
