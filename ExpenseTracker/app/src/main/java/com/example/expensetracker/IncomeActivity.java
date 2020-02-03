package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.DatePicker;
import android.app.DatePickerDialog;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;


import android.os.Bundle;

public class IncomeActivity extends AppCompatActivity {

    private EditText edittext;
    private int year, month, date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        year = Calendar.getInstance().get(Calendar.YEAR);
        month = Calendar.getInstance().get(Calendar.MONTH);
        date = Calendar.getInstance().get(Calendar.DATE);
    }

    private void addKeyListener() {

        edittext = (EditText) findViewById(R.id.income);
    }

    public void addExpense(View view) {
        //get a reference of expense
        EditText expense = findViewById(R.id.income);

        expense.setInputType(InputType.TYPE_CLASS_NUMBER);

    }

    public void ShowDatePicker(View view) {
        DatePickerDialog dpd = new DatePickerDialog(IncomeActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int Year, int Month, int Date) {

            }
        }, year, month, date);
        //disaple future date
        dpd.getDatePicker().setMaxDate(new Date().getTime());
        dpd.show();
    }
}

