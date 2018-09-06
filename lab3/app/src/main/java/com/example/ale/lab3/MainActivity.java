package com.example.ale.lab3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.lab3.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1_vibrar  = (Button) findViewById(R.id.b1);

        b1_vibrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long pattern[]={0,200,100,300,400};

                Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(pattern,-1);

                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });


    }

    public void newActivityProx(View view){
        Intent intent = new Intent(this, ProximityActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "no esta cerca");
        startActivity(intent);

    }

    public void newActivityBar(View view){
        Intent intent = new Intent(MainActivity.this, BarNotiActivity.class);
        startActivity(intent);

    }
}
