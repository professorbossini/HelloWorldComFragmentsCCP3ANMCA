package br.com.bossini.helloworldcomfragmentsccp3anmca;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null){
            FragmentManager fm =
                    getSupportFragmentManager();
            HelloWorldFragment hwf =
                    new HelloWorldFragment();
            FragmentTransaction ft = fm.beginTransaction();
            ft.add( R.id.layoutFragment, hwf, "helloWorldFragment");
            ft.commit();
        }

    }
}
