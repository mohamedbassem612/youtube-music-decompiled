package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.cardboard.sdk.EglFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ctc extends HandlerThread implements Handler.Callback {
    public bvj a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public ctd e;

    public ctc() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            int i2 = message.arg1;
                            bvj bvjVar = this.a;
                            bvjVar.getClass();
                            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                            bvo.g(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                            int[] iArr = new int[2];
                            bvo.g(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                            bvjVar.d = eGLDisplayEglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr2 = new int[1];
                            boolean zEglChooseConfig = EGL14.eglChooseConfig(bvjVar.d, bvj.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                            bvo.g(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, bwp.K("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(bvjVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344} : new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12992, 1, 12344}, 0);
                            bvo.g(eGLContextEglCreateContext != null, "eglCreateContext failed");
                            bvjVar.e = eGLContextEglCreateContext;
                            EGLDisplay eGLDisplay = bvjVar.d;
                            EGLContext eGLContext = bvjVar.e;
                            if (i2 == 1) {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                bvo.g(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                            }
                            bvo.g(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
                            bvjVar.f = eGLSurfaceEglCreatePbufferSurface;
                            int[] iArr3 = bvjVar.c;
                            GLES20.glGenTextures(1, iArr3, 0);
                            bvo.f();
                            bvjVar.g = new SurfaceTexture(iArr3[0]);
                            bvjVar.g.setOnFrameAvailableListener(bvjVar);
                            SurfaceTexture surfaceTexture = this.a.g;
                            surfaceTexture.getClass();
                            this.e = new ctd(this, surfaceTexture, i2 != 0);
                            synchronized (this) {
                                notify();
                            }
                        } catch (bvn e) {
                            bvx.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                            this.d = new IllegalStateException(e);
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e2) {
                        bvx.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.c = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (RuntimeException e3) {
                    bvx.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    bvj bvjVar2 = this.a;
                    bvjVar2.getClass();
                    bvjVar2.b.removeCallbacks(bvjVar2);
                    try {
                        SurfaceTexture surfaceTexture2 = bvjVar2.g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.release();
                            GLES20.glDeleteTextures(1, bvjVar2.c, 0);
                        }
                        EGLDisplay eGLDisplay2 = bvjVar2.d;
                        if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(bvjVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface = bvjVar2.f;
                        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(bvjVar2.d, bvjVar2.f);
                        }
                        EGLContext eGLContext2 = bvjVar2.e;
                        if (eGLContext2 != null) {
                            EGL14.eglDestroyContext(bvjVar2.d, eGLContext2);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay3 = bvjVar2.d;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(bvjVar2.d);
                        }
                        bvjVar2.d = null;
                        bvjVar2.e = null;
                        bvjVar2.f = null;
                        bvjVar2.g = null;
                    } catch (Throwable th) {
                        EGLDisplay eGLDisplay4 = bvjVar2.d;
                        if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(bvjVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface2 = bvjVar2.f;
                        if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(bvjVar2.d, bvjVar2.f);
                        }
                        EGLContext eGLContext3 = bvjVar2.e;
                        if (eGLContext3 != null) {
                            EGL14.eglDestroyContext(bvjVar2.d, eGLContext3);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay5 = bvjVar2.d;
                        if (eGLDisplay5 != null && !eGLDisplay5.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(bvjVar2.d);
                        }
                        bvjVar2.d = null;
                        bvjVar2.e = null;
                        bvjVar2.f = null;
                        bvjVar2.g = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bvx.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
