package com.example.demo_du_an_mau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.demo_du_an_mau.dao.ThuThuDao;

public class Dang_Nhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        EditText edtuser = findViewById(R.id.editUser);
        EditText editPass = findViewById(R.id.editPass);
        Button btnLogin = findViewById(R.id.btnlogin);
        ThuThuDao thuThuDao = new ThuThuDao(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = edtuser.getText().toString();
                String pass = editPass.getText().toString();
                if(thuThuDao.checkDangNhap(user,pass)){
                    SharedPreferences sharedPreferences = getSharedPreferences("Thongtin",MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("matt",user);
                    editor.commit();
                    startActivity(new Intent(Dang_Nhap.this,MainActivity.class));
                }else{
                    Toast.makeText(Dang_Nhap.this,"Pass OR User not Pass",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}