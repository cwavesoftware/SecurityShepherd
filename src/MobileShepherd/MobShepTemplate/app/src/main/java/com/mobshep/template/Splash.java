package com.mobshep.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * This file is part of the Security Playground Project.
 *
 * <p>The Security Playground project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.<br>
 * <item android:id="@+id/action_cart" android:icon="@drawable/cart" android:orderInCategory="100"
 * android:showAsAction="always"/> The Security Playground project is distributed in the hope that it
 * will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.<br>
 *
 * <p>You should have received a copy of the GNU General Public License along with the Security
 * Playground project. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Sean Duggan
 */
public class Splash extends Activity {

  // The splash class is not a requirement when making a new challenge.

  @Override
  protected void onCreate(Bundle Mobile) {
    // TODO Auto-generated method stub
    super.onCreate(Mobile);
    setContentView(R.layout.splash);
    // implement a thread to move on from the intro screen to input screen
    Thread timer =
        new Thread() {
          public void run() {
            try {
              sleep(3000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            } finally {
              Intent gotoMain = new Intent("com.mobshep.template.template");
              startActivity(gotoMain);
            }
          }
        };

    timer.start();
  }

  @Override
  protected void onPause() {
    // TODO Auto-generated method stub
    super.onPause();
    finish();
  }
}
