package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rlc implements avmn {
    public final Object a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final avlr d;
    private final avmn e;
    private final avlr f;
    private final vze g;

    public rlc(vze vzeVar) {
        vzeVar.getClass();
        this.g = vzeVar;
        this.a = new Object();
        int i = 0;
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference();
        avlr avlrVarD = vzeVar.b.K(new ibj(new prq(5), 16)).r().x(new rlb(new rla(this, i), 1)).ap().d();
        this.f = avlrVarD;
        this.e = avlrVarD.ag(new rlb(new prq(6), i), new rlb(new prq(7), 2));
        this.d = avlrVarD.K(new ibj(new prq(8), 17));
    }

    public final boolean a() {
        akxt akxtVar = (akxt) this.c.get();
        if (akxtVar != null) {
            return akxtVar.b;
        }
        return false;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        synchronized (this.a) {
            this.b.set(true);
        }
        avnr.b((AtomicReference) this.e);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.b.get();
    }
}
