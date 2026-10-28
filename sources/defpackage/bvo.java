package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.os.Build;
import com.google.cardboard.sdk.EglFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bvo {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12344};

    public static EGLConfig a(EGLDisplay eGLDisplay, int[] iArr) throws bvn {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new bvn("eglChooseConfig failed.");
    }

    public static EGLDisplay b() throws bvn {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        g(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        g(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        e("Error in getDefaultEglDisplay");
        return eGLDisplayEglGetDisplay;
    }

    public static EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) throws bvn {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int[] iArr = a;
        if (k("EGL_KHR_surfaceless_context")) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, a(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            e("Error creating a new EGL Pbuffer surface");
        }
        o(eGLDisplay, eGLContext, eGLSurfaceEglCreatePbufferSurface, 1, 1);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void e(String str) throws bvn {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new bvn(str + ", error code: 0x" + Integer.toHexString(iEglGetError), agke.q(Integer.valueOf(iEglGetError)));
    }

    public static void f() throws bvn {
        StringBuilder sb = new StringBuilder();
        agjz agjzVar = new agjz(4);
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            agjzVar.h(Integer.valueOf(iGlGetError));
            z = true;
        }
        if (z) {
            throw new bvn(sb.toString(), agjzVar.g());
        }
    }

    public static void g(boolean z, String str) throws bvn {
        if (!z) {
            throw new bvn(str);
        }
    }

    public static void h(EGLDisplay eGLDisplay, EGLContext eGLContext) throws bvn {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        e("Error releasing context");
        if (eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        e("Error destroying context");
    }

    public static void i(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws bvn {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        e("Error destroying surface");
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33 && k("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean k(String str) {
        String strEglQueryString = EGL14.eglQueryString(b(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static float[] l() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static void m(int i, int i2) throws bvn {
        GLES20.glBindTexture(i, i2);
        f();
        GLES20.glTexParameteri(i, 10240, 9729);
        f();
        GLES20.glTexParameteri(i, 10241, 9729);
        f();
        GLES20.glTexParameteri(i, 10242, 33071);
        f();
        GLES20.glTexParameteri(i, 10243, 33071);
        f();
    }

    public static void n() throws bvn {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        f();
    }

    public static void o(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) throws bvn {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        e("Error making context current");
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != 0) {
            GLES20.glBindFramebuffer(36160, 0);
        }
        f();
        GLES20.glViewport(0, 0, i, i2);
        f();
        if (eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), EglFactory.EGL_CONTEXT_CLIENT_VERSION, iArr2, 0);
        f();
        if (iArr2[0] >= 3) {
            GLES30.glDrawBuffers(1, new int[]{1029}, 0);
            f();
            GLES30.glReadBuffer(1029);
            f();
        }
    }
}
