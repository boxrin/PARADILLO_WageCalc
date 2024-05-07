package com.example.wagecalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    TextView Pagename;
    TextView sign;
    EditText HourRate;
    EditText WeeklyHours;
    Button Calculate;
    TextView Weekly;
    TextView Monthly;
    TextView Yearly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pagename = (TextView) findViewById(R.id.txtPagename);
        sign = (TextView) findViewById(R.id.txtsign);
        HourRate = (EditText) findViewById(R.id.txtHourrate);
        WeeklyHours = (EditText) findViewById(R.id.txtDaysweek);
        Calculate = (Button) findViewById(R.id.btnCalculate);
        Weekly = (TextView) findViewById(R.id.txtWeekly);
        Monthly = (TextView) findViewById(R.id.textMonthly);
        Yearly = (TextView) findViewById(R.id.txtYearly);

        Calculate.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hours= Double.parseDouble(WeeklyHours.getText().toString());
                double payrate = Double.parseDouble(HourRate.getText().toString());

                int PRweekly = (int) ((int) hours*payrate);
                int PRyearly = (int) ((int) hours*payrate*52);
                int PRmontly = (int) (PRyearly/12);


                String DoneWeekly = String.valueOf(PRweekly);
                String DoneMonthly = String.valueOf(PRmontly);
                String DoneYearly = String.valueOf(PRyearly);

                Weekly.setText(DoneWeekly+" PHP");
                Monthly.setText(DoneMonthly+" PHP");
                Yearly.setText(DoneYearly+" PHP");
            }
        }));

    }
}