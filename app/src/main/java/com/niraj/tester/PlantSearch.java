package com.niraj.tester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by niraj on 1/11/15.
 */
public class PlantSearch extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantsearch);
    }

    public void goToLettuce(View view) {
        Intent goLettuce = new Intent(this, Lettuce.class);
        startActivity(goLettuce);
    }

    public void goToCarrot(View view) {
        Intent goCarrot = new Intent(this, Carrot.class);
        startActivity(goCarrot);
    }

    public void goToBasil(View view) {
        Intent goBasil = new Intent(this, Basil.class);
        startActivity(goBasil);
    }
}
