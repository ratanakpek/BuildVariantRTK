package com.number.ratanakpek.productflavorrtk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.number.ratanakpek.productflavorrtk.constant.ConstantRTK;

public class MainActivity extends AppCompatActivity {

    TextView tvExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvExample= (TextView) findViewById(R.id.tvExample);

        if(BuildConfig.FLAVOR.equals(ConstantRTK.DEVELOPMENT)){
            tvExample.setText(ConstantRTK.DEVELOPMENT);
        }else if(BuildConfig.FLAVOR.equals(ConstantRTK.PRODUCTION)){
            tvExample.setText(ConstantRTK.PRODUCTION);
        }else{
            tvExample.setText("Don't know too");
        }
    }
}
