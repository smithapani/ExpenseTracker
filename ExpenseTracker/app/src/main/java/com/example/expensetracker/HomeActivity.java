package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button Dbutton,Ebutton,Ibutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        addListenerOnButton();
    }

    private void addListenerOnButton() {

        Dbutton = (Button) findViewById(R.id.simpleButton1);
        Ebutton = (Button) findViewById(R.id.simpleButton2);
        Ibutton = (Button) findViewById(R.id.simpleButton3);

        Ebutton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ExpenseActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Add your expense here", Toast.LENGTH_LONG).show();
            }
        });

        Ibutton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, IncomeActivity.class);
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Add your income here", Toast.LENGTH_LONG).show();
            }
        });

        }
    }
