package com.group8.newfragmentation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = findViewById(R.id.firstFragment);
        secondFragment = findViewById(R.id.secondFragment);

        firstFragment.setOnClickListener( v -> {
// load First Fragment
            loadFragment(new FirstFragment());
        } );
// perform setOnClickListener event on Second Button
        secondFragment.setOnClickListener( v -> {
// load Second Fragment
            loadFragment(new SecondFragment());
        } );

    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        android.app.Fragment Fragment = null;
        fragmentTransaction.replace(R.id.frameLayout,Fragment);
        fragmentTransaction.commit(); // save the changes
    }
}