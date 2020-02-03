package com.example.expensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    String EmailHolder;
    TextView Email;
    Button LogOUT, Home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Email = (TextView) findViewById(R.id.textView1);
        LogOUT = (Button) findViewById(R.id.button1);
        Home = (Button) findViewById(R.id.button2);
        final Intent intent = getIntent();

        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(MainActivity.UserEmail);

        // Setting up received email to TextView.
        Email.setText(Email.getText().toString() + EmailHolder);
        //change
        // Adding click listener to Log Out button.

        
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Finishing current DashBoard activity on button click.
                finish();
                //Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
                //startActivity(intent);
                Toast.makeText(DashboardActivity.this, "Log Out Successfull", Toast.LENGTH_LONG).show();

            }
        });


                //Finishing current DashBoard activity on button click.


    Home.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick (View v){
            //finish();
            Intent intent = new Intent(DashboardActivity.this,HomeActivity.class);
            startActivity(intent);
            Toast.makeText(DashboardActivity.this, "Welcome", Toast.LENGTH_LONG).show();

         }
    });
}
}

