package com.example.sanchit.switchactivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle data=getIntent().getExtras();
        if(data==null)
        {
            return;
        }
        String first= data.getString("First");
        final TextView scndText= (TextView) findViewById(R.id.textView);
        scndText.setText(first);



    }

}
