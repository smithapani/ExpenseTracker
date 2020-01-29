package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.DatePicker;
import android.app.DatePickerDialog;

import java.util.Date;

public class ExpenseActivity extends AppCompatActivity {
    private EditText edittext;
    private int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);

        year = 2019;
        month = 4;
        day = 28;

        addKeyListener();
    }

    private void addKeyListener() {

        edittext = (EditText) findViewById(R.id.mytext);

        // add a keylistener to monitor the keaybord avitvity...
        edittext.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                // if the users pressed a button and that button was "0"
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_0)) {

                    // display the input text....
                    Toast.makeText(ExpenseActivity.this,edittext.getText(), Toast.LENGTH_LONG).show();
                    return true;

                    // if the users pressed a button and that button was "9"
                } else if ((event.getAction() == KeyEvent.ACTION_DOWN)  && (keyCode == KeyEvent.KEYCODE_9)) {

                    // display message
                    Toast.makeText(ExpenseActivity.this, "Number 9 is pressed!", Toast.LENGTH_LONG).show();
                    return true;
                }

                return false;
            }
        });

    }
    public void ShowDatePicker(View view){
        DatePickerDialog dpd = new DatePickerDialog(ExpenseActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

            }
        }, year, month, day);

        //disaple future date
        dpd.getDatePicker().setMaxDate(new Date().getTime());
        dpd.show();
    }
}

