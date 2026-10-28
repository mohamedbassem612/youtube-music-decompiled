package com.google.cardboard.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.qrcode.CardboardParamsUtils;
import com.google.cardboard.sdk.qrcode.QrCodeContentProcessor;
import com.google.cardboard.sdk.qrcode.QrCodeTracker;
import com.google.cardboard.sdk.qrcode.QrCodeTrackerFactory;
import com.google.cardboard.sdk.qrcode.camera.CameraSource;
import com.google.cardboard.sdk.qrcode.camera.CameraSourcePreview;
import defpackage.atb;
import defpackage.azz;
import defpackage.fx;
import defpackage.klo;
import defpackage.klt;
import defpackage.lqq;
import defpackage.lqs;
import defpackage.lqt;
import defpackage.lqx;
import defpackage.mgk;
import defpackage.zf;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class QrCodeCaptureActivity extends fx implements QrCodeTracker.Listener, QrCodeContentProcessor.Listener {
    private static final int MIN_SDK_VERSION = 23;
    private static final int PERMISSIONS_REQUEST_CODE = 2;
    private static final int RC_HANDLE_GMS = 9001;
    private static final String TAG = "QrCodeCaptureActivity";
    private static boolean qrCodeSaved = false;
    private CameraSource cameraSource;
    private CameraSourcePreview cameraSourcePreview;

    private void createCameraSource() {
        Context applicationContext = getApplicationContext();
        lqt lqtVar = new lqt();
        lqtVar.a = SemanticState.Hidden;
        lqs lqsVar = new lqs(new lqx(applicationContext, lqtVar));
        QrCodeTrackerFactory qrCodeTrackerFactory = new QrCodeTrackerFactory(this);
        mgk mgkVar = new mgk();
        mgkVar.b = qrCodeTrackerFactory;
        synchronized (lqsVar.a) {
            mgk mgkVar2 = lqsVar.b;
            if (mgkVar2 != null) {
                mgkVar2.a();
            }
            lqsVar.b = mgkVar;
        }
        if (!lqsVar.b()) {
            Toast.makeText(this, com.google.android.apps.youtube.music.R.string.missing_dependencies, 1).show();
            Log.w(TAG, "QR Code detector is not operational. Try connecting to WiFi and updating Google Play Services or checking that the device storage isn't low.");
        }
        this.cameraSource = new CameraSource(getApplicationContext(), lqsVar);
    }

    private boolean isCameraEnabled() {
        return atb.c(this, "android.permission.CAMERA") == 0;
    }

    private boolean isWriteExternalStoragePermissionsEnabled() {
        return atb.c(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private void launchPermissionsSettings() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    private native void nativeIncrementDeviceParamsChangedCount();

    private void requestPermissions() {
        atb.a(this, Build.VERSION.SDK_INT < 29 ? new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA"}, 2);
    }

    private void startCameraSource() {
        klt kltVar = klt.a;
        int iM = kltVar.m(getApplicationContext(), 23);
        if (iM != 0) {
            new klo(1, iM, null, null, null, null).toString();
            kltVar.a(this, iM, RC_HANDLE_GMS, null).show();
        }
        CameraSource cameraSource = this.cameraSource;
        if (cameraSource != null) {
            try {
                this.cameraSourcePreview.start(cameraSource);
            } catch (IOException e) {
                Log.e(TAG, "Unable to start camera source.", e);
                this.cameraSource.release();
                this.cameraSource = null;
            } catch (SecurityException e2) {
                Log.e(TAG, "Security exception: ", e2);
            }
        }
    }

    @Override // defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.apps.youtube.music.R.layout.qr_code_capture);
        azz.c(getWindow(), false);
        zf zfVar = new zf(getWindow(), getWindow().getDecorView());
        zfVar.b(519);
        zfVar.e();
        this.cameraSourcePreview = (CameraSourcePreview) findViewById(com.google.android.apps.youtube.music.R.id.preview);
    }

    @Override // defpackage.cf, android.app.Activity
    protected void onPause() {
        super.onPause();
        CameraSourcePreview cameraSourcePreview = this.cameraSourcePreview;
        if (cameraSourcePreview != null) {
            cameraSourcePreview.stop();
            this.cameraSourcePreview.release();
        }
    }

    @Override // com.google.cardboard.sdk.qrcode.QrCodeTracker.Listener
    public void onQrCodeDetected(lqq lqqVar) {
        if (lqqVar == null || qrCodeSaved) {
            return;
        }
        qrCodeSaved = true;
        new QrCodeContentProcessor(this).processAndSaveQrCode(lqqVar, this);
    }

    @Override // com.google.cardboard.sdk.qrcode.QrCodeContentProcessor.Listener
    public void onQrCodeSaved(boolean z) {
        if (z) {
            this.cameraSourcePreview.stop();
            nativeIncrementDeviceParamsChangedCount();
            finish();
        } else {
            Log.e(TAG, "Device parameters not saved in external storage.");
        }
        qrCodeSaved = false;
    }

    @Override // defpackage.cf, defpackage.qe, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            if (isCameraEnabled()) {
                return;
            }
            getString(com.google.android.apps.youtube.music.R.string.no_camera_permission);
            Toast.makeText(this, com.google.android.apps.youtube.music.R.string.no_camera_permission, 1).show();
            if (!atb.b(this, "android.permission.CAMERA")) {
                launchPermissionsSettings();
            }
            finish();
            return;
        }
        if (isCameraEnabled() && isWriteExternalStoragePermissionsEnabled()) {
            return;
        }
        getString(com.google.android.apps.youtube.music.R.string.no_permissions);
        Toast.makeText(this, com.google.android.apps.youtube.music.R.string.no_permissions, 1).show();
        if (!atb.b(this, "android.permission.WRITE_EXTERNAL_STORAGE") || !atb.b(this, "android.permission.CAMERA")) {
            launchPermissionsSettings();
        }
        finish();
    }

    @Override // defpackage.cf, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!isCameraEnabled() || (Build.VERSION.SDK_INT < 29 && !isWriteExternalStoragePermissionsEnabled())) {
            requestPermissions();
            return;
        }
        createCameraSource();
        qrCodeSaved = false;
        startCameraSource();
    }

    public void skipQrCodeCapture(View view) {
        Context applicationContext = getApplicationContext();
        if (CardboardParamsUtils.readDeviceParams(applicationContext) == null) {
            CardboardParamsUtils.saveCardboardV1DeviceParams(applicationContext);
        }
        finish();
    }
}
