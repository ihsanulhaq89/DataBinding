package databindingapp.example.com.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import databindingapp.example.com.databinding.viewmodel.TouchImageView;

public class ZoomActivity extends AppCompatActivity {

    private TouchImageView imgTouch;
    private SeekBar seekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        imgTouch = (TouchImageView) findViewById(R.id.imgimg);
        seekbar = (SeekBar) findViewById(R.id.seekbar);
        seekbar.setOnSeekBarChangeListener(listener);
    }

    private SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            progress = progress - 30;
            // range of value being provide as angle of rotation are -30 < 0 < 30
            int abs_progress = Math.abs(progress);
            imgTouch.setRotation((float) progress);
            float scale = 1.0f + ((abs_progress / 100.0f) * 3.0f);
            imgTouch.setScaleX(scale);
            imgTouch.setScaleY(scale);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

}
