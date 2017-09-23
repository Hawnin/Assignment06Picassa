package fi.jamk.hawnin.assignment06picassa;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import static fi.jamk.hawnin.assignment06picassa.R.id.imageView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("http://media.indiedb.com/cache/images/games/1/40/39766/thumb_620x2000/lord-of-decay-scythes.jpg")
                .placeholder(R.drawable.load)
                .error(R.drawable.errorstop)
                .resize(750, 720)
                .rotate(90)
                .into(imageView);
    }


}
