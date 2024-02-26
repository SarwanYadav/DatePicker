package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    DatePicker calendarView;
    TextView textView;

    Button displayDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        calendarView = findViewById(R.id.calendarView);
        textView = findViewById(R.id.textView);
        displayDate = findViewById(R.id.button);


        textView.setText("Cureent Date: " + getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("change date :" + getCurrentDate());


            }


        });

    }


    private String getCurrentDate() {

        StringBuilder builder = new StringBuilder();
        builder.append(calendarView.getDayOfMonth() + "/");
        builder.append(calendarView.getMonth() + 1 + "/");
        builder.append(calendarView.getYear());
        return builder.toString();


    }

}
