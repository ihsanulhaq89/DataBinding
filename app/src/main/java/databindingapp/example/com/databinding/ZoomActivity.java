package databindingapp.example.com.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;

public class ZoomActivity extends AppCompatActivity {

    private ImageView img;
    private SeekBar seekbar;
    private SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            progress = progress-30;
            int abs_progress = Math.abs(progress);
            img.setRotation((float) progress);

            float scale = 1.0f + ((abs_progress/100.0f) * 2.0f);
            img.setScaleX(scale);
            img.setScaleY(scale);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        img = (ImageView) findViewById(R.id.image);
        seekbar = (SeekBar) findViewById(R.id.seekbar);
        seekbar.setOnSeekBarChangeListener(listener);
    }

}
