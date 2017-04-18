package de.binosys.alpha_bug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.root).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TestFrameLayout child2 = (TestFrameLayout) view.findViewById(R.id.child2);
        child2.setAlpha(child2.getAlpha() < 0.7f ? 1f : 0.5f);
    }
}
