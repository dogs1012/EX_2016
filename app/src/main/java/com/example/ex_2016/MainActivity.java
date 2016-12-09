package com.example.ex_2016;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button BTN1, BTN2, BTN3,BTN4;
    CalendarView cal;
    LinearLayout LL1, LL2;
    RadioGroup RG,RG2;
    RadioButton RB1,RB2,RB3,RB4,RB5;
    ImageView IV;
    EditText ET1,ET2,ET3;
    FrameLayout FL;
    Switch SH1;
    TimePicker TP1;
    boolean BL1,BL2;
    TextView TV1,TV2,TV3;
    Chronometer CR;
    FrameLayout FM;
    int num1,num2,num3, p1,p2,p3;
    int hap =0;
    int hap2;

    void init()
    {

        this.ET1.setText("");
        this.ET2.setText("");
        this.ET3.setText("");
        this.RB1.setChecked(true);
        this.RB2.setChecked(true);
        this.IV.setImageResource(R.drawable.s1);
        this.TV1.setText("총 명수:");
        this.TV2.setText("할인금액:");
        this.TV3.setText("결제금액:");
        this.BL1 = false;
        this.BL2 = false;
    }

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

        RG2= (RadioGroup)findViewById(R.id.RG2);
        RB1=(RadioButton)findViewById(R.id.radioButton3);
        RB2=(RadioButton)findViewById(R.id.radioButton5);
        RB3=(RadioButton)findViewById(R.id.radioButton4);

        FM =(FrameLayout)findViewById(R.id.Frame);
        ET1=(EditText) findViewById(R.id.editText);
        ET2=(EditText) findViewById(R.id.editText2);
        ET3=(EditText) findViewById(R.id.editText3);
        TV1 =(TextView)findViewById(R.id.textView8);
        TV2 =(TextView)findViewById(R.id.textView9);
        TV3 =(TextView)findViewById(R.id.textView10);
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

        RG = (RadioGroup) findViewById(R.id.RG);

        RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                     public void onCheckedChanged(RadioGroup radioGroup, int i) {
                              IV.setImageResource(R.drawable.s1);
                               if (RB1.isChecked()) {
                                      IV.setImageResource(R.drawable.s1);
                                 } else if (RB2.isChecked()) {
                                     IV.setImageResource(R.drawable.s2);
                                 } else if (RB3.isChecked()) {
                                    IV.setImageResource(R.drawable.s3);
                                }
                           }
                });
                BTN2 = (Button) findViewById(R.id.button4);


                BTN2.setOnClickListener(new View.OnClickListener() {
                     @Override
                    public void onClick(View view) {
                            LL1.setVisibility(View.INVISIBLE);
                             LL2.setVisibility(View.VISIBLE);
                         }
                  });


        TP1 =(TimePicker)findViewById(R.id.timePicker);
             cal  = (CalendarView) findViewById(R.id.calendarView);
            RB4 =(RadioButton)findViewById(R.id.radioButton11);
         RB5 =(RadioButton)findViewById(R.id.radioButton10);
        RB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                                if (RB4.isChecked()) {
                                     cal.setVisibility(View.VISIBLE);
                                  TP1.setVisibility(View.INVISIBLE);
                                    }
                          }
                    });
               RB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                     @Override
                       public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                            if (RB5.isChecked()) {
                                     TP1.setVisibility(View.VISIBLE);
                                    cal.setVisibility(View.INVISIBLE);
                                   }
                           }
                   });







    }




}
