package testapp.testing.com.mylibpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import testapp.testing.com.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.getToast(this);
    }
}
