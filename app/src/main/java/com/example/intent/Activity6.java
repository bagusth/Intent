package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    public class Activity6 extends AppCompatActivity implements View.OnClickListener{

        Button hiih;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_6);
            hiih = (Button) findViewById(R.id.bodo);
            hiih.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.bodo:
                    Intent explicit = new Intent(Activity6.this, MainActivity.class);
                    startActivity(explicit);
                    break;

            }
        }

    }
