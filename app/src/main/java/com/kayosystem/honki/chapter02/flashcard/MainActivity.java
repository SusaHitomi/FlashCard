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

        dog = new Word(R.drawable.dog,"犬");
        cat = new Word(R.drawable.cat,"猫");
        bear = new Word(R.drawable.bear,"熊");

        container = (LinearLayout) findViewById(R.id.container);

        //container.addView(nameTextView);

        LinearLayout layout = new LinearLayout(this.getApplicationContext());
        layout.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView = new TextView(getApplicationContext());
        nameTextView.setText(dog.name);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(dog.resId);

        layout.addView(imageView);
        layout.addView(nameTextView);

        container.addView(layout);




        LinearLayout layout2 = new LinearLayout(this.getApplicationContext());
        layout2.setOrientation(LinearLayout.HORIZONTAL);

        TextView nameTextView2 = new TextView(getApplicationContext());
        nameTextView2.setText(cat.name);

        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(cat.resId);

        layout2.addView(imageView2);
        layout2.addView(nameTextView2);

        container.addView(layout2);

    }
}
