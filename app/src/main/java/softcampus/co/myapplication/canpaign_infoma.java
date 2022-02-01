package softcampus.co.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class canpaign_infoma extends AppCompatActivity {

    ImageView cam_img;
    TextView cam_name;
    TextView cam_wri;
    TextView cam_info;
    TextView goal_token;
    TextView goal_token_text;
    Button do_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canpaign_infoma);

        cam_img = (ImageView) findViewById(R.id.cam_img);
        cam_name = (TextView) findViewById(R.id.cam_name);
        cam_wri = (TextView) findViewById(R.id.cam_wri);
        cam_info = (TextView) findViewById(R.id.cam_info);
        goal_token = (TextView) findViewById(R.id.goal_token);
        do_btn = (Button) findViewById(R.id.do_btn);

    }
}