package com.example.kiotoyuushomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        Button bt=findViewById(R.id.others);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MineActivity.this,"不要老是想看女孩子的秘密啦", Toast.LENGTH_SHORT).show();
            }
        });
        Button bt1=findViewById(R.id.others1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MineActivity.this,"大灯蹄子出来挨打！", Toast.LENGTH_SHORT).show();
            }
        });
        Button bt2=findViewById(R.id.others2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MineActivity.this, "这真的只是一个超菜的作者", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL| Gravity.BOTTOM , 0, 0);
                LinearLayout layout = (LinearLayout) toast.getView();
                layout.setBackgroundColor(Color.GRAY);
                ImageView image = new ImageView(MineActivity.this);
                image.setImageResource(R.drawable.beg);
                layout.addView(image, 0);
                toast.show();
            }
        });
        Button bt3=findViewById(R.id.others3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MineActivity.this,"灰灰,下次再来哦", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_HORIZONTAL| Gravity.BOTTOM , 0, 0);
                LinearLayout layout = (LinearLayout) toast.getView();
                layout.setBackgroundColor(Color.GRAY);
                ImageView image = new ImageView(MineActivity.this);
                image.setImageResource(R.drawable.yuu_comic);
                layout.addView(image, 0);
                toast.show();
                Intent intent = new Intent(MineActivity.this, InitActivity.class);
                startActivity(intent);
            }
        });
    }
}
