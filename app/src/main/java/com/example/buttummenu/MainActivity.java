package com.example.buttummenu;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FrameLayout Home_frame,Dashbord_frame,Login_fram;
    private HomeFrag homeFrag;
    private DashbordFrag dashbordFrag;
    private LoginFrag loginFrag;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Home_frame=findViewById(R.id.Home_frag);
        Dashbord_frame=findViewById(R.id.Dashbord_frag);
        Login_fram=findViewById(R.id.Login_frag);
        bottomNavigationView=findViewById(R.id.menu);
        SrartFagment();




    }
    private void SrartFagment(){
        homeFrag=new HomeFrag();
        dashbordFrag=new DashbordFrag();
        loginFrag=new LoginFrag();
        getSupportFragmentManager().beginTransaction().replace(R.id.Home_frag,homeFrag).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.Dashbord_frag,dashbordFrag).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.Login_frag,loginFrag).commit();
        Dashbord_frame.setVisibility(View.INVISIBLE);
        Login_fram.setVisibility(View.INVISIBLE);
        


    }
}