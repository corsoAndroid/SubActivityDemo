package com.example.sdoro.subactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText(R.string.lancia);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSubActivity();
            }
        });
        setContentView(button);
    }
    private void startSubActivity() {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }
}
