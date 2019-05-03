package com.example.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private RadioButton rbtngay;
    private RadioButton rbtnless;

    private CheckBox cbMauTim;
    private CheckBox cbMauHong;
    private CheckBox cbNoiTam;
    private CheckBox cbKhocTham;

    private ImageButton imgButton;


    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sologan = "";
                sologan = String.valueOf(tvName.getText());
                if(cbMauTim.isChecked()) {
                    sologan = sologan + cbMauTim.getText() + " - ";
                }
                if(cbMauHong.isChecked()) {
                    sologan = sologan + cbMauHong.getText() + " - ";
                }
                if(cbNoiTam.isChecked()) {
                    sologan = sologan + cbNoiTam.getText() + " - ";
                }
                if(cbKhocTham.isChecked()) {
                    sologan = sologan + cbKhocTham.getText() + " - ";
                }
                if(rbtnless.isChecked()){
                    sologan = sologan + rbtnless.getText() + " - ";
                }else {
                    sologan = sologan + rbtngay.getText() + " - ";
                }
                Toast.makeText(MainActivity.this, sologan, Toast.LENGTH_LONG).show();
            }});
    }
    public void initWidget() {
        tvName = (TextView) findViewById(R.id.tv_name);
        rbtngay = (RadioButton) findViewById(R.id.rbtn_gay);
        rbtnless = (RadioButton) findViewById(R.id.rbtn_less);

        cbMauTim = (CheckBox) findViewById(R.id.cb_mautim);
        cbMauHong = (CheckBox) findViewById(R.id.cb_thichmauhong);
        cbKhocTham = (CheckBox) findViewById(R.id.cb_khoctham);
        cbNoiTam = (CheckBox) findViewById(R.id.cb_noitam);
        imgButton = (ImageButton) findViewById(R.id.img_button);
    }
    }

