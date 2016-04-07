package kr.hs.emirim.dahoe0304.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator18 on 2016. 3. 28..
 */
public class ResultActivity  extends AppCompatActivity {
    static String TAG="먼치킨:ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!!");

        mResult = (TextView) findViewById(R.id.result);
        mImageView=(ImageView)findViewById(R.id.imageView2);

        Log.d(TAG,"텍스트뷰, 이미지뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(3);
        Log.d(TAG,"랜덤값 생성 : "+result);
        //1번째방법 if방법
        /*if(result==0){
            mImageView.setImageResource(R.drawable.g03);
        }else if(result==1){
            mImageView.setImageResource(R.drawable.g04);
        }else if(result==2){
            mImageView.setImageResource(R.drawable.g05);
        }
        */
        mImageView.setImageResource(R.drawable.g03+result);
        //2번째 방법 switch

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");  //name을 불러오기
        Log.d(TAG,"인텐트값 읽기(name) : "+name);

        int age=intent.getIntExtra("age",-1);
        Log.d(TAG,"인텐트값 읽기(age) : "+age);

        mResult.setText(name + "님, 안녕하세요:D");

        ImageView mImageView = (ImageView)findViewById(R.id.imageView2);
    }
}
