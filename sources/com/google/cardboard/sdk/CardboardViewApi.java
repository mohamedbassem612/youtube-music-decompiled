package com.google.cardboard.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import com.google.cardboard.proto.CardboardDevice;
import com.google.cardboard.sdk.deviceparams.CardboardV1DeviceParams;
import com.google.cardboard.sdk.deviceparams.DeviceParamsUtils;
import com.google.cardboard.sdk.nativetypes.EyeTextureDescription;
import com.google.cardboard.sdk.nativetypes.Mesh;
import com.google.cardboard.sdk.nativetypes.UvPoint;
import defpackage.atb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CardboardViewApi {
    private static final String CARDBOARD_CONFIGURE_ACTION = "com.google.vrtoolkit.cardboard.CONFIGURE";
    private static final long NATIVE_TARGET_DISPLAY = 0;
    private static final long PREDICTION_TIME_WITHOUT_VSYNC_NANOS = 50000000;
    private static final String TAG = "CardboardViewApi";
    private int cachedDisplayRotation;
    private final Context context;
    private long deltaTimeInNs;
    private CardboardViewportOrientation deviceOrientation;
    private final Display display;
    private int displayRotation;
    private DistortionRenderer distortionRenderer;
    private FieldOfView fieldOfView;
    private HeadTracker headTracker;
    private LensDistortion lensDistortion;
    private ScreenSize screenSize;

    /* JADX INFO: compiled from: PG */
    enum CardboardViewportOrientation {
        LANDSCAPE_LEFT(0),
        LANDSCAPE_RIGHT(1),
        PORTRAIT(2),
        PORTRAIT_REVERSED(3);

        private final int value;

        CardboardViewportOrientation(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class FieldOfView {
        final float bottom;
        final float left;
        final float right;
        final float top;

        public FieldOfView(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f4;
            this.right = f2;
            this.bottom = f3;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class ScreenSize {
        final int height;
        final int width;

        public ScreenSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public CardboardViewApi(Context context) {
        Initialize.initialize(context);
        this.context = context;
        this.distortionRenderer = null;
        this.lensDistortion = null;
        this.headTracker = new HeadTracker();
        this.screenSize = new ScreenSize(0, 0);
        this.fieldOfView = new FieldOfView(0.0f, 0.0f, 0.0f, 0.0f);
        this.deltaTimeInNs = PREDICTION_TIME_WITHOUT_VSYNC_NANOS;
        this.display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
        this.displayRotation = 0;
        this.cachedDisplayRotation = -1;
        this.deviceOrientation = CardboardViewportOrientation.LANDSCAPE_LEFT;
    }

    private void initializeFieldOfView(byte[] bArr) {
        CardboardDevice.DeviceParams cardboardDeviceParams = DeviceParamsUtils.parseCardboardDeviceParams(bArr);
        if (cardboardDeviceParams.getLeftEyeFieldOfViewAnglesCount() == 4) {
            this.fieldOfView = new FieldOfView(cardboardDeviceParams.getLeftEyeFieldOfViewAngles(0), cardboardDeviceParams.getLeftEyeFieldOfViewAngles(1), cardboardDeviceParams.getLeftEyeFieldOfViewAngles(2), cardboardDeviceParams.getLeftEyeFieldOfViewAngles(3));
        } else {
            float[] fArr = CardboardV1DeviceParams.CARDBOARD_V1_FOV_ANGLES;
            this.fieldOfView = new FieldOfView(fArr[0], fArr[1], fArr[2], fArr[3]);
        }
    }

    private boolean isReadExternalStoragePermissionEnabled() {
        return atb.c(this.context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    private static boolean isValidEyeType(int i) {
        return i == 0 || i == 1;
    }

    private void setDeviceOrientation(int i) {
        if (i == 0) {
            this.deviceOrientation = CardboardViewportOrientation.PORTRAIT;
            return;
        }
        if (i == 2) {
            this.deviceOrientation = CardboardViewportOrientation.PORTRAIT_REVERSED;
        } else if (i == 1) {
            this.deviceOrientation = CardboardViewportOrientation.LANDSCAPE_LEFT;
        } else if (i == 3) {
            this.deviceOrientation = CardboardViewportOrientation.LANDSCAPE_RIGHT;
        }
    }

    public void close() {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer != null) {
            distortionRenderer.close();
            this.distortionRenderer = null;
        }
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion != null) {
            lensDistortion.close();
            this.lensDistortion = null;
        }
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.close();
            this.headTracker = null;
        }
    }

    UvPoint distortedUvForUndistortedUv(UvPoint uvPoint, int i) {
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            throw new IllegalStateException("LensDistortion has not been initialized yet.");
        }
        if (isValidEyeType(i)) {
            return lensDistortion.distortedUvForUndistortedUv(uvPoint, i);
        }
        throw new IllegalArgumentException("eye is invalid.");
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public long getDeltaTimeInNs() {
        return this.deltaTimeInNs;
    }

    public Mesh getDistortionMesh(int i) {
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            throw new IllegalStateException("LensDistortion has not been initialized yet.");
        }
        if (isValidEyeType(i)) {
            return lensDistortion.getDistortionMesh(i);
        }
        throw new IllegalArgumentException("eye is invalid.");
    }

    public void getEyeFromHeadMatrix(int i, float[] fArr) {
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            Log.w(TAG, "Tried to getEyeFromHeadMatrix but LensDistortion is not initialized.");
        } else {
            lensDistortion.getEyeFromHeadMatrix(i, fArr);
        }
    }

    public void getEyeProjectionMatrix(int i, float f, float f2, float[] fArr) {
        if (!isValidEyeType(i)) {
            throw new IllegalArgumentException("eye is invalid.");
        }
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            Log.w(TAG, "Tried to getEyeProjectionMatrix but LensDistortion is not initialized.");
        } else {
            lensDistortion.getEyeProjectionMatrix(i, f, f2, fArr);
        }
    }

    public float getFieldOfViewParamsBottom() {
        return this.fieldOfView.bottom;
    }

    public float getFieldOfViewParamsLeft() {
        return this.fieldOfView.left;
    }

    public float getFieldOfViewParamsRight() {
        return this.fieldOfView.right;
    }

    public float getFieldOfViewParamsTop() {
        return this.fieldOfView.top;
    }

    public void getPose(float[] fArr, float[] fArr2) {
        int rotation = this.display.getRotation();
        this.displayRotation = rotation;
        if (this.cachedDisplayRotation != rotation) {
            setDeviceOrientation(rotation);
        }
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.getPose(this.deltaTimeInNs, this.deviceOrientation.getValue(), fArr, fArr2);
        } else {
            Log.w(TAG, "Tried to get the pose from HeadTracker but it is not initialized.");
        }
    }

    public CardboardDevice.DeviceParams getSavedDeviceParams() {
        return DeviceParamsUtils.parseCardboardDeviceParams(QrCode.getSavedDeviceParams());
    }

    public int getScreenParamsHeight() {
        return this.screenSize.height;
    }

    public int getScreenParamsWidth() {
        return this.screenSize.width;
    }

    public boolean hasSavedDeviceParams() {
        return (Build.VERSION.SDK_INT > 28 || isReadExternalStoragePermissionEnabled()) && QrCode.getSavedDeviceParams() != null;
    }

    public void initializeRenderThread() {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer != null) {
            distortionRenderer.close();
        }
        this.distortionRenderer = new DistortionRenderer();
    }

    public void launchVrCoreSettingsActivity() {
        PackageManager packageManager = this.context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction(CARDBOARD_CONFIGURE_ACTION).addFlags(268435456);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        Integer numValueOf = null;
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (PackageUtils.isGooglePackage(this.context, str)) {
                int i = resolveInfo.priority;
                if (PackageUtils.isSystemPackage(this.context, str)) {
                    i++;
                }
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i);
                } else if (i > numValueOf.intValue()) {
                    numValueOf = Integer.valueOf(i);
                    arrayList.clear();
                } else if (i >= numValueOf.intValue()) {
                }
                Intent intent2 = new Intent(intent);
                intent2.setClassName(str, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            intent = (Intent) arrayList.get(0);
        }
        this.context.startActivity(intent);
    }

    public void loadDeviceParams() {
        byte[] savedDeviceParams = ((Build.VERSION.SDK_INT > 28 || !isReadExternalStoragePermissionEnabled()) && Build.VERSION.SDK_INT <= 28) ? null : QrCode.getSavedDeviceParams();
        if (savedDeviceParams == null) {
            savedDeviceParams = QrCode.getCardboardV1DeviceParams();
        }
        initializeFieldOfView(savedDeviceParams);
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion != null) {
            lensDistortion.close();
        }
        ScreenSize screenSize = this.screenSize;
        this.lensDistortion = new LensDistortion(savedDeviceParams, screenSize.width, screenSize.height);
    }

    public void pauseHeadTracker() {
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.pause();
        } else {
            Log.w(TAG, "Tried to pause the HeadTracker but it is not initialized.");
        }
    }

    public void renderEyeToDisplay(EyeTextureDescription eyeTextureDescription, EyeTextureDescription eyeTextureDescription2) {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer == null) {
            Log.w(TAG, "Tried to renderEyeToDisplay but DistortionRenderer is not initialized.");
        } else {
            ScreenSize screenSize = this.screenSize;
            distortionRenderer.renderEyeToDisplay(NATIVE_TARGET_DISPLAY, 0, 0, screenSize.width, screenSize.height, eyeTextureDescription, eyeTextureDescription2);
        }
    }

    public void resumeHeadTracker() {
        HeadTracker headTracker = this.headTracker;
        if (headTracker != null) {
            headTracker.resume();
        } else {
            Log.w(TAG, "Tried to resume the HeadTracker but it is not initialized.");
        }
    }

    public void scanViewerQrCode() {
        QrCode.scanQrCodeAndSaveDeviceParams();
    }

    public void setDeltaTimeInNs(long j) {
        this.deltaTimeInNs = j;
    }

    public void setMesh(Mesh mesh, int i) {
        DistortionRenderer distortionRenderer = this.distortionRenderer;
        if (distortionRenderer == null) {
            Log.w(TAG, "Tried to setMesh but DistortionRenderer is not initialized.");
        } else {
            if (!isValidEyeType(i)) {
                throw new IllegalArgumentException("eye is invalid.");
            }
            distortionRenderer.setMesh(mesh, i);
        }
    }

    public void setScreenParams(int i, int i2) {
        this.screenSize = new ScreenSize(i, i2);
    }

    UvPoint undistortedUvForDistortedUv(UvPoint uvPoint, int i) {
        LensDistortion lensDistortion = this.lensDistortion;
        if (lensDistortion == null) {
            throw new IllegalStateException("LensDistortion has not been initialized yet.");
        }
        if (isValidEyeType(i)) {
            return lensDistortion.undistortedUvForDistortedUv(uvPoint, i);
        }
        throw new IllegalArgumentException("eye is invalid.");
    }
}
