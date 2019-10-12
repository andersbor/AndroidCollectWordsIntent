package dk.easj.anbo.collectwordsintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<String> words = new ArrayList<>();
    // List<String> is not useful with intent.putExtra(...)
    private EditText wordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordField = findViewById(R.id.mainWordEditText);
    }

    public void clickedSave(View view) {
        String word = wordField.getText().toString();
        words.add(word);
    }

    public void clickedClear(View view) {
        words.clear();
        wordField.setText("");
    }

    public void clickedShow(View view) {
        wordField.setText("");
        Intent intent = new Intent(this, ShowActivity.class);
        intent.putExtra(ShowActivity.WORDS, words);
        startActivity(intent);
    }
}
