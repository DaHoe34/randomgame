package kr.hs.emirim.dahoe0304.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);   //event handle(?)

    }
    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /**  '자바독입니다' 라고 표시해줌
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {  //버튼을 눌렀을때 자동으로 호출됨.
        String name = mName.getText().toString();
//       /* if(name==null){
//            Toast.makeText(this, "이름을 입력해 주세요!! ", Toast.LENGTH_LONG).show();  //show는 보여주는 역할
//        }else{
//          Toast.makeText(this, name + "씨,배가 고파용....", Toast.LENGTH_LONG).show();  //show는 보여주는 역할
//            Intent intent = new Intent(this,ResultActivity.class);
//            startActivity(intent);
//        }
//        */
        try{
            Toast.makeText(this, name + "씨,배가 고파용....", Toast.LENGTH_LONG).show();  //show는 보여주는 역할
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",10);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);   //페이지 전환 효과 오른쪽으로 슬라이드 되고, 나갈때는 반대로!
        }
        catch (NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요!! ", Toast.LENGTH_LONG).show();  //show는 보여주는 역할
        }
        catch (Exception e){
            Toast.makeText(this, "뭔지 모르겠지만 잘 안됩니다..", Toast.LENGTH_LONG).show();  //show는 보여주는 역할
        }
    }
}