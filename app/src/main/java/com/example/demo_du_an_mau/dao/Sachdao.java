package com.example.demo_du_an_mau.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.demo_du_an_mau.Database.DbHelper;
import com.example.demo_du_an_mau.Sach.Sach;

import java.util.ArrayList;

public class Sachdao {
    DbHelper dbHelper;
    public Sachdao(Context context){
        dbHelper = new DbHelper(context);
    }
    public ArrayList<Sach> getDSDauSach(){
        ArrayList<Sach> list = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor =  sqLiteDatabase.rawQuery("Select * from Sach",null);
        if(cursor.getCount() != 0){
                cursor.moveToFirst();
                do {
                        list.add(new Sach(cursor.getInt(0),cursor.getString(1),cursor.getInt(2),cursor.getInt(3)));
                }while (cursor.moveToNext());
        }
        return  list;
    }
}
