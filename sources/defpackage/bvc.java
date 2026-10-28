package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvc {
    public final bvq a;
    public Object b;
    public Object c;
    public int d;
    private final bvq e;
    private final bvb f;

    public bvc(Object obj, Looper looper, Looper looper2, bvd bvdVar, bvb bvbVar) {
        this.e = bvdVar.d(looper, null);
        this.a = bvdVar.d(looper2, null);
        this.b = obj;
        this.c = obj;
        this.f = bvbVar;
    }

    public final Object a() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.a.a()) {
            return this.b;
        }
        if (looperMyLooper == this.e.a()) {
            return this.c;
        }
        throw new IllegalStateException();
    }

    public final void b(Runnable runnable) {
        bvq bvqVar = this.e;
        if (bvqVar.a().getThread().isAlive()) {
            bvqVar.d(runnable);
        }
    }

    public final void c(Runnable runnable) {
        bvq bvqVar = this.a;
        if (bvqVar.a().getThread().isAlive()) {
            bvqVar.d(runnable);
        }
    }

    public final void d(Object obj) {
        this.c = obj;
        c(new br(this, obj, 7, (byte[]) null));
    }

    public final void e(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f.a(obj2, obj);
    }
}
