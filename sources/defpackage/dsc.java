package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dsc extends dsb {
    final /* synthetic */ afv a;
    final /* synthetic */ dsd b;

    public dsc(dsd dsdVar, afv afvVar) {
        this.b = dsdVar;
        this.a = afvVar;
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void a(dsa dsaVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(dsaVar);
        dsaVar.F(this);
    }

    @Override // defpackage.dsb, defpackage.drx
    public final void b(dsa dsaVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(dsaVar);
        dsaVar.F(this);
    }
}
