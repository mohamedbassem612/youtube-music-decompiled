package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bqc extends bqi implements Runnable {
    boolean a;
    final /* synthetic */ bqd b;

    public bqc(bqd bqdVar) {
        this.b = bqdVar;
    }

    @Override // defpackage.bqi
    public final Object a() {
        try {
            return this.b.a();
        } catch (aws e) {
            if (f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.bqi
    public final void b(Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.bqi
    public final void c(Object obj) {
        bqd bqdVar = this.b;
        if (bqdVar.a != this) {
            bqdVar.c(this, obj);
            return;
        }
        if (bqdVar.f) {
            bqdVar.f(obj);
            return;
        }
        bqdVar.i = false;
        SystemClock.uptimeMillis();
        bqdVar.a = null;
        bqdVar.j(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.e();
    }
}
