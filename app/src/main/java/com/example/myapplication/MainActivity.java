package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
    public void updateCounter(View view) {
        count++;
        TextView countView = findViewById(R.id.a1_textView_counter);
        countView.setText(String.valueOf(count));
    }
    public void goToActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void goToActivity3(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}