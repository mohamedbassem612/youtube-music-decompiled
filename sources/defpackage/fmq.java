package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fmq extends fms {
    private final fmo a;
    private final fns b;

    public fmq(fmo fmoVar, fns fnsVar) {
        this.a = fmoVar;
        this.b = fnsVar;
    }

    @Override // defpackage.fmj
    public final void c(ArrayList arrayList) {
        arrayList.add(this.a);
    }

    @Override // defpackage.fms
    protected final void m(hhb hhbVar) {
        fnn fnnVar = new fnn(this.b);
        fmo fmoVar = this.a;
        fmp fmpVar = fmoVar.a;
        fng fngVar = new fng(hhbVar.q(fmpVar));
        fng fngVar2 = new fng(fmoVar.b);
        o(fngVar, fnnVar, "initial");
        o(fngVar2, fnnVar, "end");
        n(fnnVar, hhbVar.r(fmpVar));
    }
}
