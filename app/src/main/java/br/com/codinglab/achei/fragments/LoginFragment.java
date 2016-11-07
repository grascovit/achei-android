package br.com.codinglab.achei.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.codinglab.achei.R;
import butterknife.BindView;
import butterknife.OnClick;

public class LoginFragment extends Fragment {

    @BindView(R.id.login_button)
    Button loginButton;

    public LoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }

    @OnClick(R.id.login_button)
    public void doLogin() {
        // TODO: login stuff
    }

}
