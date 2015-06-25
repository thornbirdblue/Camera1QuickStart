package com.ccsg.camera1qs;

import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Camera1QSActivity extends Activity {
	private static final String TAG = "CcsgCameraQS";
	private Camera QSCamera;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		QSCamera = Camera.open();
		
		setContentView(R.layout.activity_camera1_qs);
	}
	
	
}
