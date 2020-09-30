package com.fitriasari.pert4_vsga_demo1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnclickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnclickme = findViewById(R.id.btnclickMe);
        btnclickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnclickme.setBackgroundColor(Color.RED);
                btnclickme.setTextColor(Color.WHITE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this,Menu1.class));
        }else if (item.getItemId()==R.id.menu2){
            startActivity(new Intent(this,Menu2.class));
        }else if (item.getItemId()==R.id.menu3){
            startActivity(new Intent(this,Menu3.class));
        }
        return true;
    }
}