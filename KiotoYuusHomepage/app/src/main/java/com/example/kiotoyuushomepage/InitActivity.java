package com.example.kiotoyuushomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=findViewById(R.id.bt_first);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InitActivity.this,"喵喵喵？", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(InitActivity.this, MineActivity.class);
                startActivity(intent);
            }
        });

    }
}
