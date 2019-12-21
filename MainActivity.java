package com.example.nil.phonesecure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.button11);
        b6.setOnClickListener(this);
        b7 = findViewById(R.id.button12);
        b7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = null;
        if (v.equals(b1)) {

            i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"));
        }
        if (v.equals(b2)) {
            i=new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:"));
            i.putExtra("sms_body","nilbit");

        }
        if (v.equals(b3)) {
            i=new Intent(MainActivity.this,MapsActivity.class);
        }
        if (v.equals(b4)) {
            i=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people"));

        }
        if (v.equals(b5)) {
            i=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:100"));
        }
        if (v.equals(b6)) {
            i=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:108"));
        }
        if (v.equals(b7)) {
            i=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:112"));
        }
        startActivity(i);
    }
}
