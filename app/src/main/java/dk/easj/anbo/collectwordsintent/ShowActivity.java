package dk.easj.anbo.collectwordsintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class ShowActivity extends AppCompatActivity {
    public static final String WORDS = "words";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = getIntent(); // the intent that brought us to this activity
        List<String> words = intent.getStringArrayListExtra(WORDS);
        TextView textView = findViewById(R.id.showMessageTextView);
        if (words.isEmpty()) {
            textView.setTypeface(null, Typeface.ITALIC);
            textView.setText("empty");
        }
      else {
            textView.setTypeface(null, Typeface.NORMAL);
            textView.setText(words.toString());
        }
    }

    public void buttonBackClicked(View view) {
        finish(); // back to calling activity
    }
}
