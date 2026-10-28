package com.google.cardboard.sdk;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import defpackage.a;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CardboardGLSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final int GL_CONTEXT_FLAG_NO_ERROR_BIT_KHR = 8;
    private static final boolean LOG_ATTACH_DETACH = false;
    private static final boolean LOG_EGL = false;
    private static final boolean LOG_PAUSE_RESUME = false;
    private static final boolean LOG_RENDERER = false;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = false;
    private static final boolean LOG_THREADS = false;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    public static final int SWAPMODE_MANUAL = 2;
    public static final int SWAPMODE_QUEUED = 0;
    public static final int SWAPMODE_SINGLE = 1;
    private static final String TAG = "CardboardGLSurfaceView";
    private int mDebugFlags;
    private boolean mDetached;
    private GLSurfaceView.EGLConfigChooser mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private GLSurfaceView.EGLContextFactory mEGLContextFactory;
    private GLSurfaceView.EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GLThread mGLThread;
    private GLWrapper mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    private boolean mPreserveGlThreadOnDetachedFromWindow;
    private GLSurfaceView.Renderer mRenderer;
    private final WeakReference mThisWeakRef;

    /* JADX INFO: compiled from: PG */
    abstract class BaseConfigChooser implements GLSurfaceView.EGLConfigChooser {
        private static final String LOG_TAG = "CardboardGLSurfaceView::BaseConfigChooser";
        protected int[] mConfigSpec;
        final /* synthetic */ CardboardGLSurfaceView this$0;

        public BaseConfigChooser(CardboardGLSurfaceView cardboardGLSurfaceView, int[] iArr) {
            cardboardGLSurfaceView.getClass();
            this.this$0 = cardboardGLSurfaceView;
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        private int[] filterConfigSpec(int[] iArr) {
            if (this.this$0.mEGLContextClientVersion != 2 && this.this$0.mEGLContextClientVersion != 3) {
                return iArr;
            }
            int length = iArr.length;
            int i = length - 1;
            int[] iArr2 = new int[length + 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr2[i] = 12352;
            if (this.this$0.mEGLContextClientVersion == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int i = 1;
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                int i2 = iArr[0];
                if (i2 <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                if (!egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i2, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                EGLConfig eGLConfigChooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
                if (eGLConfigChooseConfig != null) {
                    return eGLConfigChooseConfig;
                }
                throw new IllegalArgumentException("No config chosen");
            }
            while (true) {
                int[] iArr2 = this.mConfigSpec;
                if (i >= iArr2.length) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                if (iArr2[i - 1] == 12352 && iArr2[i] == 64) {
                    Log.w(LOG_TAG, "Failed to choose GLES 3 config, will try 2.");
                    this.mConfigSpec[i] = 4;
                    return chooseConfig(egl10, eGLDisplay);
                }
                i++;
            }
        }

        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);
    }

    /* JADX INFO: compiled from: PG */
    class ComponentSizeChooser extends BaseConfigChooser {
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentSizeChooser(CardboardGLSurfaceView cardboardGLSurfaceView, int i, int i2, int i3, int i4, int i5, int i6) {
            super(cardboardGLSurfaceView, new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            cardboardGLSurfaceView.getClass();
            this.mValue = new int[1];
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue) ? this.mValue[0] : i2;
        }

        @Override // com.google.cardboard.sdk.CardboardGLSurfaceView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i = 0;
            while (i < length) {
                EGLConfig eGLConfig = eGLConfigArr[i];
                ComponentSizeChooser componentSizeChooser = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iFindConfigAttrib = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iFindConfigAttrib2 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iFindConfigAttrib >= componentSizeChooser.mDepthSize && iFindConfigAttrib2 >= componentSizeChooser.mStencilSize) {
                    int iFindConfigAttrib3 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iFindConfigAttrib4 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iFindConfigAttrib5 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iFindConfigAttrib6 = componentSizeChooser.findConfigAttrib(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iFindConfigAttrib3 == componentSizeChooser.mRedSize && iFindConfigAttrib4 == componentSizeChooser.mGreenSize && iFindConfigAttrib5 == componentSizeChooser.mBlueSize && iFindConfigAttrib6 == componentSizeChooser.mAlphaSize) {
                        return eGLConfig;
                    }
                }
                i++;
                this = componentSizeChooser;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: PG */
    class DefaultContextFactory implements GLSurfaceView.EGLContextFactory {
        private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        private static final String LOG_TAG = "CardboardGLSurfaceView::DefaultContextFactory";
        final /* synthetic */ CardboardGLSurfaceView this$0;

        private DefaultContextFactory(CardboardGLSurfaceView cardboardGLSurfaceView) {
            cardboardGLSurfaceView.getClass();
            this.this$0 = cardboardGLSurfaceView;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {12440, this.this$0.mEGLContextClientVersion, 12344};
            CardboardGLSurfaceView cardboardGLSurfaceView = this.this$0;
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (cardboardGLSurfaceView.mEGLContextClientVersion == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", a.bX(eGLContext, eGLDisplay, "display:", " context: "));
            EglHelper.throwEglException("eglDestroyContext", egl10.eglGetError());
        }
    }

    /* JADX INFO: compiled from: PG */
    class DefaultWindowSurfaceFactory implements GLSurfaceView.EGLWindowSurfaceFactory {
        private static final String LOG_TAG = "CardboardGLSurfaceView::DefaultWindowSurfaceFactory";

        private DefaultWindowSurfaceFactory() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e) {
                Log.e(LOG_TAG, "eglCreateWindowSurface", e);
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* JADX INFO: compiled from: PG */
    class GLThread extends Thread {
        private static final String LOG_MAIN_THREAD_TAG = "CardboardGLSurfaceView::MainThread";
        private static final String LOG_TAG = "CardboardGLSurfaceView::GLThread";
        private WeakReference mCardboardGLSurfaceViewWeakRef;
        private EglHelper mEglHelper;
        private boolean mExited;
        private boolean mFinishedCreatingEglSurface;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private boolean mPaused;
        private boolean mRenderComplete;
        private boolean mRequestPaused;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private ArrayList mEventQueue = new ArrayList();
        private boolean mSizeChanged = true;
        private final GLThreadManager mGLThreadManager = new GLThreadManager();
        private int mWidth = 0;
        private int mHeight = 0;
        private boolean mRequestRender = true;
        private int mRenderMode = 1;
        private int mRequestedSwapMode = 0;
        private boolean mWantRenderNotification = false;

        /* JADX INFO: compiled from: PG */
        class GLThreadManager {
            private static final String TAG = "GLThreadManager";

            private GLThreadManager() {
            }

            public void releaseEglContextLocked(GLThread gLThread) {
                notifyAll();
            }

            public synchronized void threadExiting(GLThread gLThread) {
                gLThread.mExited = true;
                notifyAll();
            }
        }

        public GLThread(WeakReference weakReference) {
            this.mCardboardGLSurfaceViewWeakRef = weakReference;
        }

        /* JADX WARN: Code duplicated, block: B:153:0x0203  */
        /* JADX WARN: Code duplicated, block: B:155:0x0206  */
        /* JADX WARN: Code duplicated, block: B:177:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        private void guardedRun() {
            int i;
            int i2;
            boolean z;
            CardboardGLSurfaceView cardboardGLSurfaceView;
            CardboardGLSurfaceView cardboardGLSurfaceView2;
            boolean z2;
            CardboardGLSurfaceView cardboardGLSurfaceView3;
            this.mEglHelper = new EglHelper(this.mCardboardGLSurfaceViewWeakRef);
            this.mHaveEglContext = false;
            this.mHaveEglSurface = false;
            this.mWantRenderNotification = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int i3 = 0;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            int i4 = 0;
            int i5 = 0;
            GL10 gl10 = null;
            while (true) {
                Runnable runnable = null;
                while (true) {
                    try {
                        synchronized (this.mGLThreadManager) {
                            while (true) {
                                if (this.mShouldExit) {
                                    synchronized (this.mGLThreadManager) {
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                    }
                                    return;
                                }
                                if (!this.mEventQueue.isEmpty()) {
                                    runnable = (Runnable) this.mEventQueue.remove(0);
                                    z3 = z3;
                                    i = 0;
                                    break;
                                }
                                boolean z12 = z3;
                                boolean z13 = this.mPaused;
                                boolean z14 = this.mRequestPaused;
                                if (z13 != z14) {
                                    this.mPaused = z14;
                                    this.mGLThreadManager.notifyAll();
                                } else {
                                    z14 = false;
                                }
                                if (this.mShouldReleaseEglContext) {
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    this.mShouldReleaseEglContext = false;
                                    z5 = true;
                                }
                                if (z12) {
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                }
                                if (z14) {
                                    if (this.mHaveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    if (this.mHaveEglContext && ((cardboardGLSurfaceView3 = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get()) == null || !cardboardGLSurfaceView3.mPreserveEGLContextOnPause)) {
                                        stopEglContextLocked();
                                    }
                                }
                                if (!this.mHasSurface && !this.mWaitingForSurface) {
                                    if (this.mHaveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    this.mWaitingForSurface = true;
                                    this.mSurfaceIsBad = false;
                                    this.mGLThreadManager.notifyAll();
                                }
                                if (this.mHasSurface && this.mWaitingForSurface) {
                                    this.mWaitingForSurface = false;
                                    this.mGLThreadManager.notifyAll();
                                }
                                if (z4) {
                                    this.mWantRenderNotification = false;
                                    this.mRenderComplete = true;
                                    this.mGLThreadManager.notifyAll();
                                }
                                if (readyToDraw()) {
                                    if (this.mHaveEglContext) {
                                        z2 = z5;
                                    } else {
                                        if (!z5) {
                                            try {
                                                this.mEglHelper.start();
                                                if (this.mEglHelper.mEglContext != null) {
                                                    this.mHaveEglContext = true;
                                                    this.mGLThreadManager.notifyAll();
                                                    z2 = false;
                                                    z7 = true;
                                                }
                                            } catch (RuntimeException e) {
                                                this.mGLThreadManager.releaseEglContextLocked(this);
                                                throw e;
                                            }
                                        }
                                        z2 = false;
                                    }
                                    if (this.mHaveEglContext && !this.mHaveEglSurface) {
                                        this.mHaveEglSurface = true;
                                        z8 = true;
                                        z9 = true;
                                        z10 = true;
                                    }
                                    if (this.mHaveEglSurface) {
                                        if (this.mSizeChanged) {
                                            i4 = this.mWidth;
                                            i5 = this.mHeight;
                                            this.mWantRenderNotification = true;
                                            this.mSizeChanged = false;
                                            z8 = true;
                                            z10 = true;
                                        }
                                        i = 0;
                                        this.mRequestRender = false;
                                        this.mGLThreadManager.notifyAll();
                                        z6 |= this.mWantRenderNotification;
                                        int i6 = this.mRequestedSwapMode;
                                        z11 = i6 != i3;
                                        z5 = z2;
                                        i3 = i6;
                                        z3 = false;
                                        z4 = false;
                                        break;
                                    }
                                    z5 = z2;
                                }
                                this.mGLThreadManager.wait();
                                z3 = false;
                                z4 = false;
                            }
                        }
                        if (runnable != null) {
                            break;
                        }
                        if (z8) {
                            boolean zCreateSurface = this.mEglHelper.createSurface();
                            GLThreadManager gLThreadManager = this.mGLThreadManager;
                            if (zCreateSurface) {
                                synchronized (gLThreadManager) {
                                    try {
                                        this.mFinishedCreatingEglSurface = true;
                                        this.mGLThreadManager.notifyAll();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                i3 = i;
                            } else {
                                synchronized (gLThreadManager) {
                                    try {
                                        this.mFinishedCreatingEglSurface = true;
                                        this.mSurfaceIsBad = true;
                                        this.mGLThreadManager.notifyAll();
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            synchronized (this.mGLThreadManager) {
                                stopEglSurfaceLocked();
                                stopEglContextLocked();
                                throw th;
                            }
                        }
                        if (z9) {
                            gl10 = (GL10) this.mEglHelper.createGL();
                        }
                        if (z7 && (cardboardGLSurfaceView2 = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get()) != null) {
                            cardboardGLSurfaceView2.mRenderer.onSurfaceCreated(gl10, this.mEglHelper.mEglConfig);
                        }
                        if (z10 && (cardboardGLSurfaceView = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get()) != null) {
                            cardboardGLSurfaceView.mRenderer.onSurfaceChanged(gl10, i4, i5);
                        }
                        if (z11) {
                            this.mEglHelper.setEglSurfaceAttrib(12422, i3 == 1 ? 12421 : 12420);
                            this.mEglHelper.setEglSurfaceAttrib(EglHelper.EGL_FRONT_BUFFER_AUTO_REFRESH, i3 == 1 ? 1 : 0);
                        }
                        CardboardGLSurfaceView cardboardGLSurfaceView4 = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get();
                        if (cardboardGLSurfaceView4 != null) {
                            cardboardGLSurfaceView4.mRenderer.onDrawFrame(gl10);
                        }
                        if (z11) {
                            i2 = i3;
                        } else {
                            if (i3 == 0) {
                                i2 = 0;
                            } else {
                                z = true;
                            }
                            if (z6) {
                                z4 = z;
                                z6 = false;
                            }
                            z7 = false;
                            z8 = false;
                            z9 = false;
                            z10 = false;
                        }
                        int iSwap = this.mEglHelper.swap();
                        if (iSwap == 12288) {
                            z = true;
                        } else if (iSwap != 12302) {
                            EglHelper.logEglErrorAsWarning(LOG_TAG, "eglSwapBuffers", iSwap);
                            if (i2 == 0) {
                                synchronized (this.mGLThreadManager) {
                                    z = true;
                                    this.mSurfaceIsBad = true;
                                    this.mGLThreadManager.notifyAll();
                                }
                            } else {
                                z = true;
                            }
                        } else {
                            z = true;
                            z3 = true;
                        }
                        if (z6) {
                            z4 = z;
                            z6 = false;
                        }
                        z7 = false;
                        z8 = false;
                        z9 = false;
                        z10 = false;
                    } catch (Throwable th3) {
                        synchronized (this.mGLThreadManager) {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                            throw th3;
                        }
                    }
                }
                runnable.run();
            }
        }

        private boolean readyToDraw() {
            if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0) {
                return false;
            }
            return this.mRequestRender || this.mRenderMode == 1;
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                this.mGLThreadManager.releaseEglContextLocked(this);
            }
        }

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        public boolean ableToDraw() {
            return this.mHaveEglContext && this.mHaveEglSurface && readyToDraw();
        }

        public int getRenderMode() {
            int i;
            synchronized (this.mGLThreadManager) {
                i = this.mRenderMode;
            }
            return i;
        }

        public int getSwapMode() {
            int i;
            synchronized (this.mGLThreadManager) {
                i = this.mRequestedSwapMode;
            }
            return i;
        }

        public void onPause(Runnable runnable) {
            synchronized (this.mGLThreadManager) {
                this.mRequestPaused = true;
                if (runnable != null) {
                    this.mEventQueue.add(runnable);
                }
                this.mGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused) {
                    try {
                        this.mGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onResume() {
            synchronized (this.mGLThreadManager) {
                this.mRequestPaused = false;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                this.mGLThreadManager.notifyAll();
                while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                    try {
                        this.mGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void onWindowResize(int i, int i2) {
            synchronized (this.mGLThreadManager) {
                this.mWidth = i;
                this.mHeight = i2;
                this.mSizeChanged = true;
                this.mRequestRender = true;
                this.mRenderComplete = false;
                if (Thread.currentThread() == this) {
                    return;
                }
                this.mGLThreadManager.notifyAll();
                while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                    try {
                        this.mGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void queueEvent(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (this.mGLThreadManager) {
                this.mEventQueue.add(runnable);
                this.mGLThreadManager.notifyAll();
            }
        }

        public void requestExitAndWait() {
            synchronized (this.mGLThreadManager) {
                this.mShouldExit = true;
                this.mGLThreadManager.notifyAll();
                while (!this.mExited) {
                    try {
                        this.mGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void requestReleaseEglContextLocked() {
            this.mShouldReleaseEglContext = true;
            this.mGLThreadManager.notifyAll();
        }

        public void requestRender() {
            synchronized (this.mGLThreadManager) {
                this.mRequestRender = true;
                this.mGLThreadManager.notifyAll();
            }
        }

        public void requestRenderAndWait() {
            synchronized (this.mGLThreadManager) {
                try {
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    this.mWantRenderNotification = true;
                    this.mRequestRender = true;
                    this.mRenderComplete = false;
                    this.mGLThreadManager.notifyAll();
                    while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                        try {
                            this.mGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                guardedRun();
            } catch (InterruptedException unused) {
            } finally {
                this.mGLThreadManager.threadExiting(this);
            }
        }

        public void setRenderMode(int i) {
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (this.mGLThreadManager) {
                this.mRenderMode = i;
                this.mGLThreadManager.notifyAll();
            }
        }

        public void setSwapMode(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("swapMode");
            }
            synchronized (this.mGLThreadManager) {
                this.mRequestedSwapMode = i;
                this.mGLThreadManager.notifyAll();
            }
        }

        public void surfaceCreated() {
            synchronized (this.mGLThreadManager) {
                this.mHasSurface = true;
                this.mFinishedCreatingEglSurface = false;
                this.mGLThreadManager.notifyAll();
                while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                    try {
                        this.mGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void surfaceDestroyed(Runnable runnable) {
            synchronized (this.mGLThreadManager) {
                this.mHasSurface = false;
                if (runnable != null) {
                    this.mEventQueue.add(runnable);
                }
                this.mGLThreadManager.notifyAll();
                while (!this.mWaitingForSurface && !this.mExited) {
                    try {
                        this.mGLThreadManager.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface GLWrapper {
        GL wrap(GL gl);
    }

    /* JADX INFO: compiled from: PG */
    class LogWriter extends Writer {
        private StringBuilder mBuilder = new StringBuilder();

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                this.mBuilder.toString();
                StringBuilder sb = this.mBuilder;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    class SimpleEGLConfigChooser extends ComponentSizeChooser {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleEGLConfigChooser(CardboardGLSurfaceView cardboardGLSurfaceView, boolean z) {
            super(cardboardGLSurfaceView, 8, 8, 8, 0, true != z ? 0 : 16, 0);
            cardboardGLSurfaceView.getClass();
        }
    }

    public CardboardGLSurfaceView(Context context) {
        super(context);
        this.mThisWeakRef = new WeakReference(this);
        init();
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void init() {
        getHolder().addCallback(this);
    }

    protected void finalize() throws Throwable {
        try {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    protected boolean isDetachedFromWindow() {
        return this.mDetached;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        int swapMode;
        int renderMode;
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null && !this.mPreserveGlThreadOnDetachedFromWindow) {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                renderMode = gLThread.getRenderMode();
                swapMode = this.mGLThread.getSwapMode();
            } else {
                swapMode = 0;
                renderMode = 1;
            }
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.mGLThread = gLThread2;
            if (renderMode != 1) {
                gLThread2.setRenderMode(renderMode);
            }
            if (swapMode != 0) {
                this.mGLThread.setSwapMode(swapMode);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.mGLThread != null && !this.mPreserveGlThreadOnDetachedFromWindow) {
            requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onPause() {
        this.mGLThread.onPause(null);
    }

    public void onResume() {
        this.mGLThread.onResume();
    }

    public void onSurfaceDestroyed(Runnable runnable) {
        this.mGLThread.surfaceDestroyed(runnable);
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public void requestExitAndWait() {
        this.mGLThread.requestExitAndWait();
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(this, i, i2, i3, i4, i5, i6));
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    public void setPreserveGlThreadOnDetachedFromWindow(boolean z) {
        checkRenderThreadState();
        this.mPreserveGlThreadOnDetachedFromWindow = z;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(this, true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory();
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory();
        }
        this.mRenderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread = gLThread;
        gLThread.start();
    }

    public void setSwapMode(int i) {
        if (i == 1) {
            i = 1;
        }
        this.mGLThread.setSwapMode(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.mGLThread.onWindowResize(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        onSurfaceDestroyed(null);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.mGLThread.requestRenderAndWait();
    }

    public void onPause(Runnable runnable) {
        this.mGLThread.onPause(runnable);
    }

    /* JADX INFO: compiled from: PG */
    class EglHelper {
        public static final int EGL_FRONT_BUFFER_AUTO_REFRESH = 12620;
        private static final String LOG_TAG = "CardboardGLSurfaceView::EglHelper";
        private WeakReference mCardboardGLSurfaceViewWeakRef;
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        EGLContext mPendingEglContext;
        EGLDisplay mPendingEglDisplay;

        public EglHelper(WeakReference weakReference) {
            this.mCardboardGLSurfaceViewWeakRef = weakReference;
        }

        private void createPendingEglContext() {
            EGLContext eGLContextCreateContext;
            EGLDisplay eGLDisplayEglGetDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mPendingEglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.mEgl.eglInitialize(this.mPendingEglDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            CardboardGLSurfaceView cardboardGLSurfaceView = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get();
            EGLContext eGLContext = null;
            if (cardboardGLSurfaceView == null) {
                this.mEglConfig = null;
                eGLContextCreateContext = null;
            } else {
                this.mEglConfig = cardboardGLSurfaceView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mPendingEglDisplay);
                eGLContextCreateContext = cardboardGLSurfaceView.mEGLContextFactory.createContext(this.mEgl, this.mPendingEglDisplay, this.mEglConfig);
            }
            if (eGLContextCreateContext == null || eGLContextCreateContext == EGL10.EGL_NO_CONTEXT) {
                int iEglGetError = this.mEgl.eglGetError();
                if (iEglGetError == 12294) {
                    Log.e(LOG_TAG, "Stashed EGL context has become invalid and can no longer be used for sharing.");
                    this.mPendingEglContext = null;
                    this.mPendingEglDisplay = null;
                    this.mEglConfig = null;
                    return;
                }
                throwEglException("createPendingEglContext", iEglGetError);
            } else {
                eGLContext = eGLContextCreateContext;
            }
            this.mPendingEglContext = eGLContext;
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                return;
            }
            this.mEgl.eglMakeCurrent(this.mEglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            CardboardGLSurfaceView cardboardGLSurfaceView = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get();
            if (cardboardGLSurfaceView != null) {
                cardboardGLSurfaceView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
            }
            this.mEglSurface = null;
        }

        public static String formatEglError(String str, int i) {
            return str + " failed: " + getErrorString(i);
        }

        private static String getErrorString(int i) {
            switch (i) {
                case 12288:
                    return "EGL_SUCCESS";
                case 12289:
                    return "EGL_NOT_INITIALIZED";
                case 12290:
                    return "EGL_BAD_ACCESS";
                case 12291:
                    return "EGL_BAD_ALLOC";
                case 12292:
                    return "EGL_BAD_ATTRIBUTE";
                case 12293:
                    return "EGL_BAD_CONFIG";
                case 12294:
                    return "EGL_BAD_CONTEXT";
                case 12295:
                    return "EGL_BAD_CURRENT_SURFACE";
                case 12296:
                    return "EGL_BAD_DISPLAY";
                case 12297:
                    return "EGL_BAD_MATCH";
                case 12298:
                    return "EGL_BAD_NATIVE_PIXMAP";
                case 12299:
                    return "EGL_BAD_NATIVE_WINDOW";
                case 12300:
                    return "EGL_BAD_PARAMETER";
                case 12301:
                    return "EGL_BAD_SURFACE";
                case 12302:
                    return "EGL_CONTEXT_LOST";
                default:
                    return getHex(i);
            }
        }

        private static String getHex(int i) {
            return "0x".concat(String.valueOf(Integer.toHexString(i)));
        }

        private void initialize() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.mEgl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            this.mEglSurface = null;
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
            Log.w(str, formatEglError(str2, i));
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
        }

        public GL createGL() {
            GL gl = this.mEglContext.getGL();
            CardboardGLSurfaceView cardboardGLSurfaceView = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get();
            if (cardboardGLSurfaceView == null) {
                return gl;
            }
            if (cardboardGLSurfaceView.mGLWrapper != null) {
                gl = cardboardGLSurfaceView.mGLWrapper.wrap(gl);
            }
            if ((cardboardGLSurfaceView.mDebugFlags & 3) != 0) {
                return GLDebugHelper.wrap(gl, cardboardGLSurfaceView.mDebugFlags & 1, (cardboardGLSurfaceView.mDebugFlags & 2) != 0 ? new LogWriter() : null);
            }
            return gl;
        }

        public boolean createSurface() {
            if (this.mEgl == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.mEglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.mEglConfig == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            destroySurfaceImp();
            CardboardGLSurfaceView cardboardGLSurfaceView = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get();
            if (cardboardGLSurfaceView != null) {
                this.mEglSurface = cardboardGLSurfaceView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, cardboardGLSurfaceView.getHolder());
            } else {
                this.mEglSurface = null;
            }
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.mEgl.eglGetError() != 12299) {
                    return false;
                }
                Log.e(LOG_TAG, "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                return false;
            }
            EGL10 egl10 = this.mEgl;
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface2 = this.mEglSurface;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.mEglContext)) {
                return true;
            }
            logEglErrorAsWarning(LOG_TAG, "eglMakeCurrent", this.mEgl.eglGetError());
            return false;
        }

        public void destroySurface() {
            destroySurfaceImp();
        }

        public void finish() {
            if (this.mEglContext != null) {
                CardboardGLSurfaceView cardboardGLSurfaceView = (CardboardGLSurfaceView) this.mCardboardGLSurfaceViewWeakRef.get();
                if (cardboardGLSurfaceView != null) {
                    cardboardGLSurfaceView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        public void renewPendingEglContext() {
            if (this.mEgl == null) {
                initialize();
            }
            EGLContext eGLContext = this.mPendingEglContext;
            if (eGLContext != null) {
                this.mEgl.eglDestroyContext(this.mEglDisplay, eGLContext);
            }
            createPendingEglContext();
        }

        public void setEglSurfaceAttrib(int i, int i2) {
            if (EGL14.eglSurfaceAttrib(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), i, i2)) {
                return;
            }
            Log.e(LOG_TAG, a.bQ(i2, i, "eglSurfaceAttrib() failed. attribute=", " value="));
        }

        public void start() {
            if (this.mEgl == null) {
                initialize();
            }
            EGLContext eGLContext = this.mEglContext;
            if (eGLContext != null) {
                this.mEgl.eglDestroyContext(this.mEglDisplay, eGLContext);
                this.mEglContext = null;
            }
            if (this.mPendingEglContext == null) {
                createPendingEglContext();
            }
            this.mEglContext = this.mPendingEglContext;
            this.mEglDisplay = this.mPendingEglDisplay;
            this.mPendingEglContext = null;
            this.mPendingEglDisplay = null;
        }

        public int swap() {
            if (this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
                return 12288;
            }
            return this.mEgl.eglGetError();
        }

        public static void throwEglException(String str, int i) {
            throw new RuntimeException(formatEglError(str, i));
        }
    }

    public CardboardGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mThisWeakRef = new WeakReference(this);
        init();
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(this, z));
    }
}
