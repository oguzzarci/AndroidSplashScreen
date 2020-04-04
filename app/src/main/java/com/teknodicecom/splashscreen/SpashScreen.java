package com.teknodicecom.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SpashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        Thread splashThread = new Thread(){
            public void run(){
                try{
                    //mikrosaniye türünden bekleme süresi belirlenir. 2000 = 2sn
                    sleep(9000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    //bekleme süresi bittikten sonra yani 2 saniye sonra MainActivity açacak.
                    Intent intent = new Intent(SpashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        // Thread methodunu burada çağırıyoruz.
        splashThread.start();



    }
}
