package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;
import com.google.cardboard.sdk.EglFactory;
import com.google.mediapipe.framework.Compat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ahxp {
    public final EGL10 a;
    public EGLDisplay b;
    public int e;
    private final int[] g;
    public EGLConfig c = null;
    public EGLContext d = EGL10.EGL_NO_CONTEXT;
    public long f = 0;
    private android.opengl.EGLContext h = null;

    public ahxp(Object obj) {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        EGLContext eGLContextEglGetCurrentContext;
        EGLContext eGLContext;
        this.b = EGL10.EGL_NO_DISPLAY;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
        int[] iArr = new int[1];
        this.g = iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.b = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (!egl10.eglInitialize(this.b, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        try {
            if (obj == null) {
                eGLContext = EGL10.EGL_NO_CONTEXT;
            } else {
                if (!(obj instanceof EGLContext)) {
                    if (!(obj instanceof android.opengl.EGLContext)) {
                        throw new RuntimeException("invalid parent context: ".concat(obj.toString()));
                    }
                    if (obj == EGL14.EGL_NO_CONTEXT) {
                        eGLContext = EGL10.EGL_NO_CONTEXT;
                    } else {
                        android.opengl.EGLContext eGLContext2 = (android.opengl.EGLContext) obj;
                        android.opengl.EGLContext eGLContextEglGetCurrentContext2 = EGL14.eglGetCurrentContext();
                        android.opengl.EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
                        EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
                        EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12378);
                        android.opengl.EGLDisplay eGLDisplayEglGetDisplay2 = EGL14.eglGetDisplay(0);
                        if (eGLContextEglGetCurrentContext2.equals(eGLContext2)) {
                            eGLSurface = eGLSurfaceEglGetCurrentSurface2;
                            eGLSurface2 = eGLSurfaceEglGetCurrentSurface;
                        } else {
                            int[] iArr2 = {12375, 1, 12374, 1, 12344};
                            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
                            eGLSurface2 = eGLSurfaceEglGetCurrentSurface;
                            eGLSurface = eGLSurfaceEglGetCurrentSurface2;
                            if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay2, new int[]{12339, 5, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                                throw new IllegalArgumentException("eglChooseConfig failed");
                            }
                            if (iArr[0] <= 0) {
                                throw new IllegalArgumentException("No configs match requested attributes");
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetCurrentDisplay, eGLConfigArr[0], iArr2, 0);
                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext2);
                        }
                        eGLContextEglGetCurrentContext = egl10.eglGetCurrentContext();
                        if (!eGLContextEglGetCurrentContext2.equals(eGLContext2)) {
                            EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurface2, eGLSurface, eGLContextEglGetCurrentContext2);
                            EGL14.eglDestroySurface(eGLDisplayEglGetDisplay2, eGLSurfaceEglCreatePbufferSurface);
                        }
                    }
                    a(eGLContextEglGetCurrentContext, 3);
                    this.e = 3;
                    return;
                }
                eGLContext = (EGLContext) obj;
            }
            a(eGLContextEglGetCurrentContext, 3);
            this.e = 3;
            return;
        } catch (RuntimeException e) {
            Log.w("EglManager", "could not create GLES 3 context: ".concat(e.toString()));
            a(eGLContextEglGetCurrentContext, 2);
            this.e = 2;
            return;
        }
        eGLContextEglGetCurrentContext = eGLContext;
    }

    private final void a(EGLContext eGLContext, int i) {
        EGLConfig eGLConfig;
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, i == 3 ? 64 : 4, 12339, 5, 12344};
        int[] iArr2 = this.g;
        EGL10 egl10 = this.a;
        if (!egl10.eglChooseConfig(this.b, iArr, null, 0, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i2 = iArr2[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match requested attributes");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!egl10.eglChooseConfig(this.b, iArr, eGLConfigArr, i2, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i3];
            int iH = h(eGLConfig, 12324);
            int iH2 = h(eGLConfig, 12323);
            int iH3 = h(eGLConfig, 12322);
            int iH4 = h(eGLConfig, 12321);
            if (iH == 8 && iH2 == 8 && iH3 == 8 && iH4 == 8) {
                break;
            } else {
                i3++;
            }
        }
        if (eGLConfig == null) {
            eGLConfig = eGLConfigArr[0];
        }
        this.c = eGLConfig;
        if (eGLConfig == null) {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(this.b, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, i, 12344});
        this.d = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL10.EGL_NO_CONTEXT) {
            int iEglGetError = egl10.eglGetError();
            String hexString = Integer.toHexString(iEglGetError);
            StringBuilder sb = new StringBuilder("Could not create GL context: EGL error: 0x");
            sb.append(hexString);
            sb.append(iEglGetError == 12294 ? ": parent context uses a different version of OpenGL" : "");
            throw new RuntimeException(sb.toString());
        }
    }

    private final int h(EGLConfig eGLConfig, int i) {
        int[] iArr = this.g;
        if (this.a.eglGetConfigAttrib(this.b, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    public void b() {
        throw null;
    }

    public final android.opengl.EGLContext c() {
        if (this.h == null) {
            d();
        }
        return this.h;
    }

    public final void d() {
        javax.microedition.khronos.egl.EGLSurface eGLSurfaceG;
        EGL10 egl10 = this.a;
        EGLContext eGLContextEglGetCurrentContext = egl10.eglGetCurrentContext();
        EGLDisplay eGLDisplayEglGetCurrentDisplay = egl10.eglGetCurrentDisplay();
        javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglGetCurrentSurface = egl10.eglGetCurrentSurface(12377);
        javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglGetCurrentSurface2 = egl10.eglGetCurrentSurface(12378);
        if (eGLContextEglGetCurrentContext != this.d) {
            eGLSurfaceG = g();
            e(eGLSurfaceG, eGLSurfaceG);
        } else {
            eGLSurfaceG = null;
        }
        this.f = Compat.getCurrentNativeEGLContext();
        this.h = EGL14.eglGetCurrentContext();
        if (eGLContextEglGetCurrentContext != this.d) {
            egl10.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, eGLSurfaceEglGetCurrentSurface2, eGLContextEglGetCurrentContext);
            f(eGLSurfaceG);
        }
    }

    public final void e(javax.microedition.khronos.egl.EGLSurface eGLSurface, javax.microedition.khronos.egl.EGLSurface eGLSurface2) {
        if (!this.a.eglMakeCurrent(this.b, eGLSurface, eGLSurface2, this.d)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void f(javax.microedition.khronos.egl.EGLSurface eGLSurface) {
        this.a.eglDestroySurface(this.b, eGLSurface);
    }

    public final javax.microedition.khronos.egl.EGLSurface g() {
        EGL10 egl10 = this.a;
        javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(this.b, this.c, new int[]{12375, 1, 12374, 1, 12344});
        int iEglGetError = egl10.eglGetError();
        if (iEglGetError != 12288) {
            throw new RuntimeException("eglCreatePbufferSurface: EGL error: 0x".concat(String.valueOf(Integer.toHexString(iEglGetError))));
        }
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
