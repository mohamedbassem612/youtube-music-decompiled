package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bop extends boo {
    @Override // defpackage.boo
    public void h(Object obj) {
        boo.a("setValue");
        this.g++;
        this.e = obj;
        b(null);
    }

    public final void i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.f;
            obj3 = boo.a;
            this.f = obj;
        }
        if (obj2 == obj3) {
            Runnable runnable = this.h;
            dl dlVar = vq.q().b;
            vr vrVar = (vr) dlVar;
            if (vrVar.c == null) {
                synchronized (vrVar.a) {
                    if (((vr) dlVar).c == null) {
                        ((vr) dlVar).c = vr.q(Looper.getMainLooper());
                    }
                }
            }
            vrVar.c.post(runnable);
        }
    }
}
