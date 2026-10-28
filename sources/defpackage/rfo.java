package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class rfo extends Thread {
    private static final rbm e = rbm.c(rfo.class);
    private boolean b;
    private boolean c;
    public final ahxp l;
    private final Object a = new Object();
    private EGLSurface d = null;
    public Handler m = null;
    public Looper n = null;
    public int o = 0;

    public rfo(ahxp ahxpVar) {
        this.l = ahxpVar;
    }

    public void c() {
        ahxp ahxpVar = this.l;
        EGLSurface eGLSurfaceG = ahxpVar.g();
        this.d = eGLSurfaceG;
        ahxpVar.e(eGLSurfaceG, eGLSurfaceG);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.o = iArr[0];
    }

    public void d() {
        int i = this.o;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.o = 0;
        }
        ahxp ahxpVar = this.l;
        if (!ahxpVar.a.eglMakeCurrent(ahxpVar.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
        EGLSurface eGLSurface = this.d;
        if (eGLSurface != null) {
            ahxpVar.f(eGLSurface);
            this.d = null;
        }
    }

    public final void g(int i, int i2, int i3) throws bvn {
        GLES20.glBindFramebuffer(36160, this.o);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            throw new bvn(a.bR(iGlCheckFramebufferStatus, "Framebuffer not complete, status="));
        }
        GLES20.glViewport(0, 0, i2, i3);
        rgi.c("checkGlError");
    }

    public final boolean h() {
        Object obj = this.a;
        synchronized (obj) {
            while (!this.b) {
                obj.wait();
            }
        }
        return this.c;
    }

    public final void i() {
        Looper looper = this.n;
        if (looper != null) {
            looper.quitSafely();
            return;
        }
        rbc rbcVar = new rbc(e, rbd.c);
        rbcVar.c();
        rbcVar.a("Failed to quit the GL thread %s. Looper is null.", getName());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                Looper.prepare();
                this.m = new Handler();
                this.n = Looper.myLooper();
                rbm rbmVar = e;
                new rbc(rbmVar, rbd.a).a("Starting GL thread %s", getName());
                c();
                this.c = true;
                Object obj = this.a;
                synchronized (obj) {
                    this.b = true;
                    obj.notify();
                }
                try {
                    Looper.loop();
                    this.n = null;
                    d();
                    this.l.b();
                    new rbc(rbmVar, rbd.a).a("Stopping GL thread %s", getName());
                } catch (Throwable th) {
                    this.n = null;
                    d();
                    this.l.b();
                    new rbc(e, rbd.a).a("Stopping GL thread %s", getName());
                    throw th;
                }
            } catch (RuntimeException e2) {
                d();
                this.l.b();
                throw e2;
            }
        } catch (Throwable th2) {
            Object obj2 = this.a;
            synchronized (obj2) {
                this.b = true;
                obj2.notify();
                throw th2;
            }
        }
    }
}
