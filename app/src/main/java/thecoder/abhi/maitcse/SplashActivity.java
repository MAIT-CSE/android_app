package thecoder.abhi.maitcse;


import android.app.ActivityOptions;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;


public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final View view = LayoutInflater.from(this).inflate(R.layout.activity_splash,
                null);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                Intent login = new Intent(SplashActivity.this, LoginActivity.class);
                ActivityOptions options = ActivityOptions.makeScaleUpAnimation(view, 0,
                        0, view.getWidth(), view.getHeight());
                startActivity(login,  options.toBundle());
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
