package com.example.kkiosks;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kkosks.R;

public class flavor extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flavor);

        ImageButton imageButton40 = (ImageButton)findViewById(R.id.imageButton40);
        imageButton40.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent intent = new Intent(getApplicationContext(), money.class);
                                                 startActivity(intent);
                                             }
                                         }
        );
    }
}


