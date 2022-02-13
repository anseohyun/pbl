package softcampus.co.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyPage extends AppCompatActivity {

    private View view;

    TextView username;
    ImageView owntoken_btn;
    ImageView donationrecord_btn;
    TextView owntoken_text;
    TextView donationrecord_text;
    TextView notice_btn;
    TextView help_btn;
    Button logout_button;

    private int GET_GALLERY_IMAGE = 200;
    private ImageView usericon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag2_mypage);

        username = (TextView) findViewById(R.id.username);
        usericon = (ImageView) findViewById(R.id.usericon);
        owntoken_btn = (ImageView) findViewById(R.id.owntoken_btn);
        donationrecord_btn = (ImageView) findViewById(R.id.donationrecord_btn);
        owntoken_text = (TextView) findViewById(R.id.owntoken_text);
        donationrecord_text = (TextView) findViewById(R.id.donationrecord_text);
        notice_btn = (TextView) findViewById(R.id.notice_btn);
        help_btn = (TextView) findViewById(R.id.help_btn);
        logout_button = (Button) findViewById(R.id.logout_botton);


        //보유토큰 버튼 클릭 시 보유토큰으로 이동
        owntoken_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(view.getContext(), OwnToken.class);
                startActivity(intent);
            }
        });

        //기부내역 버튼 클릭 시 기부내역으로 이동
        donationrecord_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(view.getContext(), DonationRecord.class);
                startActivity(intent);
            }
        });

        //공지사항 버튼 클릭 시 공지사항으로 이동
        notice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(view.getContext(), Notice.class);
                startActivity(intent);
            }
        });

        //약관 버튼 클릭 시 약관으로 이동
        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(view.getContext(), Help.class);
                startActivity(intent);
            }
        });

        //마이페이지 사진 변경
        usericon.setOnClickListener(new View.OnClickListener() {
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
            usericon.setImageURI(selectedImageUri);

        }

    }


}
