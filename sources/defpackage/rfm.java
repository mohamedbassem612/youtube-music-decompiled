package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfm extends ahxp {
    private final AtomicInteger g;

    public rfm(Object obj, AtomicInteger atomicInteger) {
        super(obj);
        atomicInteger.incrementAndGet();
        this.g = atomicInteger;
    }

    static rfm a(Object obj, AtomicInteger atomicInteger) throws bvn {
        try {
            return new rfm(obj, atomicInteger);
        } catch (ahxq e) {
            bvn bvnVar = new bvn("Failed to create EglManager");
            bvnVar.initCause(e);
            throw bvnVar;
        }
    }

    @Override // defpackage.ahxp
    public final void b() {
        if (this.b != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.a;
            egl10.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroyContext(this.b, this.d);
            egl10.eglTerminate(this.b);
        }
        this.b = EGL10.EGL_NO_DISPLAY;
        this.d = EGL10.EGL_NO_CONTEXT;
        this.c = null;
        this.g.decrementAndGet();
    }
}
