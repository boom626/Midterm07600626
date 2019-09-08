package android.lab.midterm07600626;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.lab.midterm07600626.model.Auth;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        EditText emailEditText= findViewById(R.id.email_edit_text);
        EditText passwordEditText= findViewById(R.id.password_edit_text);

        Intent intent = getIntent(); //เข้าถึง Intent ที่ส่งมาจากต้นทาง
        String in = intent.getStringExtra(String.valueOf(emailEditText)); //อ่านข้อมูลจาก



        Auth auth=new Auth(String.valueOf(emailEditText) ,String.valueOf(passwordEditText));

        boolean result_user_aaa=auth.check_user_aaa();
        boolean result_user_bbb=auth.check_user_aaa();

        if(result_user_aaa){

            TextView text_name = findViewById(R.id.textView_name);
            text_name.setText(" Tararat Choombunchoo ");

            TextView text_g = findViewById(R.id.textView_Goes);
            text_g.setText("สว.กจ");

            TextView text_l = findViewById(R.id.textView_liveeee);
            text_l.setText("กาญจนบุรี");

            TextView text_f = findViewById(R.id.textView_frommm);
            text_f.setText("กาญจนบุรี");
        }

        if(result_user_bbb){
            TextView text_name = findViewById(R.id.textView_name);
            text_name.setText(" Promlert Lovichito ");

            TextView text_g = findViewById(R.id.textView_Goes);
            text_g.setText("สวนกุหลาบวิทยาลัย");

            TextView text_l = findViewById(R.id.textView_liveeee);
            text_l.setText("กรุงเทพ");

            TextView text_f = findViewById(R.id.textView_frommm);
            text_f.setText("กรุงเทพ");

        }


    }
}
