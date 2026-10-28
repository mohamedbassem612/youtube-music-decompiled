package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.cardboard.sdk.EglFactory;
import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vbx {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/util/FilterRenderTarget");
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final ThreadLocal d = new ThreadLocal();
    public static final ThreadLocal e = new ThreadLocal();
    public final EGLDisplay f;
    public EGLContext g;
    public EGLSurface h;

    public vbx(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface) {
        this.f = eGLDisplay;
        this.g = eGLContext;
        this.h = eGLSurface;
    }

    public static EGLConfig a(EGLDisplay eGLDisplay, int i) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, (i != 1 ? 64 : 0) | 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0) || iArr[0] <= 0) {
            return null;
        }
        return eGLConfigArr[0];
    }

    public static String b() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    public static EGLContext d(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, i != 1 ? 3 : 2, 12344}, 0);
        tzk.F("eglCreateContext");
        if (Objects.equals(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("EGL Error: Bad context: ".concat(String.valueOf(b())));
        }
        return eGLContextEglCreateContext;
    }

    public final void c() {
        ThreadLocal threadLocal = d;
        if (((vbx) threadLocal.get()) != this) {
            EGLDisplay eGLDisplay = this.f;
            EGLSurface eGLSurface = this.h;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.g);
            threadLocal.set(this);
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != 0) {
            GLES20.glBindFramebuffer(36160, 0);
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError != 0) {
                throw new RuntimeException("GL Operation 'glBindFramebuffer' caused error " + Integer.toHexString(iGlGetError) + '!');
            }
        }
    }

    public final String toString() {
        return "RenderTarget(" + String.valueOf(this.f) + ", " + String.valueOf(this.g) + ", " + String.valueOf(this.h) + ", 0)";
    }
}
