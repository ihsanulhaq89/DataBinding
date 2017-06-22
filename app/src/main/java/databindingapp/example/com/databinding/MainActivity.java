package databindingapp.example.com.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import databindingapp.example.com.databinding.databinding.ActivityMainBinding;
import databindingapp.example.com.databinding.viewmodel.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setVm(new User("abctitle,", "tttttt"));
        startActivity(new Intent(this, ZoomActivity.class));
    }
}
