package com.example.kkiosks;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kkosks.R;


public class finish extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish);

        ImageButton imageButton45 = (ImageButton) findViewById(R.id.imageButton45);
        imageButton45.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                                 startActivity(intent);
                                             }
                                         }
        );
    }
}
