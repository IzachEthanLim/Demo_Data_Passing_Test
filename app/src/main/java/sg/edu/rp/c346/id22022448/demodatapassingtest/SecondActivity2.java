package sg.edu.rp.c346.id22022448.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'p');
        tvAnswer.setText("Character value received is: " + value);
    }
}