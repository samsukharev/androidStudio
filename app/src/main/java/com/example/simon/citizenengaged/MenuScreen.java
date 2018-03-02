package com.example.simon.citizenengaged;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

import static com.example.simon.citizenengaged.R.id.zipCodeInput;

public class MenuScreen extends AppCompatActivity implements View.OnClickListener {

    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        editText = (EditText)findViewById(zipCodeInput);
        editText.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // Auto-generated method stub
        editText.setText("");
    }

    public void repScreen(View view) {

        Button repButton = (Button) findViewById(R.id.repButton);
        Animation buttonAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        BounceInterpolator interpolator = new BounceInterpolator(0.3, 10);
        buttonAnim.setInterpolator(interpolator);
        buttonAnim.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation)
            {
                String zipInput = editText.getText().toString();
                Intent intent = new Intent(MenuScreen.this, RepsScreen.class);

                intent.putExtra("zipCodeInput", zipInput);
                startActivity(intent);
            }

            public void onAnimationRepeat(Animation animation)
            {
                // Do nothing!
            }

            public void  onAnimationStart(Animation animation)
            {
                // Do nothing!
            }
        });
        view.startAnimation(buttonAnim);
    }
    public void issuesScreen(View view) {
        Button issuesButton = (Button) findViewById(R.id.issuesButton);
        Animation buttonAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        BounceInterpolator interpolator = new BounceInterpolator(0.3, 10);
        buttonAnim.setInterpolator(interpolator);
        buttonAnim.setAnimationListener(new Animation.AnimationListener()
        {
            public void onAnimationEnd(Animation animation)
            {
                Intent intent = new Intent(MenuScreen.this, listOfInterest.class);
                startActivity(intent);
            }

            public void onAnimationRepeat(Animation animation)
            {
                // Do nothing!
            }

            public void  onAnimationStart(Animation animation)
            {
                // Do nothing!
            }
        });
        view.startAnimation(buttonAnim);
    }
}

