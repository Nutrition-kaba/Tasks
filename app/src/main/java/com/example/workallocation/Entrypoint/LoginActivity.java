package com.example.workallocation.Entrypoint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.workallocation.R;
import com.example.workallocation.utils.User.UserDashboard;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity{
EditText em,pp;
Button btn;
ProgressDialog loading;
FirebaseAuth mAuth;
Spinner spin;
String user;
String id,bn;
TextView vb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=findViewById(R.id.btn_login);
        em =findViewById(R.id.l_email);
        pp=findViewById(R.id.l_password);
        loading=new ProgressDialog(this);
        mAuth=FirebaseAuth.getInstance();
        spin=findViewById(R.id.spinnerr);
        vb=findViewById(R.id.cl);
        TextView textView=findViewById(R.id.swipeLeftee);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity.this.startActivity(new Intent(LoginActivity.this, Registration.class));
                LoginActivity.this.finish();

            }
        });
        /*if (mAuth.getCurrentUser()!=null){
            String emm=mAuth.getCurrentUser().getEmail();

                Intent intent=new Intent(LoginActivity.this, UserDashboard.class);
                startActivity(intent);
                finish();


        }*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        loading.setMessage("Please Wait...");
        loading.setTitle("Sign In");
        loading.setCanceledOnTouchOutside(false);

        String email=em.getText().toString().trim().toLowerCase();
        String password=pp.getText().toString().trim();
        if(email.equalsIgnoreCase("")){
            em.setError("Enter Email");
        }
        else if(password.equalsIgnoreCase("")){
            pp.setError("Enter Password");
        }
        else{


                loading.show();
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mAuth = FirebaseAuth.getInstance();
                                Intent intent = new Intent(LoginActivity.this, UserDashboard.class);


                                startActivity(intent);
                                finish();
                                loading.dismiss();
                                finish();

                        } else {
                            loading.dismiss();
                            Toast.makeText(LoginActivity.this, "Error:" + task.getException().toString(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        }
    }
}