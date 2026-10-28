package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class riy extends rfo {
    public static final /* synthetic */ int f = 0;
    public final Object a;
    public final Set b;
    public final AtomicBoolean c;
    public boolean d;
    public final /* synthetic */ rja e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riy(rja rjaVar, ahxp ahxpVar) {
        super(ahxpVar);
        this.e = rjaVar;
        this.a = new Object();
        this.b = ahng.aj();
        this.c = new AtomicBoolean(false);
        this.d = false;
    }

    public static final void e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            rbc rbcVar = new rbc(rja.d, rbd.d);
            rbcVar.a = th;
            rbcVar.c();
            rbcVar.a("Error while executing a task.", new Object[0]);
        }
    }

    public final void a() {
        synchronized (this.a) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                e((Runnable) it.next());
            }
        }
    }

    public final void b() {
        if (this.c.compareAndSet(false, true)) {
            Handler handler = this.m;
            handler.getClass();
            handler.post(new rhl(this, 15));
        }
    }

    @Override // defpackage.rfo
    public final void d() {
        GLES20.glFinish();
        super.d();
    }
}
