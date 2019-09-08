package android.lab.midterm07600626;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.lab.midterm07600626.model.Auth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton= findViewById(R.id.button_login);
        loginButton.setOnClickListener(new View.OnClickListener() {  //Android use compiler make interface View.OnClickListener()->class ->obj  is not in java
            @Override
            public void onClick(View view) {
                EditText emailEditText= findViewById(R.id.email_edit_text);
                EditText passwordEditText= findViewById(R.id.password_edit_text);

                String inputEmail =emailEditText.getText().toString();
                String inputPassword =passwordEditText.getText().toString();

                Auth auth=new Auth(inputEmail ,inputPassword);
                boolean result=auth.check();
                boolean result_user_aaa=auth.check_user_aaa();
                boolean result_user_bbb=auth.check_user_bbb();
                if(result) {

                    if(result_user_aaa){
                        Toast.makeText(LoginActivity.this
                                , R.string.text_Welcome
                                //"Tararat choombunchoo"
                                ,Toast.LENGTH_SHORT
                        ).show();
                        Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                        intent.putExtra(String.valueOf(emailEditText),"Tararat choombunchoo"); // ⇐ แทรกบรรทัดนี้ (key/value เป็นค่าสตริง)
                        startActivity(intent);
                    }

                    if(result_user_bbb){
                    Toast.makeText(LoginActivity.this
                                , R.string.text_Welcome
                            //"Promlert Lovichit"
                                ,Toast.LENGTH_SHORT
                        ).show();
                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    intent.putExtra(String.valueOf(emailEditText),"Promlert Lovichit"); // ⇐ แทรกบรรทัดนี้ (key/value เป็นค่าสตริง)
                    startActivity(intent);}

                }else{
                    new AlertDialog.Builder(LoginActivity.this)

                            .setMessage(R.string.Invalid_username_or_password)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    //โค้ดที่ให้ทำงานเมื่อ user กดปุ่มok
                                    //todo:
                                }
                            })
                            .show();

                }
}


        });





        }}