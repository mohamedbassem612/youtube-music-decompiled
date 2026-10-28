package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class grb implements gno {
    final /* synthetic */ Optional a;
    final /* synthetic */ grf b;

    public grb(grf grfVar, Optional optional) {
        this.a = optional;
        this.b = grfVar;
    }

    @Override // defpackage.gno
    public final void a() {
        isi isiVar;
        grf grfVar = this.b;
        if (kro.M(grfVar) || (isiVar = grfVar.P) == null) {
            return;
        }
        isiVar.l();
        grfVar.P.p();
    }

    @Override // defpackage.gno
    public final void b() {
        this.b.ab(this.a);
    }
}
