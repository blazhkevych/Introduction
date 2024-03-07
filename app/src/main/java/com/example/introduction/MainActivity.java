package com.example.introduction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSendHello(View view) {
        ((TextView) findViewById(R.id.textView)).setText(((Button) view).getText().toString());
    }

    public void onClickSendBye(View view) {
        ((TextView) findViewById(R.id.textView)).setText(((Button) view).getText().toString());
    }
}