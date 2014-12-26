package com.layer.testgit.picassotransform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int radius = 30;
        int stroke = 5;
        int margin = 5;
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Picasso.with(getApplicationContext()).load("http://91ef69bade70f992a001-b6054e05bb416c4c4b6f3b0ef3e0f71d.r93.cf3.rackcdn.com/happy-holidays1-100303463.jpg")
                .transform(new RoundedRectTransformation(radius, stroke, margin))
                .into(imageView);

        //circle
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        Picasso.with(getApplicationContext()).load("http://91ef69bade70f992a001-b6054e05bb416c4c4b6f3b0ef3e0f71d.r93.cf3.rackcdn.com/happy-holidays1-100303463.jpg")
                .transform(new CircleTransform())
                .into(imageView2);
    }

}