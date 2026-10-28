package defpackage;

import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fmx {
    public final AtomicReference a = new AtomicReference();
    private Runnable b;
    private Choreographer.FrameCallback c;

    public final Choreographer.FrameCallback a() {
        if (this.c == null) {
            this.c = new fmw(this);
        }
        return this.c;
    }

    public final Runnable b() {
        if (this.b == null) {
            this.b = new dxk(this, 5, null);
        }
        return this.b;
    }

    public abstract void c(long j);

    public final void d(long j) {
        this.a.getAndSet(null);
        fmb fmbVar = fhz.h;
        try {
            c(j);
            fmb fmbVar2 = fhz.h;
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                fmb fmbVar3 = fhz.h;
            }
        }
    }
}
