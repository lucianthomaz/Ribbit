package com.lucianthomaz.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Lucian on 27/04/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "j9LEVojvZoAXAoMVKjQzv61MNuheS4wSqbbRXSOn", "IxZSWuO7UDYu0gTgdPnzwywchMS8CPY82bnrN0LE");
    }
}
