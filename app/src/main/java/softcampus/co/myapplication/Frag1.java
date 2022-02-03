package softcampus.co.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class Frag1 extends Fragment {

    private View view;

    TextView main_name;
    TextView main_board;
    Button main_plus;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1_home, container, false);

        main_name = (TextView)view.findViewById(R.id.main_name);
        main_board = (TextView) view.findViewById(R.id.main_board);
        main_plus = (Button) view.findViewById(R.id.main_plus);


        main_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(view.getContext(), Campaign_registration.class);
                startActivity(intent);
            }
        });

        return view;
    }


}
