package br.com.codinglab.achei.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.codinglab.achei.R;
import br.com.codinglab.achei.fragments.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if (findViewById(R.id.activity_login) != null) {
            if (savedInstanceState != null) {
                return;
            }

            LoginFragment loginFragment = new LoginFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_login, loginFragment).commit();
        }
    }
}
