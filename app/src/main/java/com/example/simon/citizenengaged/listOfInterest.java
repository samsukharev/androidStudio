package com.example.simon.citizenengaged;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class listOfInterest extends Activity {

    public void BillsShown(View view){

    Animation buttonAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
    BounceInterpolator interpolator = new BounceInterpolator(0.3, 10);
        buttonAnim.setInterpolator(interpolator);
        buttonAnim.setAnimationListener(new Animation.AnimationListener()
    {
        public void onAnimationEnd(Animation animation)
        {
            Intent intent = new Intent(listOfInterest.this, Bills_Shown.class);
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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_interest);
    }
}
