package com.example.ex_2016;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Button BTN1, BTN2, BTN3,BTN4;
    LinearLayout LL1, LL2;
    RadioGroup RG,RG2;
    RadioButton RB1,RB2,RB3;
    ImageView IV;
    EditText ET1,ET2,ET3;
    FrameLayout FL;
    Switch SH1;
    TimePicker TP1;
    boolean BL1,BL2;
    TextView TV1,TV2,TV3;
    Chronometer CR;
    FrameLayout FM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SH1 =(Switch)findViewById(R.id.switch1);
        CR =(Chronometer)findViewById(R.id.chro2);
        BTN1=(Button)findViewById(R.id.button4);
        BTN2=(Button)findViewById(R.id.button5);
        BTN3=(Button)findViewById(R.id.button6);
        BTN3=(Button)findViewById(R.id.button7);
        LL1 =(LinearLayout)findViewById(R.id.LL1);
        LL2 =(LinearLayout)findViewById(R.id.LL2);
        RG= (RadioGroup)findViewById(R.id.RG);
        RG2= (RadioGroup)findViewById(R.id.RG2);
        RB1=(RadioButton)findViewById(R.id.radioButton3);
        RB2=(RadioButton)findViewById(R.id.radioButton5);
        RB3=(RadioButton)findViewById(R.id.radioButton4);
        FM =(FrameLayout)findViewById(R.id.Frame);
        SH1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true){
                        FM.setVisibility(View.VISIBLE);
                    CR.setBase(SystemClock.elapsedRealtime());
                    CR.start();
                    CR.setTextColor(Color.BLUE);

                } else {

                    FM.setVisibility(View.INVISIBLE);
                    CR.stop();
                    CR.setBase(SystemClock.elapsedRealtime());

                }
            }
        });




    }





}
