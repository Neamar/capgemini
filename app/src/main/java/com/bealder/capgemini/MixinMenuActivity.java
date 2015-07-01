package com.bealder.capgemini;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by neamar on 12/13/14.
 */
public class MixinMenuActivity {
    public void addMenuListeners(Activity currentActivity) {
        if (!(currentActivity instanceof WelcomeActivity)) {
            addMenuListener(currentActivity, R.id.menu_welcome, WelcomeActivity.class);
        }
        if (!(currentActivity instanceof NewsActivity)) {
            addMenuListener(currentActivity, R.id.menu_news, NewsActivity.class);
        }
        if (!(currentActivity instanceof AseActivity)) {
            addMenuListener(currentActivity, R.id.menu_ase, AseActivity.class);
        }
        if (!(currentActivity instanceof ProgramActivity)) {
            addMenuListener(currentActivity, R.id.menu_programme, ProgramActivity.class);
        }
        if (!(currentActivity instanceof ProfileActivity)) {
            addMenuListener(currentActivity, R.id.menu_profil, ProfileActivity.class);
        }
    }

    private void addMenuListener(final Activity currentActivity, int id, final Class activityToOpen) {
        ImageView contactButton = (ImageView) currentActivity.findViewById(id);
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(currentActivity, activityToOpen);
                i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                currentActivity.startActivity(i);
            }
        });
    }
}
