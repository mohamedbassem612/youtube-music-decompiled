package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bws implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bws(Object obj, AtomicBoolean atomicBoolean, boolean z, boolean z2, int i) {
        this.$cid = i;
        this.d = obj;
        this.a = atomicBoolean;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        AtomicBoolean atomicBoolean = this.a;
        if (i != 0) {
            atomicBoolean.set(false);
            ((bwq) this.d).a.k(this.b, this.c);
            return;
        }
        atomicBoolean.set(false);
        ((bwt) this.d).a.i(this.b, this.c);
    }
}
