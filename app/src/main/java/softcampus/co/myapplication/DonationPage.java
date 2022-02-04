package softcampus.co.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DonationPage extends AppCompatActivity {

    TextView donation_title;
    EditText enterToken;
    Button donat_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_page);

        donation_title = (TextView) findViewById(R.id.donation_title);
        enterToken = (EditText) findViewById(R.id.enterToken);
        donat_button = (Button) findViewById(R.id.donat_button);

        donat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"기부가 완료되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}