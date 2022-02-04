package softcampus.co.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Campaign_registration extends AppCompatActivity {

    TextView regi_bar;
    ImageView regi_line;
    TextView regi_name;
    EditText regi_name_input;
    TextView regi_token;
    EditText regi_token_input;
    TextView regi_exp;
    EditText regi_exp_input;
    Button regi_btn;

    private int GET_GALLERY_IMAGE = 200;
    private ImageView imageview;

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
        imageview = (ImageView) findViewById(R.id.imageview);
        regi_btn = (Button) findViewById(R.id.regi_btn);

        regi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"캠페인이 등록되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        imageview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);
                intent. setDataAndType(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivityForResult(intent, GET_GALLERY_IMAGE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GET_GALLERY_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {

            Uri selectedImageUri = data.getData();
            imageview.setImageURI(selectedImageUri);

        }

    }
}