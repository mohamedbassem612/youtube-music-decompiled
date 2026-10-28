package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awkq implements avlw, avmn {
    public final mjb b;
    public volatile fgy d;
    public volatile boolean e;
    final AtomicReference a = new AtomicReference();
    public final Object c = new Object();

    public awkq(mjb mjbVar) {
        this.b = mjbVar;
    }

    @Override // defpackage.avlw
    public final void b(Throwable th) {
        throw awkh.b(th);
    }

    @Override // defpackage.avlw
    public final void d(avmn avmnVar) {
        atqp.A(this.a, avmnVar, getClass());
    }

    @Override // defpackage.avmn
    public final void dispose() {
        avnr.b(this.a);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.a.get() == avnr.DISPOSED;
    }

    @Override // defpackage.avlw
    public final /* bridge */ /* synthetic */ void kk(Object obj) {
        Pair pair = (Pair) obj;
        if (f()) {
            return;
        }
        synchronized (this.c) {
            this.d = (fgy) pair.first;
            if (this.e && !f()) {
                fhd fhdVar = (fhd) pair.second;
                Handler handler = mjc.a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    int i = mis.w;
                    if (fhdVar.c != null) {
                        fhdVar.z(new aero(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                    }
                } else {
                    int i2 = mis.w;
                    if (fhdVar.c != null) {
                        fhdVar.x(new aero(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
                    }
                }
            }
        }
    }

    @Override // defpackage.avlw
    public final void kn() {
    }
}
