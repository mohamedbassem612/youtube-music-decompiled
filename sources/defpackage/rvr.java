package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rvr {
    public final smr a;
    public boolean b;
    public rvp c;
    public final rsk d;
    private final ayq e;

    public rvr(rsk rskVar, smr smrVar, ayq ayqVar) {
        this.d = rskVar;
        this.a = smrVar;
        this.e = ayqVar;
    }

    private final void c() {
        if (this.b) {
            throw new IllegalStateException("Tried to fulfill more than one thing by an adapter");
        }
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void a(agek agekVar, Executor executor, Executor executor2, rvq rvqVar) {
        try {
            c();
            if (this.c != null) {
                this.d.v(this.a, new sau("Already had ongoing fulfillment task", 63), 5);
                return;
            }
            rvp rvpVar = new rvp(this, ahcs.e(ahng.n(this.a), agekVar, executor), rvqVar);
            this.c = rvpVar;
            rvpVar.b.addListener(new rno(rvpVar, 10), executor2);
        } catch (IllegalStateException e) {
            if (!((vxz) this.e.a).m(1, 45378983L)) {
                throw e;
            }
            this.d.v(this.a, new sau(e.toString(), 62), 5);
        }
    }

    public final void b(agek agekVar) {
        c();
        try {
            smr smrVar = this.a;
            this.d.m(smrVar, (sko) agekVar.apply(smrVar));
        } catch (RuntimeException e) {
            rsk rskVar = this.d;
            smr smrVar2 = this.a;
            rskVar.v(smrVar2, new sau(e.getMessage(), 25), 5);
            rmp.k(smrVar2, "Slot failed to be fulfilled.  slot id: " + smrVar2.a + ". msg: " + e.getMessage());
        }
    }
}
