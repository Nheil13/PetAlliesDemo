package com.example.petallies;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.petallies.databinding.ActivitySignUpBinding;
import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    ActivitySignUpBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String petName = binding.signUpPetName.getText().toString();
                String parentName = binding.signUpParentName.getText().toString();
                String email = binding.signUpEmail.getText().toString();
                String phoneNo = binding.signUpPhoneNo.getText().toString();
                String password = binding.signUpPassword.getText().toString();
                String confirmPassword = binding.signUpPassword.getText().toString();

                if (petName.equals("") || parentName.equals("") || email.equals("") || password.equals("") || phoneNo.equals(""))
                    Toast.makeText(SignUp.this, "Required to answer this field", Toast.LENGTH_SHORT).show();
                else {
                    if (password.equals(confirmPassword)){
                        Boolean checkUserPetName = databaseHelper.checkpetName(petName);

                        if(checkUserPetName == false){
                            Boolean insert = databaseHelper.insertData(petName, password);

                            if (insert == true){
                                Toast.makeText(SignUp.this, "Signup Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Login.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SignUp.this, "Signup Failed", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(SignUp.this, "User already exists, Please login", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignUp.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        binding.logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

    }
}