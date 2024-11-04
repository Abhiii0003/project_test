package digi.pankaj.gamingmaster.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import digi.pankaj.gamingmaster.MainActivity;
import digi.pankaj.gamingmaster.R;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        },3000);

    }
}