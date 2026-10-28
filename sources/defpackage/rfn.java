package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.os.Handler;
import com.google.cardboard.sdk.EglFactory;
import j$.util.Objects;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfn {
    private static final rbm g = new rbm("rfn");
    public final rfm a;
    private final AtomicInteger b;
    private final AtomicInteger c;
    private final boolean d;
    private final qyt e;
    private final AtomicReference f;

    public rfn(Object obj, boolean z, qyt qytVar) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.b = atomicInteger;
        this.c = new AtomicInteger(0);
        this.f = new AtomicReference();
        this.a = rfm.a(obj, atomicInteger);
        this.d = z;
        this.e = qytVar;
    }

    public final rfl a() {
        String strGlGetString;
        AtomicReference atomicReference = this.f;
        if (atomicReference.get() == null) {
            rfm rfmVar = this.a;
            rbm rbmVar = rfl.c;
            boolean z = false;
            if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                rbc rbcVar = new rbc(rfl.c, rbd.c);
                rbcVar.c();
                rbcVar.a("No EGL context is current when querying GL capabilities. This might get expensive.", new Object[0]);
            }
            int[] iArr = bvo.a;
            if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                try {
                    EGLDisplay eGLDisplayB = bvo.b();
                    EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                    int[] iArr2 = bvo.a;
                    ahno.F(Arrays.equals(iArr2, iArr2) || Arrays.equals(iArr2, bvo.b));
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayB, bvo.a(eGLDisplayB, iArr2), eGLContext, new int[]{EglFactory.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
                    if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                        EGL14.eglTerminate(eGLDisplayB);
                        throw new bvn("eglCreateContext() failed to create a valid context. The device may not support EGL version 2");
                    }
                    bvo.e("Error in createEglContext");
                    bvo.c(eGLContextEglCreateContext, eGLDisplayB);
                    strGlGetString = GLES20.glGetString(7939);
                    bvo.h(eGLDisplayB, eGLContextEglCreateContext);
                } catch (bvn unused) {
                }
            } else {
                strGlGetString = GLES20.glGetString(7939);
            }
            if (strGlGetString != null && strGlGetString.contains("GL_EXT_YUV_target")) {
                z = true;
            }
            atomicReference.set(new rfl(z, rfmVar.e));
        }
        return (rfl) this.f.get();
    }

    public final rfm b() {
        return rfm.a(this.a.d, this.b);
    }

    public final rgf c(Handler handler, int i, int i2) {
        return new rgf(handler, i, i2, this.c);
    }

    public final rjc d(String str) {
        return new rix(b(), str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    public final void e() {
        boolean z;
        boolean z2;
        if (this.d) {
            this.a.b();
        }
        AtomicInteger atomicInteger = this.b;
        AtomicInteger atomicInteger2 = this.c;
        int i = atomicInteger.get();
        int i2 = atomicInteger2.get();
        if (i != 0) {
            rbc rbcVar = new rbc(g, rbd.e);
            rbcVar.c();
            rbcVar.d("[LEAK!] GlResourceManager is released with active egl context count: %d and active texture count: %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rbcVar.a("[LEAK!] GlResourceManager is released with active egl context>0:%s and active texture count>0:%s", boolValueOf, Boolean.valueOf(z2));
        } else if (i2 != 0) {
            i = 0;
            rbc rbcVar2 = new rbc(g, rbd.e);
            rbcVar2.c();
            rbcVar2.d("[LEAK!] GlResourceManager is released with active egl context count: %d and active texture count: %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z);
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rbcVar2.a("[LEAK!] GlResourceManager is released with active egl context>0:%s and active texture count>0:%s", boolValueOf2, Boolean.valueOf(z2));
        } else {
            i2 = 0;
            i = 0;
        }
        new rbc(g, rbd.a).a("GlResourceManager is released with %d active egl contexts and %d active textures", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
