package com.gm.frogs.frogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gm.frogs.R;
import com.gm.frogs.models.Frog;

import java.util.List;

public class FrogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        DaggerFrogsComponent.builder()
                .frogsPresenterModule(new FrogsPresenterModule()).build()
                .inject(this);


        /**
         * We want to make the call to get all frogs when this Activity is created.
         */

    }

    void displayAllFrogs(List<Frog> frogs) {
        //Don't Implement
        //We are Displaying something awesome to the user
    }

    void displayFrog(Frog frog) {
        //Don't Implement
        //We are Displaying something awesome to the user
    }

    public void displayEmptyState() {
        //Don't Implement
        //We are Displaying something awesome to the user
    }

    public void displayNetworkError() {

    }
}
