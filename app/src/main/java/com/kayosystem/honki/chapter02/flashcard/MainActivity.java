package com.kayosystem.honki.chapter02.flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Word dog;
    Word cat;
    Word bear;
    Word usa;

    LinearLayout container;
    TextView nameTextView;
    TextView nameTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout) findViewById(R.id.container);

        Word dog = new Word(R.drawable.dog, "犬");
        Word cat = new Word(R.drawable.cat, "猫");
        Word bear = new Word(R.drawable.bear, "熊");

        addWord(dog);
        addWord(cat);
        addWord(bear);


    }

    public void addWord(Word word) {
        LinearLayout layout = new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(getApplicationContext());
        nameTextView.setText(word.name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(word.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);

    }
}
