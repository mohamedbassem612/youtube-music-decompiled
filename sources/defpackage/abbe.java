package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class abbe implements GLSurfaceView.EGLWindowSurfaceFactory {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/player/features/gl/GlWindowFactory");
    private static final int[] d = {13121, 13122, 13123, 13124, 13125, 13126, 13127, 13128};
    public final int a;
    public boolean b;
    private boolean e;
    private boolean f;
    private boolean g;
    private String h;
    private yib i = yib.c;
    private yia j = yia.c;
    private kjs k;
    private kjs l;

    public abbe(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        this.e = context.getResources().getConfiguration().isScreenWideColorGamut();
        kjs kjsVar = new kjs(0);
        this.l = kjsVar;
        kjsVar.p(12344, 12344);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int iMax = 500;
        if (windowManager != null && (hdrCapabilities = windowManager.getDefaultDisplay().getHdrCapabilities()) != null) {
            iMax = Math.max((int) hdrCapabilities.getDesiredMaxLuminance(), 500);
        }
        this.a = iMax;
    }

    public final yia a() {
        return this.b ? this.j : yia.c;
    }

    public final yib b() {
        return this.b ? this.i : yib.c;
    }

    public final void c() {
        if (this.b) {
            EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
            EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
            if (this.f) {
                int i = this.a * 50000;
                EGL14.eglSurfaceAttrib(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, 13152, i);
                EGL14.eglSurfaceAttrib(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, 13153, i / 3);
            }
            if (this.g) {
                EGL14.eglSurfaceAttrib(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, 13129, this.a * 50000);
                EGL14.eglSurfaceAttrib(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, 13130, 0);
                int i2 = 8;
                while (i2 > 0) {
                    i2--;
                    EGL14.eglSurfaceAttrib(eGLDisplayEglGetCurrentDisplay, eGLSurfaceEglGetCurrentSurface, d[i2], (int) (abcf.a[i2] * 50000.0f));
                }
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public final javax.microedition.khronos.egl.EGLSurface createWindowSurface(EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (int[]) ((this.b && this.e) ? this.k : this.l).b);
    }

    public final void d(boolean z) {
        int i;
        this.b = z;
        if (z && this.h == null) {
            String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            this.h = strEglQueryString;
            if (this.e) {
                if (strEglQueryString == null || !strEglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    String str = this.h;
                    if (str == null || !str.contains("EGL_EXT_gl_colorspace_display_p3") || Build.VERSION.SDK_INT > 28) {
                        this.e = false;
                        this.b = false;
                        this.i = yib.c;
                        this.j = yia.c;
                        ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/player/features/gl/GlWindowFactory", "useHdrPrimaries", 129, "GlWindowFactory.java")).E("%s: %s %s", "GlWindowFactory", this.j, this.i);
                        if (this.h == null) {
                            throw new abbx("c.GlExtensions_null");
                        }
                        return;
                    }
                    this.j = yia.b;
                    this.i = yib.c;
                    i = 13155;
                } else {
                    this.j = yia.a;
                    this.i = yib.a;
                    i = 13120;
                }
                kjs kjsVar = new kjs(1);
                this.k = kjsVar;
                kjsVar.p(12445, i);
                this.k.p(12344, 12344);
                kjs kjsVar2 = new kjs(1);
                this.l = kjsVar2;
                kjsVar2.p(12445, 12426);
                this.l.p(12344, 12344);
                this.f = this.h.contains("EGL_EXT_surface_CTA861_3_metadata");
                this.g = this.h.contains("EGL_EXT_surface_SMPTE2086_metadata");
            } else {
                this.i = yib.c;
                this.j = yia.b;
            }
            ((agrc) ((agrc) c.b()).k("com/google/android/libraries/youtube/player/features/gl/GlWindowFactory", "useHdrPrimaries", 151, "GlWindowFactory.java")).E("%s: %s %s", "GlWindowFactory", this.j, this.i);
        }
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public final void destroySurface(EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }
}
