package kr.hs.emirim.dahoe0304.monchicken;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);  //Activity를 실행할때는 intent가 꼭 필요!
                overridePendingTransition(0,R.anim.zoom_exit);
                finish();   //현재액티비티를 소멸시킴
            }
        }, 3000);
    }
}