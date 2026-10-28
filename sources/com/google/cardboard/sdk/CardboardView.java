package com.google.cardboard.sdk;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.cardboard.sdk.nativetypes.EyeTextureDescription;
import com.google.cardboard.sdk.nativetypes.Mesh;
import com.google.cardboard.sdk.utils.MathUtils;
import defpackage.a;
import java.nio.IntBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CardboardView extends FrameLayout {
    private static final int CHOREOGRAPHER_THREAD_JOIN_TIMEOUT_MS = 100;
    private static final String TAG = "CardboardView";
    private static boolean useCardboardGlSurfaceView = false;
    private CardboardLayout cardboardLayout;
    private CardboardViewApi cardboardViewApi;
    private ChoreographerThread choreographerThread;
    private boolean currentStereoRenderMode;
    private final int[] depthRenderBuffer;
    private boolean deviceParamsChanged;
    private final int[] framebuffer;
    private SafeSurfaceView glView;
    private long lastLogTime;
    private EyeData leftEyeData;
    private Eye monocularEye;
    private Renderer renderer;
    private EyeData rightEyeData;
    private boolean screenParamsChanged;
    private volatile boolean shutdownCalled;
    private boolean stereoRenderMode;
    private final int[] texture;

    /* JADX INFO: compiled from: PG */
    public class Eye {
        public static final int LEFT = 0;
        public static final int MONOCULAR = 2;
        static final float MONOCULAR_FOV_Y_DEGREES = 45.0f;
        public static final int RIGHT = 1;
        private final CardboardViewApi cardboardViewApi;
        private final int eyeType;
        private final float[] eyeFromHeadMatrix = new float[16];
        private final float[] projectionMatrix = new float[16];
        private final float[] eyeViewMatrix = new float[16];

        public Eye(int i, CardboardViewApi cardboardViewApi) {
            this.eyeType = i;
            this.cardboardViewApi = cardboardViewApi;
            resetEyeFromHeadMatrix();
        }

        private void computeMonocularPerspectiveMatrix(float f, float f2) {
            Matrix.perspectiveM(this.projectionMatrix, 0, MONOCULAR_FOV_Y_DEGREES, this.cardboardViewApi.getScreenParamsWidth() / this.cardboardViewApi.getScreenParamsHeight(), f, f2);
        }

        public void applyHeadView(float[] fArr) {
            Matrix.multiplyMM(this.eyeViewMatrix, 0, this.eyeFromHeadMatrix, 0, fArr, 0);
        }

        public float[] getEyeFromHead() {
            return this.eyeFromHeadMatrix;
        }

        public int getEyeType() {
            return this.eyeType;
        }

        public float[] getEyeView() {
            return this.eyeViewMatrix;
        }

        public float[] getFieldOfView() {
            return new float[]{this.cardboardViewApi.getFieldOfViewParamsLeft(), this.cardboardViewApi.getFieldOfViewParamsRight(), this.cardboardViewApi.getFieldOfViewParamsBottom(), this.cardboardViewApi.getFieldOfViewParamsTop()};
        }

        public float[] getPerspective(float f, float f2) {
            int i = this.eyeType;
            if (i == 2) {
                computeMonocularPerspectiveMatrix(f, f2);
            } else {
                this.cardboardViewApi.getEyeProjectionMatrix(i, f, f2, this.projectionMatrix);
            }
            return this.projectionMatrix;
        }

        public void resetEyeFromHeadMatrix() {
            CardboardViewApi cardboardViewApi = this.cardboardViewApi;
            if (cardboardViewApi != null) {
                int i = this.eyeType;
                float[] fArr = this.eyeFromHeadMatrix;
                if (i == 2) {
                    cardboardViewApi.getEyeFromHeadMatrix(0, fArr);
                } else {
                    cardboardViewApi.getEyeFromHeadMatrix(i, fArr);
                }
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    class EyeData {
        public final Eye eye;
        public final EyeTextureDescription textureDescription = new EyeTextureDescription();

        public EyeData(int i, CardboardViewApi cardboardViewApi) {
            this.eye = new Eye(i, cardboardViewApi);
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface Renderer {
        void onDrawEye(Eye eye);

        void onFinishFrame(Viewport viewport);

        void onNewFrame(HeadTransform headTransform);

        void onRendererShutdown();

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    /* JADX INFO: compiled from: PG */
    class SafeCardboardGLSurfaceView extends CardboardGLSurfaceView implements SafeSurfaceView {
        private boolean isViewAttached;
        private Runnable onViewDetachedRunnable;

        public SafeCardboardGLSurfaceView(Context context) {
            super(context);
            this.isViewAttached = false;
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public boolean isViewAttached() {
            return this.isViewAttached;
        }

        @Override // com.google.cardboard.sdk.CardboardGLSurfaceView, android.view.SurfaceView, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isViewAttached = true;
        }

        @Override // com.google.cardboard.sdk.CardboardGLSurfaceView, android.view.SurfaceView, android.view.View
        protected void onDetachedFromWindow() {
            Runnable runnable = this.onViewDetachedRunnable;
            if (runnable != null) {
                runnable.run();
            }
            this.isViewAttached = false;
            super.onDetachedFromWindow();
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public void setOnViewDetachedRunnable(Runnable runnable) {
            this.onViewDetachedRunnable = runnable;
        }
    }

    /* JADX INFO: compiled from: PG */
    class SafeGLSurfaceView extends GLSurfaceView implements SafeSurfaceView {
        private boolean isViewAttached;
        private Runnable onViewDetachedRunnable;

        public SafeGLSurfaceView(Context context) {
            super(context);
            this.isViewAttached = false;
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public boolean isViewAttached() {
            return this.isViewAttached;
        }

        @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.isViewAttached = true;
        }

        @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
        protected void onDetachedFromWindow() {
            Runnable runnable = this.onViewDetachedRunnable;
            if (runnable != null) {
                runnable.run();
            }
            this.isViewAttached = false;
            super.onDetachedFromWindow();
        }

        @Override // com.google.cardboard.sdk.CardboardView.SafeSurfaceView
        public void setOnViewDetachedRunnable(Runnable runnable) {
            this.onViewDetachedRunnable = runnable;
        }
    }

    /* JADX INFO: compiled from: PG */
    interface SafeSurfaceView {
        boolean isViewAttached();

        void onPause();

        void onResume();

        void queueEvent(Runnable runnable);

        void requestRender();

        void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6);

        void setEGLContextClientVersion(int i);

        void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory);

        void setLayoutParams(ViewGroup.LayoutParams layoutParams);

        void setOnTouchListener(View.OnTouchListener onTouchListener);

        void setOnViewDetachedRunnable(Runnable runnable);

        void setPreserveEGLContextOnPause(boolean z);

        void setRenderMode(int i);

        void setRenderer(GLSurfaceView.Renderer renderer);
    }

    public CardboardView(Context context) {
        super(context);
        this.depthRenderBuffer = new int[1];
        this.framebuffer = new int[1];
        this.texture = new int[1];
        this.shutdownCalled = false;
        Log.w(TAG, "CW(C)");
        initialize(context);
    }

    private static void checkGlError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        while (true) {
            Log.w(TAG, a.cd(GLU.gluErrorString(iGlGetError), str, ": glError "));
            int iGlGetError2 = GLES20.glGetError();
            if (iGlGetError2 == 0) {
                throw new RuntimeException("glError ".concat(String.valueOf(GLU.gluErrorString(iGlGetError))));
            }
            iGlGetError = iGlGetError2;
        }
    }

    private void errorLogCurrentState() {
        String str = TAG;
        boolean z = this.screenParamsChanged;
        boolean z2 = this.deviceParamsChanged;
        boolean z3 = this.stereoRenderMode;
        boolean z4 = this.currentStereoRenderMode;
        Renderer renderer = this.renderer;
        StringBuilder sb = new StringBuilder("screenParamsChanged: ");
        sb.append(z);
        sb.append(" | deviceParamsChanged: ");
        sb.append(z2);
        sb.append(" | stereoRenderMode: ");
        sb.append(z3);
        sb.append(" | currentStereoRenderMode: ");
        sb.append(z4);
        sb.append(" | renderer != null: ");
        sb.append(renderer != null);
        Log.w(str, sb.toString());
    }

    private float[] getPose() {
        float[] fArr = {0.0f, 0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 1.0f};
        this.cardboardViewApi.getPose(fArr, fArr2);
        return MathUtils.getMatrixFromPose(fArr, fArr2);
    }

    private void glSetup() {
        if (this.framebuffer[0] != 0) {
            glTeardown();
        }
        GLES20.glGenTextures(1, IntBuffer.wrap(this.texture));
        GLES20.glBindTexture(3553, this.texture[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6407, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight(), 0, 6407, 5121, null);
        EyeTextureDescription eyeTextureDescription = this.leftEyeData.textureDescription;
        long j = this.texture[0];
        eyeTextureDescription.texture = j;
        eyeTextureDescription.leftU = 0.0f;
        eyeTextureDescription.rightU = 0.5f;
        eyeTextureDescription.topV = 1.0f;
        eyeTextureDescription.bottomV = 0.0f;
        EyeTextureDescription eyeTextureDescription2 = this.rightEyeData.textureDescription;
        eyeTextureDescription2.texture = j;
        eyeTextureDescription2.leftU = 0.5f;
        eyeTextureDescription2.rightU = 1.0f;
        eyeTextureDescription2.topV = 1.0f;
        eyeTextureDescription2.bottomV = 0.0f;
        GLES20.glGenRenderbuffers(1, IntBuffer.wrap(this.depthRenderBuffer));
        GLES20.glBindRenderbuffer(36161, this.depthRenderBuffer[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight());
        checkGlError("Create Render buffer");
        GLES20.glGenFramebuffers(1, IntBuffer.wrap(this.framebuffer));
        GLES20.glBindFramebuffer(36160, this.framebuffer[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texture[0], 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.depthRenderBuffer[0]);
        checkGlError("glSetup");
    }

    private void glTeardown() {
        if (this.framebuffer[0] != 0) {
            GLES20.glDeleteRenderbuffers(1, IntBuffer.wrap(this.depthRenderBuffer));
            this.depthRenderBuffer[0] = 0;
            GLES20.glDeleteFramebuffers(1, IntBuffer.wrap(this.framebuffer));
            this.framebuffer[0] = 0;
            GLES20.glDeleteTextures(1, IntBuffer.wrap(this.texture));
            this.texture[0] = 0;
            checkGlError("glTeardown");
        }
    }

    private void initialize(Context context) {
        this.cardboardViewApi = new CardboardViewApi(context);
        this.renderer = null;
        boolean z = useCardboardGlSurfaceView;
        String str = TAG;
        if (z) {
            Log.w(str, "Using Cardboard Surface");
            this.glView = new SafeCardboardGLSurfaceView(context);
        } else {
            Log.w(str, "Using Android Surface");
            this.glView = new SafeGLSurfaceView(context);
        }
        this.glView.setEGLContextClientVersion(2);
        this.glView.setPreserveEGLContextOnPause(true);
        this.glView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView((SurfaceView) this.glView);
        this.cardboardLayout = new CardboardLayout(context, this);
        setStereoRenderMode(false);
        this.screenParamsChanged = false;
        this.deviceParamsChanged = false;
        addView(this.cardboardLayout.getView());
    }

    static /* synthetic */ boolean lambda$setOnTriggerEvent$0(Runnable runnable, View view, MotionEvent motionEvent) {
        if (runnable == null || motionEvent.getAction() != 0) {
            return false;
        }
        runnable.run();
        view.performClick();
        return true;
    }

    private void logOnDrawFrame() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.lastLogTime >= 1000) {
            this.lastLogTime = jUptimeMillis;
            Log.w(TAG, "DF");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDrawFrame() {
        if (this.shutdownCalled) {
            Log.w(TAG, "DFS");
            return;
        }
        this.currentStereoRenderMode = this.stereoRenderMode;
        logOnDrawFrame();
        updateDeviceParams();
        if (this.renderer != null) {
            try {
                HeadTransform headTransform = new HeadTransform();
                System.arraycopy(getPose(), 0, headTransform.getHeadView(), 0, 16);
                this.renderer.onNewFrame(headTransform);
            } catch (Throwable th) {
                errorLogCurrentState();
                throw th;
            }
        }
        if (this.currentStereoRenderMode) {
            onRenderStereoFrame();
        } else {
            onRenderMonocularFrame();
        }
        if (this.renderer != null) {
            try {
                Viewport viewport = new Viewport();
                viewport.setViewport(0, 0, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight());
                this.renderer.onFinishFrame(viewport);
            } catch (Throwable th2) {
                errorLogCurrentState();
                throw th2;
            }
        }
        checkGlError("onDrawFrame");
    }

    private void onRenderMonocularFrame() {
        if (this.currentStereoRenderMode) {
            return;
        }
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.renderer != null) {
            GLES20.glViewport(0, 0, this.cardboardViewApi.getScreenParamsWidth(), this.cardboardViewApi.getScreenParamsHeight());
            try {
                this.renderer.onDrawEye(this.monocularEye);
            } catch (Throwable th) {
                errorLogCurrentState();
                throw th;
            }
        }
    }

    private void onRenderStereoFrame() {
        if (this.currentStereoRenderMode) {
            GLES20.glBindFramebuffer(36160, this.framebuffer[0]);
            GLES20.glClear(16640);
            if (this.renderer != null) {
                GLES20.glViewport(0, 0, this.cardboardViewApi.getScreenParamsWidth() / 2, this.cardboardViewApi.getScreenParamsHeight());
                try {
                    this.renderer.onDrawEye(this.leftEyeData.eye);
                    GLES20.glViewport(this.cardboardViewApi.getScreenParamsWidth() / 2, 0, this.cardboardViewApi.getScreenParamsWidth() / 2, this.cardboardViewApi.getScreenParamsHeight());
                    try {
                        this.renderer.onDrawEye(this.rightEyeData.eye);
                    } catch (Throwable th) {
                        errorLogCurrentState();
                        throw th;
                    }
                } catch (Throwable th2) {
                    errorLogCurrentState();
                    throw th2;
                }
            }
            this.cardboardViewApi.renderEyeToDisplay(this.leftEyeData.textureDescription, this.rightEyeData.textureDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceChanged(int i, int i2) {
        String str = TAG;
        Log.w(str, a.ck(i2, i, "OSC(", ", ", (byte) 41));
        if (this.shutdownCalled) {
            Log.w(str, "OSCS");
            return;
        }
        this.cardboardViewApi.setScreenParams(i, i2);
        this.screenParamsChanged = true;
        Renderer renderer = this.renderer;
        if (renderer != null) {
            try {
                renderer.onSurfaceChanged(i, i2);
            } catch (Throwable th) {
                errorLogCurrentState();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceCreated(EGLConfig eGLConfig) {
        if (this.shutdownCalled) {
            Log.w(TAG, "OSCRS");
            return;
        }
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.onSurfaceCreated(eGLConfig);
        }
    }

    public static void setUseCardboardGlSurfaceView(boolean z) {
        useCardboardGlSurfaceView = z;
        Log.w(TAG, "CardboardSV(" + z + ')');
    }

    private boolean updateDeviceParams() {
        if (this.screenParamsChanged || this.deviceParamsChanged) {
            this.screenParamsChanged = false;
            this.deviceParamsChanged = false;
            this.cardboardViewApi.loadDeviceParams();
            if (this.currentStereoRenderMode) {
                Mesh distortionMesh = this.cardboardViewApi.getDistortionMesh(0);
                Mesh distortionMesh2 = this.cardboardViewApi.getDistortionMesh(1);
                this.leftEyeData = new EyeData(0, this.cardboardViewApi);
                this.rightEyeData = new EyeData(1, this.cardboardViewApi);
                glSetup();
                this.cardboardViewApi.initializeRenderThread();
                this.cardboardViewApi.setMesh(distortionMesh, 0);
                this.cardboardViewApi.setMesh(distortionMesh2, 1);
                checkGlError("updateDeviceParams");
            } else {
                glTeardown();
                this.monocularEye = new Eye(2, this.cardboardViewApi);
            }
        }
        return true;
    }

    public boolean isGlViewAttached() {
        return this.glView.isViewAttached();
    }

    public boolean isStereoRenderModeEnabled() {
        return this.stereoRenderMode;
    }

    public void loadDeviceParams() {
        Log.w(TAG, "LDP");
        this.deviceParamsChanged = true;
        this.cardboardViewApi.loadDeviceParams();
    }

    public void onDestroy() {
        Log.w(TAG, "OD");
        shutdownCalled();
        ChoreographerThread choreographerThread = this.choreographerThread;
        if (choreographerThread != null) {
            try {
                choreographerThread.stopLooper();
                this.choreographerThread.join(100L);
            } catch (SecurityException unused) {
                Log.e(TAG, "OD-SE");
            } catch (InterruptedException unused2) {
                Log.e(TAG, "OD-IE");
            } finally {
                this.choreographerThread = null;
            }
        }
        this.cardboardViewApi.close();
    }

    public void onPause() {
        Log.w(TAG, "OP");
        this.cardboardViewApi.pauseHeadTracker();
        this.glView.onPause();
    }

    public void onResume() {
        Log.w(TAG, "OR()");
        this.deviceParamsChanged = true;
        this.glView.onResume();
        this.cardboardViewApi.resumeHeadTracker();
    }

    public void onSettingsButtonClick() {
        Log.w(TAG, "OSBC");
        this.cardboardViewApi.scanViewerQrCode();
    }

    public void queueEvent(Runnable runnable) {
        this.glView.queueEvent(runnable);
    }

    public void scanViewerQrCode() {
        Log.w(TAG, "SVQRC");
        this.cardboardViewApi.scanViewerQrCode();
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        this.glView.setEGLConfigChooser(i, i2, i3, i4, i5, i6);
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.glView.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    public void setOnBackButtonClick(Runnable runnable) {
        Log.w(TAG, "SOBBC");
        this.cardboardLayout.setOnBackButtonClick(runnable);
    }

    public void setOnSettingsButtonClick(Runnable runnable) {
        Log.w(TAG, "SOSBC");
        this.cardboardLayout.setOnSettingskButtonClick(runnable);
    }

    public void setOnTriggerEvent(final Runnable runnable) {
        Log.w(TAG, "SOTE");
        this.glView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.cardboard.sdk.CardboardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CardboardView.lambda$setOnTriggerEvent$0(runnable, view, motionEvent);
            }
        });
    }

    public void setOnViewDetachedRunnable(Runnable runnable) {
        Log.w(TAG, "SOVDR");
        this.glView.setOnViewDetachedRunnable(runnable);
    }

    public void setRenderer(Renderer renderer) {
        Log.w(TAG, "SR");
        this.renderer = renderer;
        this.lastLogTime = SystemClock.uptimeMillis();
        this.glView.setRenderer(new GLSurfaceView.Renderer(this) { // from class: com.google.cardboard.sdk.CardboardView.1
            final /* synthetic */ CardboardView this$0;

            {
                this.getClass();
                this.this$0 = this;
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onDrawFrame(GL10 gl10) {
                this.this$0.onDrawFrame();
                if (this.this$0.shutdownCalled || this.this$0.choreographerThread == null) {
                    return;
                }
                CardboardView cardboardView = this.this$0;
                cardboardView.choreographerThread.requestRenderOnVsyncEvent(cardboardView.glView);
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceChanged(GL10 gl10, int i, int i2) {
                this.this$0.onSurfaceChanged(i, i2);
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                this.this$0.onSurfaceCreated(eGLConfig);
            }
        });
        this.glView.setRenderMode(0);
        ChoreographerThread choreographerThread = new ChoreographerThread();
        this.choreographerThread = choreographerThread;
        choreographerThread.start();
        this.choreographerThread.requestRenderOnVsyncEvent(this.glView);
    }

    public void setStereoRenderMode(boolean z) {
        Log.w(TAG, "SSRMode(" + z + ')');
        this.stereoRenderMode = z;
        this.screenParamsChanged = true;
        CardboardLayout cardboardLayout = this.cardboardLayout;
        if (z) {
            cardboardLayout.showAll();
        } else {
            cardboardLayout.hideAll();
        }
    }

    public void shutdownCalled() {
        this.shutdownCalled = true;
    }

    /* JADX INFO: compiled from: PG */
    class ChoreographerThread extends Thread {
        private volatile Handler handler;

        public synchronized void requestRenderOnVsyncEvent(final SafeSurfaceView safeSurfaceView) {
            if (this.handler != null) {
                int i = Build.VERSION.SDK_INT;
                Handler handler = this.handler;
                if (i < 33) {
                    handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardView$ChoreographerThread$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.google.cardboard.sdk.CardboardView$ChoreographerThread$$ExternalSyntheticLambda2
                                @Override // android.view.Choreographer.FrameCallback
                                public final void doFrame(long j) {
                                    safeSurfaceView.requestRender();
                                }
                            });
                        }
                    });
                    return;
                }
                handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardView$ChoreographerThread$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Choreographer.getInstance().postVsyncCallback(new Choreographer$VsyncCallback() { // from class: com.google.cardboard.sdk.CardboardView$ChoreographerThread$$ExternalSyntheticLambda3
                            public final void onVsync(Choreographer.FrameData frameData) {
                                safeSurfaceView.requestRender();
                            }
                        });
                    }
                });
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.handler = new Handler(this, Looper.myLooper()) { // from class: com.google.cardboard.sdk.CardboardView.ChoreographerThread.1
                {
                    this.getClass();
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                }
            };
            Looper.loop();
        }

        public synchronized void stopLooper() {
            if (this.handler != null) {
                this.handler.getLooper().quit();
                this.handler = null;
            }
        }

        private ChoreographerThread() {
        }
    }

    public CardboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.depthRenderBuffer = new int[1];
        this.framebuffer = new int[1];
        this.texture = new int[1];
        this.shutdownCalled = false;
        Log.w(TAG, "CW(C,A)");
        initialize(context);
    }
}
