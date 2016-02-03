package cs6242.westga.edu.patrickdeanactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE2 = "edu.westga.cs6242.patrickactivities.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.message1);
        textView.setTextSize(40);
        textView.setText(message);
    }

    public void showMessages(View v) {
        Intent intent = new Intent(this, DisplayAllMessages.class);
        TextView textView = (TextView) findViewById(R.id.message1);
        EditText editText = (EditText) findViewById(R.id.message2);
        String message = textView.getText().toString();
        intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
        message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message);
        startActivity(intent);
    }

}
