package madbarsoft.com.computershortquestionforitjob;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeSplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(WelcomeSplashScreenActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
