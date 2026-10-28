package defpackage;

import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hk extends nh {
    public final hj a;
    private final ed e;

    protected hk() {
        ed edVar = new ed();
        this.e = edVar;
        hm hmVar = new hm(this);
        synchronized (hh.a) {
            if (hh.b == null) {
                hh.b = Executors.newFixedThreadPool(2);
            }
        }
        hj hjVar = new hj(hmVar, new zf(hh.b));
        this.a = hjVar;
        hjVar.c.add(edVar);
    }

    @Override // defpackage.nh
    public final int a() {
        return this.a.e.size();
    }
}
