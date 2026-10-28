package com.google.cardboard.sdk.qrcode.camera;

import android.content.Context;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.car.app.model.Alert;
import com.google.cardboard.sdk.qrcode.QrCodeTrackerFactory;
import defpackage.a;
import defpackage.kpn;
import defpackage.lqa;
import defpackage.lqb;
import defpackage.lqc;
import defpackage.lqd;
import defpackage.mgk;
import defpackage.zh;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CameraSource {
    private static final float ASPECT_RATIO_TOLERANCE = 0.01f;
    private static final float FPS = 15.0f;
    private static final int HEIGHT = 1200;
    private static final String TAG = "CameraSource";
    private static final int WIDTH = 1600;
    public static final /* synthetic */ int a = 0;
    private Camera camera;
    private final Context context;
    private final FrameProcessingRunnable frameProcessor;
    private kpn previewSize;
    private Thread processingThread;
    private int rotation;
    private final Object cameraLock = new Object();
    private final Map bytesToByteBuffer = new HashMap();

    /* JADX INFO: compiled from: PG */
    class CameraPreviewCallback implements Camera.PreviewCallback {
        final /* synthetic */ CameraSource this$0;

        private CameraPreviewCallback(CameraSource cameraSource) {
            cameraSource.getClass();
            this.this$0 = cameraSource;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            this.this$0.frameProcessor.setNextFrame(bArr, camera);
        }
    }

    /* JADX INFO: compiled from: PG */
    class FrameProcessingRunnable implements Runnable {
        private boolean active;
        private lqb detector;
        private final Object lock;
        private ByteBuffer pendingFrameData;
        private int pendingFrameId;
        private long pendingTimeMillis;
        private final long startTimeMillis;
        final /* synthetic */ CameraSource this$0;

        public FrameProcessingRunnable(CameraSource cameraSource, lqb lqbVar) {
            cameraSource.getClass();
            this.this$0 = cameraSource;
            this.startTimeMillis = SystemClock.elapsedRealtime();
            this.lock = new Object();
            this.active = true;
            this.pendingFrameId = 0;
            this.detector = lqbVar;
        }

        public void release() {
            this.detector.a();
            this.detector = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteBuffer byteBuffer;
            Object obj;
            while (true) {
                synchronized (this.lock) {
                    while (true) {
                        if (!this.active) {
                            return;
                        }
                        byteBuffer = this.pendingFrameData;
                        if (byteBuffer == null) {
                            try {
                                this.lock.wait();
                            } catch (InterruptedException unused) {
                                int i = CameraSource.a;
                                return;
                            }
                        }
                    }
                    mgk mgkVar = new mgk((byte[]) null);
                    int i2 = this.this$0.previewSize.a;
                    int i3 = this.this$0.previewSize.b;
                    if (byteBuffer.capacity() < i2 * i3) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    mgkVar.b = byteBuffer;
                    Object obj2 = mgkVar.a;
                    ((lqc) obj2).a = i2;
                    ((lqc) obj2).b = i3;
                    ((lqc) obj2).f = 17;
                    ((lqc) obj2).c = this.pendingFrameId;
                    ((lqc) obj2).d = this.pendingTimeMillis;
                    ((lqc) obj2).e = this.this$0.rotation;
                    if (mgkVar.b == null) {
                        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                    }
                    ByteBuffer byteBuffer2 = this.pendingFrameData;
                    this.pendingFrameData = null;
                    try {
                        lqb lqbVar = this.detector;
                        lqc lqcVar = new lqc((lqc) obj2);
                        if (lqcVar.e % 2 != 0) {
                            int i4 = lqcVar.a;
                            lqcVar.a = lqcVar.b;
                            lqcVar.b = i4;
                        }
                        lqcVar.e = 0;
                        SparseArray sparseArrayC = lqbVar.c(mgkVar);
                        lqbVar.b();
                        lqa lqaVar = new lqa(sparseArrayC);
                        synchronized (lqbVar.a) {
                            try {
                                try {
                                    mgk mgkVar2 = lqbVar.b;
                                    if (mgkVar2 == null) {
                                        throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                                    }
                                    Object obj3 = lqaVar.a;
                                    for (int i5 = 0; i5 < ((SparseArray) obj3).size(); i5++) {
                                        int iKeyAt = ((SparseArray) obj3).keyAt(i5);
                                        Object objValueAt = ((SparseArray) obj3).valueAt(i5);
                                        Object obj4 = mgkVar2.a;
                                        if (((SparseArray) obj4).get(iKeyAt) == null) {
                                            zh zhVar = new zh((byte[]) null, (byte[]) null);
                                            zhVar.b = ((QrCodeTrackerFactory) mgkVar2.b).create(objValueAt);
                                            ((lqd) zhVar.b).onNewItem(iKeyAt, objValueAt);
                                            ((SparseArray) obj4).append(iKeyAt, zhVar);
                                        }
                                    }
                                    HashSet hashSet = new HashSet();
                                    int i6 = 0;
                                    while (true) {
                                        obj = mgkVar2.a;
                                        if (i6 >= ((SparseArray) obj).size()) {
                                            break;
                                        }
                                        int iKeyAt2 = ((SparseArray) obj).keyAt(i6);
                                        if (((SparseArray) obj3).get(iKeyAt2) == null) {
                                            zh zhVar2 = (zh) ((SparseArray) obj).valueAt(i6);
                                            int i7 = zhVar2.a + 1;
                                            zhVar2.a = i7;
                                            if (i7 >= 3) {
                                                ((lqd) zhVar2.b).onDone();
                                                hashSet.add(Integer.valueOf(iKeyAt2));
                                            } else {
                                                ((lqd) zhVar2.b).onMissing(lqaVar);
                                            }
                                        }
                                        i6++;
                                    }
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((SparseArray) obj).delete(((Integer) it.next()).intValue());
                                    }
                                    for (int i8 = 0; i8 < ((SparseArray) obj3).size(); i8++) {
                                        int iKeyAt3 = ((SparseArray) obj3).keyAt(i8);
                                        Object objValueAt2 = ((SparseArray) obj3).valueAt(i8);
                                        zh zhVar3 = (zh) ((SparseArray) obj).get(iKeyAt3);
                                        zhVar3.a = 0;
                                        ((lqd) zhVar3.b).onUpdate(lqaVar, objValueAt2);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                Log.e(CameraSource.TAG, "Exception thrown from receiver.", th);
                                this.this$0.camera.addCallbackBuffer(byteBuffer2.array());
                            } catch (Throwable th2) {
                                this.this$0.camera.addCallbackBuffer(byteBuffer2.array());
                                throw th2;
                            }
                        }
                        this.this$0.camera.addCallbackBuffer(byteBuffer2.array());
                    } catch (Throwable th3) {
                        Log.e(CameraSource.TAG, "Exception thrown from receiver.", th3);
                        this.this$0.camera.addCallbackBuffer(byteBuffer2.array());
                    }
                }
            }
        }

        public void setActive(boolean z) {
            synchronized (this.lock) {
                this.active = z;
                this.lock.notifyAll();
            }
        }

        public void setNextFrame(byte[] bArr, Camera camera) {
            synchronized (this.lock) {
                ByteBuffer byteBuffer = this.pendingFrameData;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.pendingFrameData = null;
                }
                if (this.this$0.bytesToByteBuffer.containsKey(bArr)) {
                    this.pendingTimeMillis = SystemClock.elapsedRealtime() - this.startTimeMillis;
                    this.pendingFrameId++;
                    this.pendingFrameData = (ByteBuffer) this.this$0.bytesToByteBuffer.get(bArr);
                    this.lock.notifyAll();
                }
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    class SizePair {
        private kpn picture;
        private final kpn preview;

        public SizePair(Camera.Size size, Camera.Size size2) {
            this.preview = new kpn(size.width, size.height);
            if (size2 != null) {
                this.picture = new kpn(size2.width, size2.height);
            }
        }

        public kpn pictureSize() {
            return this.picture;
        }

        public kpn previewSize() {
            return this.preview;
        }
    }

    public CameraSource(Context context, lqb lqbVar) {
        if (context == null) {
            Log.e(TAG, "context is null.");
            throw new IllegalArgumentException("No context supplied.");
        }
        if (lqbVar == null) {
            Log.e(TAG, "detector is null.");
            throw new IllegalArgumentException("No detector supplied.");
        }
        this.context = context;
        this.frameProcessor = new FrameProcessingRunnable(this, lqbVar);
    }

    private Camera createCamera() {
        int idForRequestedCamera = getIdForRequestedCamera(0);
        if (idForRequestedCamera == -1) {
            Log.e(TAG, "Could not find requested camera.");
            throw new RuntimeException("Could not find requested camera.");
        }
        Camera cameraOpen = Camera.open(idForRequestedCamera);
        SizePair sizePairSelectSizePair = selectSizePair(cameraOpen, WIDTH, HEIGHT);
        if (sizePairSelectSizePair == null) {
            Log.e(TAG, "Could not find suitable preview size.");
            throw new RuntimeException("Could not find suitable preview size.");
        }
        kpn kpnVarPictureSize = sizePairSelectSizePair.pictureSize();
        this.previewSize = sizePairSelectSizePair.previewSize();
        int[] iArrSelectPreviewFpsRange = selectPreviewFpsRange(cameraOpen, FPS);
        if (iArrSelectPreviewFpsRange == null) {
            Log.e(TAG, "Could not find suitable preview frames per second range.");
            throw new RuntimeException("Could not find suitable preview frames per second range.");
        }
        Camera.Parameters parameters = cameraOpen.getParameters();
        if (kpnVarPictureSize != null) {
            parameters.setPictureSize(kpnVarPictureSize.a, kpnVarPictureSize.b);
        }
        kpn kpnVar = this.previewSize;
        parameters.setPreviewSize(kpnVar.a, kpnVar.b);
        parameters.setPreviewFpsRange(iArrSelectPreviewFpsRange[0], iArrSelectPreviewFpsRange[1]);
        parameters.setPreviewFormat(17);
        setRotation(cameraOpen, parameters, idForRequestedCamera);
        if (parameters.getSupportedFocusModes().contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
        }
        cameraOpen.setParameters(parameters);
        cameraOpen.setPreviewCallbackWithBuffer(new CameraPreviewCallback());
        cameraOpen.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        cameraOpen.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        cameraOpen.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        cameraOpen.addCallbackBuffer(createPreviewBuffer(this.previewSize));
        return cameraOpen;
    }

    private byte[] createPreviewBuffer(kpn kpnVar) {
        byte[] bArr = new byte[((int) Math.ceil(((((long) kpnVar.b) * ((long) kpnVar.a)) * 12) / 8.0d)) + 1];
        this.bytesToByteBuffer.put(bArr, ByteBuffer.wrap(bArr));
        return bArr;
    }

    private static List generateValidPreviewSizeList(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : supportedPreviewSizes) {
            float f = size.width;
            float f2 = size.height;
            for (Camera.Size size2 : supportedPictureSizes) {
                if (Math.abs((f / f2) - (size2.width / size2.height)) < ASPECT_RATIO_TOLERANCE) {
                    arrayList.add(new SizePair(size, size2));
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            Log.w(TAG, "No preview sizes have a corresponding same-aspect-ratio picture size");
            Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
            while (it.hasNext()) {
                arrayList.add(new SizePair(it.next(), null));
            }
        }
        return arrayList;
    }

    private static int getIdForRequestedCamera(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                return i2;
            }
        }
        return -1;
    }

    private static int[] selectPreviewFpsRange(Camera camera, float f) {
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int[] iArr = null;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int i2 = (int) (1000.0f * f);
            int iAbs = Math.abs(i2 - iArr2[0]) + Math.abs(i2 - iArr2[1]);
            if (iAbs < i) {
                iArr = iArr2;
                i = iAbs;
            }
        }
        return iArr;
    }

    private static SizePair selectSizePair(Camera camera, int i, int i2) {
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        SizePair sizePair = null;
        for (SizePair sizePair2 : generateValidPreviewSizeList(camera)) {
            kpn kpnVarPreviewSize = sizePair2.previewSize();
            int iAbs = Math.abs(kpnVarPreviewSize.a - i) + Math.abs(kpnVarPreviewSize.b - i2);
            if (iAbs < i3) {
                sizePair = sizePair2;
                i3 = iAbs;
            }
        }
        return sizePair;
    }

    private void setRotation(Camera camera, Camera.Parameters parameters, int i) {
        int i2;
        int i3;
        int rotation = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i4 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i4 = 90;
            } else if (rotation == 2) {
                i4 = 180;
            } else if (rotation != 3) {
                Log.e(TAG, a.bR(rotation, "Bad rotation value: "));
            } else {
                i4 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int i5 = cameraInfo.facing;
        int i6 = cameraInfo.orientation;
        if (i5 == 1) {
            i2 = (i6 + i4) % 360;
            i3 = (360 - i2) % 360;
        } else {
            i2 = ((i6 - i4) + 360) % 360;
            i3 = i2;
        }
        this.rotation = i2 / 90;
        camera.setDisplayOrientation(i3);
        parameters.setRotation(i2);
    }

    public kpn getPreviewSize() {
        return this.previewSize;
    }

    public void release() {
        synchronized (this.cameraLock) {
            stop();
            this.frameProcessor.release();
        }
    }

    public CameraSource start(SurfaceHolder surfaceHolder) {
        synchronized (this.cameraLock) {
            if (this.camera == null) {
                Camera cameraCreateCamera = createCamera();
                this.camera = cameraCreateCamera;
                cameraCreateCamera.setPreviewDisplay(surfaceHolder);
                this.camera.startPreview();
                this.processingThread = new Thread(this.frameProcessor);
                this.frameProcessor.setActive(true);
                this.processingThread.start();
            }
        }
        return this;
    }

    public void stop() {
        synchronized (this.cameraLock) {
            this.frameProcessor.setActive(false);
            Thread thread = this.processingThread;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                }
                this.processingThread = null;
            }
            this.bytesToByteBuffer.clear();
            Camera camera = this.camera;
            if (camera != null) {
                camera.stopPreview();
                this.camera.setPreviewCallbackWithBuffer(null);
                try {
                    this.camera.setPreviewTexture(null);
                } catch (Exception e) {
                    Log.e(TAG, a.co(e, "Failed to clear camera preview: "));
                }
                this.camera.release();
                this.camera = null;
            }
        }
    }
}
