package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int num,count;
    private TextView answer1,answer2;
    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1 = (TextView)findViewById(R.id.answer1);
        answer2 = (TextView)findViewById(R.id.answer2);
        bt1 = (Button)findViewById(R.id.One);
        bt2 = (Button)findViewById(R.id.Two);
        bt3 = (Button)findViewById(R.id.Three);
        bt4 = (Button)findViewById(R.id.Four);
        bt5 = (Button)findViewById(R.id.Five);
        bt6 = (Button)findViewById(R.id.Six);
        bt7 = (Button)findViewById(R.id.Seven);
        bt8 = (Button)findViewById(R.id.Eight);
        bt9 = (Button)findViewById(R.id.Nine);
        Random rand = new Random();
        num = rand.nextInt(10);
        if(num==0){
            num+=1;
        }
    }
    public void guess(int num,int buttonNum){
        count+=1;
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        if(num==buttonNum){
            answer1.setText("O");
            answer2.setText("猜對了！總共猜了"+count+"次");
            bt1.setEnabled(false);
            bt2.setEnabled(false);
            bt3.setEnabled(false);
            bt4.setEnabled(false);
            bt5.setEnabled(false);
            bt6.setEnabled(false);
            bt7.setEnabled(false);
            bt8.setEnabled(false);
            bt9.setEnabled(false);
        }
        else if(num<buttonNum){
            answer1.setText("X");
            intent.putExtra("wrong","太大！");
            startActivity(intent);
        }
        else if(num>buttonNum){
            answer1.setText("X");
            intent.putExtra("wrong","太小！");
            startActivity(intent);
        }
    }
    public void one(View view) {
        guess(num,1);
    }
    public void two(View view) {
        guess(num,2);
    }

    public void three(View view) {
        guess(num,3);
    }

    public void four(View view) {
        guess(num,4);
    }

    public void five(View view) {
        guess(num,5);
    }

    public void six(View view) {
        guess(num,6);
    }

    public void seven(View view) {
        guess(num,7);
    }

    public void eight(View view) {
        guess(num,8);
    }

    public void nine(View view) {
        guess(num,9);
    }

    public void restart(View view) {
        count=0;
        answer1.setText("");
        answer2.setText("");
        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(true);
        bt5.setEnabled(true);
        bt6.setEnabled(true);
        bt7.setEnabled(true);
        bt8.setEnabled(true);
        bt9.setEnabled(true);

    }
}