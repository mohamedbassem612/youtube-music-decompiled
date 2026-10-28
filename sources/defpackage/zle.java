package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zle {
    public EGLDisplay a;
    public EGLContext b;
    public Surface c;
    private int d;
    private EGLConfig e;
    private EGLSurface f;
    private final int[] g = new int[1];

    public final void a() throws zlj {
        ahno.O(this.d > 0);
        EGLDisplay eGLDisplay = this.a;
        if (eGLDisplay == null) {
            throw new zlj("eglDisplay must be created first");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12352, this.d == 2 ? 4 : 64, 12344}, 0, eGLConfigArr, 0, 1, this.g, 0)) {
            yno.ao("createEglConfig: eglChooseConfig#2");
            throw new zlj("eglChooseConfig#2 failed");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, this.d, 12344}, 0);
        if (eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            yno.ao("createEglContext");
            throw new zlj("eglCreateContext failed");
        }
        this.e = eGLConfig;
        this.b = eGLContextEglCreateContext;
    }

    public final void b() throws zlj {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            throw new zlj("eglGetDisplay failed");
        }
        int[] iArr = this.g;
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 0)) {
            this.a = eGLDisplayEglGetDisplay;
        } else {
            yno.ao("createEglDisplay: eglInitialize");
            throw new zlj("eglInitialize failed");
        }
    }

    public final void c(Surface surface) {
        EGLConfig eGLConfig;
        EGLDisplay eGLDisplay = this.a;
        if (eGLDisplay == null || this.e == null) {
            throw new zlj("eglDisplay and eglConfig must be created first");
        }
        if (this.c != surface) {
            EGLSurface eGLSurface = this.f;
            if (eGLSurface != null) {
                if (!EGL14.eglDestroySurface(eGLDisplay, eGLSurface)) {
                    yno.ao("createEglSurface: eglDestroySurface");
                    throw new zlj("eglDestroySurface failed");
                }
                EGLDisplay eGLDisplay2 = this.a;
                if (eGLDisplay2 == null) {
                    throw new zlj("eglDisplay must be created first");
                }
                if (!EGL14.eglMakeCurrent(eGLDisplay2, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
                    yno.ao("makeNothingCurrentCurrent");
                    throw new zlj("eglMakeCurrent failed");
                }
                this.f = null;
                this.c = null;
            }
            EGLDisplay eGLDisplay3 = this.a;
            if (eGLDisplay3 == null || (eGLConfig = this.e) == null) {
                throw new zlj("eglDisplay and eglConfig must be created first");
            }
            if (surface != null) {
                EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay3, eGLConfig, surface, new int[]{12344}, 0);
                if (eGLSurfaceEglCreateWindowSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    yno.ao("createEglSurface: eglCreateWindowSurface");
                    throw new zlj("eglCreateWindowSurface failed");
                }
                this.f = eGLSurfaceEglCreateWindowSurface;
                this.c = surface;
            }
        }
    }

    public final void d() throws zlj {
        EGLContext eGLContext;
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.a;
        if (eGLDisplay == null || (eGLContext = this.b) == null || (eGLSurface = this.f) == null) {
            throw new zlj("eglDisplay, eglContext, and eglSurface must be created first");
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return;
        }
        yno.ao("makeCurrent");
        throw new zlj("eglMakeCurrent failed");
    }

    public final void e() throws zlj {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.a;
        if (eGLDisplay == null || (eGLSurface = this.f) == null) {
            throw new zlj("eglDisplay and eglSurface must be created first");
        }
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            if (iEglGetError != 12302) {
                yno.ao("swapBuffers");
            } else {
                this.b = null;
            }
        }
    }

    public final void f() {
        this.d = 2;
    }
}
