package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.cardboard.sdk.EglFactory;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdi extends rfo {
    public static final rbm k = new rbm("rdi");
    private static final int[] p = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public final rdh a;
    public EGLSurface b;
    public Size c;
    public EGLDisplay d;
    public Surface e;
    bvm f;
    public EGLContext g;
    public rfs h;
    final float[] i;
    volatile int j;
    private final Context q;
    private final boolean r;

    public rdi(ahxp ahxpVar, Surface surface, Size size, Context context, rdh rdhVar, boolean z) {
        super(ahxpVar);
        this.j = 1;
        this.i = new float[16];
        this.e = surface;
        this.c = size;
        this.q = context;
        this.a = rdhVar;
        this.r = z;
    }

    public final void a() {
        try {
            bvo.n();
            EGLExt.eglPresentationTimeANDROID(this.d, this.b, System.nanoTime());
            EGL14.eglSwapBuffers(this.d, this.b);
        } catch (bvn | IllegalStateException e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Error while clearing output surface. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(this.o), Integer.valueOf(this.c.getWidth()), Integer.valueOf(this.c.getHeight()));
        }
    }

    public final void b() {
        try {
            bvo.i(this.d, this.b);
        } catch (bvn e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("Could not destroy the previous EglSurface", new Object[0]);
        }
        if (e()) {
            try {
                this.b = bvo.c(this.g, this.d);
                return;
            } catch (bvn e2) {
                rbc rbcVar2 = new rbc(k, rbd.e);
                rbcVar2.a = e2;
                rbcVar2.c();
                rbcVar2.a("Could not create focused placeholder EGLSurface", new Object[0]);
                return;
            }
        }
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, bvo.a(eGLDisplay, bvo.a), this.e, bvo.c, 0);
            bvo.e("Error creating a new EGL surface");
            this.b = eGLSurfaceEglCreateWindowSurface;
            bvo.o(this.d, this.g, eGLSurfaceEglCreateWindowSurface, this.c.getWidth(), this.c.getHeight());
        } catch (bvn e3) {
            rbc rbcVar3 = new rbc(k, rbd.e);
            rbcVar3.a = e3;
            rbcVar3.c();
            rbcVar3.a("Could not create convert the provided surface into EGLSurface. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(this.o), Integer.valueOf(this.c.getWidth()), Integer.valueOf(this.c.getHeight()));
        }
    }

    @Override // defpackage.rfo
    public final void c() {
        EGLContext eGLContextEglCreateContext;
        try {
            this.d = bvo.b();
            ahxp ahxpVar = this.l;
            int[] iArr = {EglFactory.EGL_CONTEXT_CLIENT_VERSION, ahxpVar.e, 12344};
            if (this.r) {
                eGLContextEglCreateContext = ahxpVar.c();
            } else {
                EGLDisplay eGLDisplay = this.d;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(eGLDisplay, p, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new bvn("eglChooseConfig failed.");
                }
                eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfigArr[0], ahxpVar.c(), iArr, 0);
            }
            this.g = eGLContextEglCreateContext;
            b();
            this.f = new bvm(this.q, "shaders/me_vertex_shader_es2.glsl", "shaders/me_fragment_shader_es2.glsl");
            float[] fArr = this.i;
            Matrix.setIdentityM(fArr, 0);
            this.f.f("uTexTransformationMatrix", fArr);
            this.f.f("uTransformationMatrix", fArr);
            this.f.k(1.0f);
            GLES20.glEnable(2929);
            GLES20.glDepthFunc(513);
            GLES20.glBlendFunc(1, 771);
            GLES20.glEnable(3042);
        } catch (bvn | IOException e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.d("Error preparing rendering thread GL. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(this.o), Integer.valueOf(this.c.getWidth()), Integer.valueOf(this.c.getHeight()));
            rbcVar.a("Error preparing rendering thread GL.", new Object[0]);
            throw new agfz(e);
        }
    }

    @Override // defpackage.rfo
    public final void d() {
        try {
            bvm bvmVar = this.f;
            if (bvmVar != null) {
                bvmVar.e();
            }
        } catch (bvn e) {
            rbc rbcVar = new rbc(k, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.d("Error deleting GlProgram resources. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(this.o), Integer.valueOf(this.c.getWidth()), Integer.valueOf(this.c.getHeight()));
            rbcVar.a("Error deleting GlProgram resources.", new Object[0]);
        }
        try {
            EGLSurface eGLSurface = this.b;
            if (eGLSurface != null) {
                bvo.i(this.d, eGLSurface);
            }
            EGLContext eGLContext = this.g;
            if (eGLContext != null && !this.r) {
                bvo.h(this.d, eGLContext);
            }
        } catch (bvn e2) {
            rbc rbcVar2 = new rbc(k, rbd.e);
            rbcVar2.a = e2;
            rbcVar2.c();
            rbcVar2.a("Error releasing EGL resources. FrameBuffer: %d, outputWidth: %d, outputHeight: %d", Integer.valueOf(this.o), Integer.valueOf(this.c.getWidth()), Integer.valueOf(this.c.getHeight()));
        }
        this.b = null;
        this.g = null;
        this.d = null;
    }

    public final boolean e() {
        return this.e == null;
    }

    public final boolean f(Runnable runnable) {
        return this.m.post(afwl.i(new rcu(runnable, 5)));
    }
}
