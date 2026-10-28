package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.cardboard.sdk.EglFactory;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vbz {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl");
    public final Looper b;
    public final Thread c;
    public boolean d;
    public volatile String e;
    public volatile String f;
    private final AtomicBoolean g;
    private boolean h;

    public vbz() {
        HandlerThread handlerThread = new HandlerThread("vbz");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.g = new AtomicBoolean(false);
        this.b = looper;
        this.c = looper.getThread();
    }

    private final void e() {
        if (this.g.getAndSet(true)) {
            return;
        }
        new Handler(this.b).post(new Runnable() { // from class: vby
            /* JADX WARN: Code duplicated, block: B:52:0x0167 A[Catch: all -> 0x0184, TryCatch #2 {, blocks: (B:45:0x0134, B:47:0x0142, B:49:0x0148, B:51:0x015a, B:53:0x0180, B:52:0x0167), top: B:73:0x0134, outer: #0 }] */
            /* JADX WARN: Code duplicated, block: B:70:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:79:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            public final void run() {
                vbx vbxVar;
                HashMap map;
                EGLSurface eGLSurface;
                Integer num;
                Thread thread;
                vbz vbzVar = this.a;
                try {
                    try {
                        agrf agrfVar = vbx.a;
                        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                        EGLContext eGLContextD = EGL14.EGL_NO_CONTEXT;
                        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                            throw new RuntimeException("EGL Error: Bad display: ".concat(String.valueOf(vbx.b())));
                        }
                        int[] iArr = new int[2];
                        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                            throw new RuntimeException("EGL Error: eglInitialize failed ".concat(String.valueOf(vbx.b())));
                        }
                        EGLConfig eGLConfigA = vbx.a(eGLDisplayEglGetDisplay, 2);
                        if (eGLConfigA != null) {
                            try {
                                eGLContextD = vbx.d(eGLDisplayEglGetDisplay, eGLConfigA, 2, eGLContext);
                            } catch (RuntimeException unused) {
                                eGLContextD = EGL14.EGL_NO_CONTEXT;
                            }
                        }
                        if (Objects.equals(eGLContextD, EGL14.EGL_NO_CONTEXT)) {
                            eGLConfigA = vbx.a(eGLDisplayEglGetDisplay, 1);
                            if (eGLConfigA == null) {
                                throw new RuntimeException("Unable to find a suitable EGLConfig");
                            }
                            eGLContextD = vbx.d(eGLDisplayEglGetDisplay, eGLConfigA, 1, eGLContext);
                        }
                        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigA, new int[]{12375, 2, 12374, 2, 12344}, 0);
                        vbx vbxVar2 = new vbx(eGLDisplayEglGetDisplay, eGLContextD, eGLSurfaceEglCreatePbufferSurface);
                        HashMap map2 = vbx.c;
                        Integer num2 = (Integer) map2.get(eGLSurfaceEglCreatePbufferSurface);
                        if (num2 != null) {
                            map2.put(eGLSurfaceEglCreatePbufferSurface, Integer.valueOf(num2.intValue() + 1));
                        } else {
                            map2.put(eGLSurfaceEglCreatePbufferSurface, 1);
                        }
                        vbxVar2.c();
                        int[] iArr2 = new int[1];
                        EGL14.eglQueryContext(eGLDisplayEglGetDisplay, eGLContextD, EglFactory.EGL_CONTEXT_CLIENT_VERSION, iArr2, 0);
                        if (iArr2[0] >= 3) {
                            GLES20.glGetIntegerv(33307, iArr2, 0);
                            GLES20.glGetIntegerv(33308, iArr2, 0);
                        }
                        EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12372);
                        try {
                            vbxVar2.c();
                            vbx.e.set(vbxVar2);
                            vbzVar.e = GLES20.glGetString(7937);
                            vbzVar.f = GLES20.glGetString(7938);
                            vbxVar = vbxVar2;
                        } catch (RuntimeException e) {
                            e = e;
                            vbxVar = vbxVar2;
                            ((agrc) ((agrc) ((agrc) vbz.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl", "collectGlDeviceInfo", (char) 138, "GlDeviceInfoImpl.java")).t("Failed to init GL");
                        }
                        agrf agrfVar2 = vbx.a;
                        EGL14.eglMakeCurrent(EGL14.eglGetCurrentDisplay(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        vbx.d.set(null);
                        tzk.F("eglMakeCurrent");
                        if (vbxVar != null) {
                            try {
                                EGLDisplay eGLDisplay = vbxVar.f;
                                EGL14.eglDestroyContext(eGLDisplay, vbxVar.g);
                                vbxVar.g = EGL14.EGL_NO_CONTEXT;
                                EGL14.eglTerminate(eGLDisplay);
                                map = vbx.b;
                                synchronized (map) {
                                    eGLSurface = vbxVar.h;
                                    HashMap map3 = vbx.c;
                                    num = (Integer) map3.get(eGLSurface);
                                    if (num != null || num.intValue() <= 0) {
                                        ((agrc) ((agrc) vbx.a.b()).k("com/google/android/libraries/youtube/creation/effects/util/FilterRenderTarget", "removeReferenceTo", 397, "FilterRenderTarget.java")).w("Removing reference of already released: %s!", eGLSurface);
                                    } else {
                                        int iIntValue = num.intValue() - 1;
                                        Integer numValueOf = Integer.valueOf(iIntValue);
                                        map3.put(eGLSurface, numValueOf);
                                        numValueOf.getClass();
                                        if (iIntValue == 0) {
                                            EGL14.eglDestroySurface(eGLDisplay, vbxVar.h);
                                            vbxVar.h = EGL14.EGL_NO_SURFACE;
                                            map.remove(null);
                                        }
                                    }
                                }
                            } catch (RuntimeException e2) {
                                ((agrc) ((agrc) ((agrc) vbz.a.b()).j(e2)).k("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl", "collectGlDeviceInfo", (char) 153, "GlDeviceInfoImpl.java")).t("FilterRenderTarget.release failed: ");
                            }
                        }
                        thread = vbzVar.c;
                        synchronized (thread) {
                            vbzVar.d = true;
                            thread.notifyAll();
                            vbzVar.b.quit();
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        vbxVar = null;
                    }
                    agrf agrfVar3 = vbx.a;
                    EGL14.eglMakeCurrent(EGL14.eglGetCurrentDisplay(), EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                    vbx.d.set(null);
                    tzk.F("eglMakeCurrent");
                } catch (RuntimeException e4) {
                    ((agrc) ((agrc) ((agrc) vbz.a.b()).j(e4)).k("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl", "collectGlDeviceInfo", (char) 144, "GlDeviceInfoImpl.java")).t("focusNone failed: ");
                }
                ((agrc) ((agrc) ((agrc) vbz.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl", "collectGlDeviceInfo", (char) 138, "GlDeviceInfoImpl.java")).t("Failed to init GL");
                if (vbxVar != null) {
                    EGLDisplay eGLDisplay2 = vbxVar.f;
                    EGL14.eglDestroyContext(eGLDisplay2, vbxVar.g);
                    vbxVar.g = EGL14.EGL_NO_CONTEXT;
                    EGL14.eglTerminate(eGLDisplay2);
                    map = vbx.b;
                    synchronized (map) {
                        eGLSurface = vbxVar.h;
                        HashMap map4 = vbx.c;
                        num = (Integer) map4.get(eGLSurface);
                        if (num != null) {
                            ((agrc) ((agrc) vbx.a.b()).k("com/google/android/libraries/youtube/creation/effects/util/FilterRenderTarget", "removeReferenceTo", 397, "FilterRenderTarget.java")).w("Removing reference of already released: %s!", eGLSurface);
                        } else {
                            ((agrc) ((agrc) vbx.a.b()).k("com/google/android/libraries/youtube/creation/effects/util/FilterRenderTarget", "removeReferenceTo", 397, "FilterRenderTarget.java")).w("Removing reference of already released: %s!", eGLSurface);
                        }
                    }
                }
                thread = vbzVar.c;
                synchronized (thread) {
                    vbzVar.d = true;
                    thread.notifyAll();
                    vbzVar.b.quit();
                }
            }
        });
    }

    private final void f() {
        Thread thread = this.c;
        synchronized (thread) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (thread.isAlive() && !this.d && !this.h) {
                try {
                    thread.wait(500L);
                } catch (InterruptedException unused) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl", "waitForInit", 116, "GlDeviceInfoImpl.java")).t("Wait interrupted");
                }
                if (System.currentTimeMillis() - jCurrentTimeMillis >= 500) {
                    ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/effects/util/GlDeviceInfoImpl", "waitForInit", 119, "GlDeviceInfoImpl.java")).t("Wait for GlDeviceInfo timed out");
                    this.h = true;
                }
            }
        }
    }

    public final String a() {
        if (b() != null) {
            return this.e;
        }
        f();
        return this.e;
    }

    public final String b() {
        if (this.e == null) {
            e();
        }
        return this.e;
    }

    public final String c() {
        if (d() != null) {
            return this.f;
        }
        f();
        return this.f;
    }

    public final String d() {
        if (this.f == null) {
            e();
        }
        return this.f;
    }
}
