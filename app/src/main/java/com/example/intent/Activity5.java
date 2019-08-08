package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity implements View.OnClickListener{

    Button cungur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        cungur = (Button) findViewById(R.id.cungur);
        cungur.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cungur:
                Intent explicit = new Intent(Activity5.this, Activity6.class);
                startActivity(explicit);
                break;

        }
    }

}
