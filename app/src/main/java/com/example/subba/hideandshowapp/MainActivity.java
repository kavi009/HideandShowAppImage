package com.example.subba.hideandshowapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.view.Window.FEATURE_NO_TITLE;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        final ToggleButton togglebutton=(ToggleButton) findViewById(R.id.toggleButton1);
        final ImageView img=(ImageView) findViewById(R.id.imageView1);
        Log.d("p","p1");
        togglebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Log.d("p","p2");
                int x;
                String flag=(String) togglebutton.getText();

                if(flag.equalsIgnoreCase("Hide Image"))
                {
                    img.setVisibility(View.VISIBLE);
                }
                else
                {
                    img.setVisibility(View.GONE);
                }

            }
        });

    }
}



