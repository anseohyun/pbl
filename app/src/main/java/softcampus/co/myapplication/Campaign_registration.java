package softcampus.co.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Campaign_registration extends AppCompatActivity {

    TextView regi_bar;
    ImageView regi_line;
    TextView regi_name;
    EditText regi_name_input;
    TextView regi_token;
    EditText regi_token_input;
    TextView regi_exp;
    EditText regi_exp_input;
    Button regi_img;
    Button regi_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_registration);

        regi_bar = (TextView) findViewById(R.id.regi_bar);
        regi_line = (ImageView) findViewById(R.id.regi_line);
        regi_name = (TextView) findViewById(R.id.regi_name);
        regi_name_input = (EditText) findViewById(R.id.regi_name_input);
        regi_token = (TextView) findViewById(R.id.regi_token);
        regi_token_input = (EditText) findViewById(R.id.regi_token_input);
        regi_exp = (TextView) findViewById(R.id.regi_exp);
        regi_exp_input = (EditText) findViewById(R.id.regi_exp_input);
        regi_img = (Button) findViewById(R.id.regi_img);
        regi_btn = (Button) findViewById(R.id.regi_btn);


    }
}